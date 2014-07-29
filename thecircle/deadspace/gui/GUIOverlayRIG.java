package thecircle.deadspace.gui;


import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;

import org.lwjgl.opengl.GL11;

import thecircle.deadspace.main.DSExtendedPlayer;
import thecircle.deadspace.main.DeadSpaceCore;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GUIOverlayRIG extends Gui {

	private Minecraft mc = Minecraft.getMinecraft();
	private static final ResourceLocation texturepath = new ResourceLocation(DeadSpaceCore.ID.toLowerCase(), "textures/gui/newb.png");
	private ScaledResolution scaledresolution = new ScaledResolution(this.mc.gameSettings, this.mc.displayWidth, this.mc.displayHeight);

	int xPos = 2;
	int yPos = 6;

	public GUIOverlayRIG(Minecraft mc) {
		super();
		this.mc = mc;
	}

	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void onRenderExperienceBar(RenderGameOverlayEvent event) {
		if (event.isCancelable() || event.type != ElementType.EXPERIENCE) {
			return;
		}

		DSExtendedPlayer props = DSExtendedPlayer.get(this.mc.thePlayer);
		EntityClientPlayerMP player = FMLClientHandler.instance().getClient().thePlayer;

		if (props == null || props.getMaxRIGPoints() == 0) return;

		int barWidth = (int) (player.getHealth() / player.getMaxHealth() * 182);

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(GL11.GL_LIGHTING);

		this.mc.getTextureManager().bindTexture(texturepath);

		if (!player.capabilities.isCreativeMode) {

			this.drawTexturedModalRect(xPos, yPos, 0, 0, 182, 5);
			this.drawTexturedModalRect(xPos, yPos, 0, 5, barWidth, 5);
		}
	}
}