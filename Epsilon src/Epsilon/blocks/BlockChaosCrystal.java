package Epsilon.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import Epsilon.library.RenderIDs;
import Epsilon.tilenentity.TileChaosCrystal;

public class BlockChaosCrystal extends EpsilonBlocks {

    public BlockChaosCrystal(int ID) {
        super(ID, Material.rock);
        setHardness(1.5F);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileChaosCrystal();
    }

    @Override
    public boolean renderAsNormalBlock() {

        return false;
    }

    @Override
    public boolean isOpaqueCube() {

        return false;
    }

    @Override
    public int getRenderType() {
        return RenderIDs.ChaosCrystalRender;
    }



}
