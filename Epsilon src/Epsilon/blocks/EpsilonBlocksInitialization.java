package Epsilon.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class EpsilonBlocksInitialization {

    public static Block chaosCrystal;
    public static Block chaosInfusedStone;

    public static void init() {
        chaosCrystal = new BlockChaosCrystal(500).setUnlocalizedName("ChaosCrystal");
        chaosInfusedStone = new BlockChaosInfusedStone(501).setUnlocalizedName("ChaosInfusedStone");

        GameRegistry.registerBlock(chaosCrystal, "Chaos Crystal");
        GameRegistry.registerBlock(chaosInfusedStone, "Chaos Infused Stone");

        LanguageRegistry.addName(chaosCrystal, "Chaos Crystal");
        LanguageRegistry.addName(chaosInfusedStone, "Chaos Infused Stone");
    }

}
