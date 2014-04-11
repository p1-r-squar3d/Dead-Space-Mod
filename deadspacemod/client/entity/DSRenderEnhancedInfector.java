package deadspacemod.client.entity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.util.ResourceLocation;

public class DSRenderEnhancedInfector extends RenderLiving
{
	private static final ResourceLocation field_110833_a = new ResourceLocation("deadspacemod:textures/mob/Enhanced Infector.png");
	protected DSModelEnhancedInfector model;

    /** Scale of the model to use */
    private float scale;
    
	public DSRenderEnhancedInfector(DSModelEnhancedInfector par1ModelBase, float par2, float par3) 
	{
        super(par1ModelBase, par2 * par3);
        this.scale = par3;
		model = ((DSModelEnhancedInfector)mainModel);
	}
	
	 /**
     * Applies the scale to the transform matrix
     */
    protected void preRenderScale(DSEntityEnhancedInfector par1EntityEnhancedInfector, float par2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    protected ResourceLocation func_110870_a(DSEntityEnhancedInfector par1EntityEnhancedInfector)
    {
        return field_110833_a;
    }
    
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderScale((DSEntityEnhancedInfector)par1EntityLivingBase, par2);
    }
	
	public void renderEnhancedInfector(DSEntityEnhancedInfector par1EntityEnhancedInfector, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityEnhancedInfector, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderEnhancedInfector((DSEntityEnhancedInfector)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderEnhancedInfector((DSEntityEnhancedInfector)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected ResourceLocation func_110832_a(DSEntityEnhancedInfector par1EntityEnhancedInfector)
    {
        return field_110833_a;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110832_a((DSEntityEnhancedInfector)par1Entity);
    }
}