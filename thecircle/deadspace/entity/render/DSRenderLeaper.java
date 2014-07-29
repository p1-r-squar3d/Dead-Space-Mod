package thecircle.deadspace.entity.render;

import thecircle.deadspace.entity.DSEntityLeaper;
import thecircle.deadspace.entity.model.DSModelLeaper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class DSRenderLeaper extends RenderLiving
{
	private static final ResourceLocation field_110833_a = new ResourceLocation("deadspacemod:textures/mob/Leaper.png");
	protected DSModelLeaper model;

	public DSRenderLeaper(DSModelLeaper par1ModelBase, float par2) 
	{
		super(par1ModelBase, par2);
		model = ((DSModelLeaper)mainModel);
	}
	
	public void renderLeaper(DSEntityLeaper par1EntityLeaper, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityLeaper, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderLeaper((DSEntityLeaper)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderLeaper((DSEntityLeaper)par1Entity, par2, par4, par6, par8, par9);
    }
    protected ResourceLocation func_110832_a(DSEntityLeaper par1EntityLeaper)
    {
        return field_110833_a;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110832_a((DSEntityLeaper)par1Entity);
    }
}