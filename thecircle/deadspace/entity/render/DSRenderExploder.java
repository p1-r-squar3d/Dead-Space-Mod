package thecircle.deadspace.entity.render;

import thecircle.deadspace.entity.DSEntityExploder;
import thecircle.deadspace.entity.model.DSModelExploder;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class DSRenderExploder extends RenderLiving
{
	private static final ResourceLocation field_110833_a = new ResourceLocation("deadspacemod:textures/mob/Exploder.png");
	protected DSModelExploder model;

	public DSRenderExploder(DSModelExploder par1ModelBase, float par2) 
	{
		super(par1ModelBase, par2);
		model = ((DSModelExploder)mainModel);
	}
	
	public void renderExploder(DSEntityExploder par1EntityExploder, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityExploder, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderExploder((DSEntityExploder)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderExploder((DSEntityExploder)par1Entity, par2, par4, par6, par8, par9);
    }
    protected ResourceLocation func_110832_a(DSEntityExploder par1EntityExploder)
    {
        return field_110833_a;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110832_a((DSEntityExploder)par1Entity);
    }
}