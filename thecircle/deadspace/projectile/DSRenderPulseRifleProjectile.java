package thecircle.deadspace.projectile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class DSRenderPulseRifleProjectile extends Render
{
	private static final ResourceLocation pulseRifleProjectileTexture = new ResourceLocation("deadspacemod", "textures/projectiles/Plasma Cutter Projectile.png");

    private final DSModelPulseRifleProjectile modelPulseRifleProjectile;

    public DSRenderPulseRifleProjectile()
    {
        this.modelPulseRifleProjectile = new DSModelPulseRifleProjectile();
    }

    protected ResourceLocation func_110779_a(DSEntityPulseRifleProjectile entity)
    {
        return DSRenderPulseRifleProjectile.pulseRifleProjectileTexture;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110779_a((DSEntityPulseRifleProjectile) par1Entity);
    }

    public void doRenderPulseRifleProjectile(DSEntityPulseRifleProjectile entity, double par2, double par4, double par6, float par8, float par9)
    {
    	GL11.glPushMatrix();
        GL11.glTranslatef((float)par2, (float)par4, (float)par6);
        GL11.glRotatef(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
        float f4 = 0.75F;
        GL11.glScalef(f4, f4, f4);
        GL11.glScalef(1.0F / f4, 1.0F / f4, 1.0F / f4);
        this.bindEntityTexture(entity);
        GL11.glScalef(-1.0F, -1.0F, 1.0F);
        this.modelPulseRifleProjectile.render(entity, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.1F);
        GL11.glPopMatrix();
    }

    @Override
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRenderPulseRifleProjectile((DSEntityPulseRifleProjectile) par1Entity, par2, par4, par6, par8, par9);
    }
}