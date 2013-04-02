package Epsilon.blocks;

import java.util.Random;

import Epsilon.Dimension.TeleporterEpsilon;
import Epsilon.library.Dimension_Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockChaosInfusedStone extends Block {

    public BlockChaosInfusedStone(int ID) {
        super(ID, Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(1.5F);
        this.setTickRandomly(true);
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return EpsilonBlocksInitialization.chaosCrystal.blockID;
    }

    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {

     }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
            return null;
    }
    
    @Override
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)     {
        {
            
            if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null)
            {
             if (par5Entity instanceof EntityPlayerMP)
             {
              EntityPlayerMP thePlayer = (EntityPlayerMP) par5Entity;
             
              if (par5Entity.dimension != Dimension_Reference.DimetionID)
              {
               thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, Dimension_Reference.DimetionID, new TeleporterEpsilon(thePlayer.mcServer.worldServerForDimension(Dimension_Reference.DimetionID)));
              }
              else
              {
               thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterEpsilon(thePlayer.mcServer.worldServerForDimension(0)));
              }
             }
            }
        }
    }
    
    public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4) {
        return false;
    
    }
    
    }
