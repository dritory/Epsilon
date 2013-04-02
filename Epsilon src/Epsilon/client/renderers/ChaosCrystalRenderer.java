package Epsilon.client.renderers;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import Epsilon.client.Models.ChaosCrystalModel;
import Epsilon.tilenentity.TileChaosCrystal;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ChaosCrystalRenderer extends TileEntitySpecialRenderer {

    private ChaosCrystalModel modelChaosCrystal = new ChaosCrystalModel();

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y,
            double z, float tick) {

        modelChaosCrystal.render((TileChaosCrystal) tileentity, x, y, z);
    }

}
