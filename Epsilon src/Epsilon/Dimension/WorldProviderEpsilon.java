package Epsilon.Dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import Epsilon.Espilon;
import Epsilon.library.Dimension_Reference;

public class WorldProviderEpsilon extends WorldProvider {

    @Override
    public String getDimensionName() {
        return Dimension_Reference.DimentionName;
    }

    public boolean canRespawnHere()
    {
     return true;
    }
    
    public void registerWorldChunkManager()
    {
        //TODO add custom chunks, ;D
     this.worldChunkMgr = new WorldChunkManagerHell(Espilon.EpsilonPlains, 0.8F, 0.1F);
     this.dimensionId = Dimension_Reference.DimetionID;
    }
    
    @Override
    public IChunkProvider createChunkGenerator()
    {
     return new ChunkProviderEpsilon(worldObj, worldObj.getSeed(), true);
    }
}
