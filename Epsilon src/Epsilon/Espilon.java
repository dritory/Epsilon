package Epsilon;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import Epsilon.Dimension.WorldProviderEpsilon;
import Epsilon.Dimension.Biomes.biomeEpsilonPlains;
import Epsilon.blocks.EpsilonBlocksInitialization;
import Epsilon.common.CommonProxy;
import Epsilon.library.Dimension_Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Espilon", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Espilon {


    // The instance of your mod that Forge uses.
    @Instance("Espilon")
    public static Espilon instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "Epsilon.client.ClientProxy", serverSide = "Epsilon.common.CommonProxy")
    public static CommonProxy proxy;
    
    public static BiomeGenBase EpsilonPlains;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        // Stub Method
    }

    @Init
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
        DimensionManager.registerProviderType(Dimension_Reference.DimetionID, WorldProviderEpsilon.class, false);
        DimensionManager.registerDimension(Dimension_Reference.DimetionID, Dimension_Reference.DimetionID);
        
        EpsilonPlains = new biomeEpsilonPlains(30).setColor(330033).setBiomeName("Epsilon Plains");
        
        EpsilonBlocksInitialization.init();
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        // Stub Method
    }

}
