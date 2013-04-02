package Epsilon.client.renderers.item;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import Epsilon.client.Models.ChaosCrystalModel;
import cpw.mods.fml.client.FMLClientHandler;

public class ItemChaosCrystalRenderer implements IItemRenderer {

    private ChaosCrystalModel chaosCrystalModel;

    public ItemChaosCrystalRenderer() {
        chaosCrystalModel = new ChaosCrystalModel();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        float scale;
        switch (type) {
            case ENTITY: {
                scale = .1F;
                renderChaosCrystal(0F * scale, 19.0F * scale, 0F * scale, scale);
                break;
            }
            case EQUIPPED: {
                scale = .1F;
                renderChaosCrystal(10.0F * scale, 22.0F * scale, 5.0F * scale,
                        scale);
                break;
            }
            case INVENTORY: {
                scale = .1F;
                renderChaosCrystal(-13.0F * scale, 5.0F * scale, -13F * scale,
                        scale);
                break;
            }
            default:
                break;

        }

    }

    private void renderChaosCrystal(float x, float y, float z, float scale) {

        FMLClientHandler.instance().getClient().renderEngine
                .bindTexture("/Epsilon/textures/blocks/ChaosCrystal.png");
        GL11.glPushMatrix(); // start
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glTranslatef(x, y, z); // size
        GL11.glRotatef(180F, 1F, 0F, 0F);
        chaosCrystalModel.render(scale);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix(); // end
    }

}
