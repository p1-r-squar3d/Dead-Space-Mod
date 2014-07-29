package thecircle.deadspace.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import thecircle.deadspace.entity.DSEntityInfector;
import thecircle.deadspace.entity.model.DSModelInfector;

public class DSRenderInfector extends RenderLiving
{
	private static final ResourceLocation field_110833_a = new ResourceLocation("deadspacemod:textures/mob/Infector.png");
	protected DSModelInfector model;

    /** Scale of the model to use */
    private float scale;
    
	public DSRenderInfector(DSModelInfector par1ModelBase, float par2, float par3) 
	{
        super(par1ModelBase, par2 * par3);
        this.scale = par3;
		model = ((DSModelInfector)mainModel);
	}
	
	 /**
     * Applies the scale to the transform matrix
     */
    protected void preRenderScale(DSEntityInfector par1EntityInfector, float par2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    protected ResourceLocation func_110870_a(DSEntityInfector par1EntityInfector)
    {
        return field_110833_a;
    }
    
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderScale((DSEntityInfector)par1EntityLivingBase, par2);
    }
	
	public void renderInfector(DSEntityInfector par1EntityInfector, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityInfector, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderInfector((DSEntityInfector)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderInfector((DSEntityInfector)par1Entity, par2, par4, par6, par8, par9);
    }
    protected ResourceLocation func_110832_a(DSEntityInfector par1EntityInfector)
    {
        return field_110833_a;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110832_a((DSEntityInfector)par1Entity);
    }
}