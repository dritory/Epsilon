package Epsilon.client;

import net.minecraftforge.client.MinecraftForgeClient;
import Epsilon.client.renderers.ChaosCrystalRenderer;
import Epsilon.client.renderers.item.ItemChaosCrystalRenderer;
import Epsilon.common.CommonProxy;
import Epsilon.library.RenderIDs;
import Epsilon.tilenentity.TileChaosCrystal;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        RenderIDs.ChaosCrystalRender = RenderingRegistry
                .getNextAvailableRenderId();

        MinecraftForgeClient.registerItemRenderer(500,
                new ItemChaosCrystalRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileChaosCrystal.class,
                new ChaosCrystalRenderer());
    }
}
