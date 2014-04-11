package deadspacemod.client.itemrenders;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class DSRenderPlasmaCutter implements IItemRenderer
{
	protected DSModelPlasmaCutter model;
	protected String renderType;

	public DSRenderPlasmaCutter()
	{
		model = new DSModelPlasmaCutter();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		switch(type)
		{
		case EQUIPPED: return true;

		case EQUIPPED_FIRST_PERSON: return true;

		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		renderType = null;
				
		switch(type)
		{
		case EQUIPPED: 
		{
			if(renderType == null)
			{
				renderType = "ThirdPerson";
			}

			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("deadspacemod:textures/itemRenders/211-V Plasma Cutter.png"));

			GL11.glTranslatef(0.20F, 0.23F, -0.20F);

			float scale = 0.6F;
			GL11.glScalef(scale, scale, scale);

			GL11.glRotatef(-95.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(40.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);

			if(renderType == "ThirdPerson")
			{
				model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			}

			GL11.glPopMatrix();
		}
		
		case EQUIPPED_FIRST_PERSON: 
		{
			if(renderType == null)
			{
				renderType = "FirstPerson";
			}

			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("deadspacemod:textures/itemRenders/211-V Plasma Cutter.png"));

			GL11.glTranslatef(0.0F, 0.0F, 0.0F);

			float scale = 1.0F;
			GL11.glScalef(scale, scale, scale);

			GL11.glRotatef(-95.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(40.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);

			if(renderType == "FirstPerson")
			{
				model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			}

			GL11.glPopMatrix();
		}

		default:
			break;
		}
	}
}
