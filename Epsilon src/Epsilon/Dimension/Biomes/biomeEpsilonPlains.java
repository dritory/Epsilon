package Epsilon.Dimension.Biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class biomeEpsilonPlains extends BiomeGenBase {

    public biomeEpsilonPlains(int par1) {
        super(par1);
        this.topBlock = (byte)Block.grass.blockID;;        
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.fillerBlock = (byte)Block.dirt.blockID;
        this.color = 330066;
        
    }

}
