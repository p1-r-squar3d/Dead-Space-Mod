package deadspacemod.client.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DSModelSCAFlightWaster extends ModelBase
{
	//fields
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer rightleg2;
	ModelRenderer leftleg;
	ModelRenderer leftleg2;
	ModelRenderer righthand2;
	ModelRenderer lefthand2;
	ModelRenderer rightaxe1;
	ModelRenderer leftaxe1;
	ModelRenderer rightaxe2;
	ModelRenderer leftaxe2;
	ModelRenderer rightaxe3;
	ModelRenderer leftaxe3;
	ModelRenderer rightaxe4;
	ModelRenderer leftaxe4;

	public DSModelSCAFlightWaster()
	{
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 13);
		head.addBox(-4F, -8F, -4F, 8, 8, 8);
		head.setRotationPoint(0F, 0F, 0F);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		body = new ModelRenderer(this, 44, 0);
		body.addBox(-4F, 0F, -2F, 8, 12, 4);
		body.setRotationPoint(0F, 0F, 0F);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 40, 17);
		rightarm.addBox(-3F, -2F, -2F, 4, 7, 4);
		rightarm.setRotationPoint(-5F, 2F, 0F);
		rightarm.setTextureSize(128, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0.1745329F, 0F, 0.1396263F);
		leftarm = new ModelRenderer(this, 57, 17);
		leftarm.addBox(-1F, -2F, -2F, 4, 7, 4);
		leftarm.setRotationPoint(5F, 2F, 0F);
		leftarm.setTextureSize(128, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0.1745329F, 0F, -0.2094395F);
		rightleg = new ModelRenderer(this, 0, 30);
		rightleg.addBox(-2F, 0F, -2F, 4, 6, 4);
		rightleg.setRotationPoint(-2F, 12F, 0F);
		rightleg.setTextureSize(128, 64);
		rightleg.mirror = true;
		setRotation(rightleg, -0.1745329F, 0.1745329F, 0F);
		rightleg2 = new ModelRenderer(this, 0, 41);
		rightleg2.addBox(0F, 0F, 0F, 4, 6, 4);
		rightleg2.setRotationPoint(-4.4F, 18F, -2.6F);
		rightleg2.setTextureSize(128, 64);
		rightleg2.mirror = true;
		setRotation(rightleg2, 0.1745329F, 0.1745329F, 0F);
		leftleg = new ModelRenderer(this, 17, 30);
		leftleg.addBox(-2F, 0F, -2F, 4, 6, 4);
		leftleg.setRotationPoint(2F, 12F, 0F);
		leftleg.setTextureSize(128, 64);
		leftleg.mirror = true;
		setRotation(leftleg, -0.1745329F, -0.1745329F, 0F);
		leftleg2 = new ModelRenderer(this, 17, 41);
		leftleg2.addBox(0F, 0F, 0F, 4, 6, 4);
		leftleg2.setRotationPoint(0.5F, 18F, -3.2F);
		leftleg2.setTextureSize(128, 64);
		leftleg2.mirror = true;
		setRotation(leftleg2, 0.1745329F, -0.1570796F, 0F);
		righthand2 = new ModelRenderer(this, 57, 29);
		righthand2.addBox(0F, 0F, 0F, 4, 6, 4);
		righthand2.setRotationPoint(-8.7F, 6.3F, -1.3F);
		righthand2.setTextureSize(128, 64);
		righthand2.mirror = true;
		setRotation(righthand2, -0.4363323F, 0F, 0F);
		lefthand2 = new ModelRenderer(this, 40, 29);
		lefthand2.addBox(0F, 0F, 0F, 4, 6, 4);
		lefthand2.setRotationPoint(5F, 6.3F, -1.3F);
		lefthand2.setTextureSize(128, 64);
		lefthand2.mirror = true;
		setRotation(lefthand2, -0.4363323F, 0F, 0F);
		rightaxe1 = new ModelRenderer(this, 74, 18);
		rightaxe1.addBox(0F, 0F, 0F, 1, 18, 1);
		rightaxe1.setRotationPoint(-7F, 7F, -12F);
		rightaxe1.setTextureSize(128, 64);
		rightaxe1.mirror = true;
		setRotation(rightaxe1, 1.117011F, 0F, 0F);
		leftaxe1 = new ModelRenderer(this, 74, 18);
		leftaxe1.addBox(0F, 0F, 0F, 1, 18, 1);
		leftaxe1.setRotationPoint(6F, 7F, -12F);
		leftaxe1.setTextureSize(128, 64);
		leftaxe1.mirror = true;
		setRotation(leftaxe1, 1.117011F, 0F, 0F);
		rightaxe2 = new ModelRenderer(this, 74, 9);
		rightaxe2.addBox(0F, 0F, 0F, 1, 1, 7);
		rightaxe2.setRotationPoint(-7F, 10F, -14F);
		rightaxe2.setTextureSize(128, 64);
		rightaxe2.mirror = true;
		setRotation(rightaxe2, 1.134464F, 0F, 0F);
		leftaxe2 = new ModelRenderer(this, 74, 9);
		leftaxe2.addBox(0F, 0F, 0F, 1, 1, 7);
		leftaxe2.setRotationPoint(6F, 10F, -14F);
		leftaxe2.setTextureSize(128, 64);
		leftaxe2.mirror = true;
		setRotation(leftaxe2, 1.134464F, 0F, 0F);
		rightaxe3 = new ModelRenderer(this, 79, 18);
		rightaxe3.addBox(0F, 0F, 0F, 1, 2, 4);
		rightaxe3.setRotationPoint(-7F, 10F, -13F);
		rightaxe3.setTextureSize(128, 64);
		rightaxe3.mirror = true;
		setRotation(rightaxe3, 1.117011F, 0F, 0F);
		leftaxe3 = new ModelRenderer(this, 79, 18);
		leftaxe3.addBox(0F, 0F, 0F, 1, 2, 4);
		leftaxe3.setRotationPoint(6F, 10F, -13F);
		leftaxe3.setTextureSize(128, 64);
		leftaxe3.mirror = true;
		setRotation(leftaxe3, 1.117011F, 0F, 0F);
		rightaxe4 = new ModelRenderer(this, 0, 0);
		rightaxe4.addBox(0F, 0F, 0F, 1, 6, 1);
		rightaxe4.setRotationPoint(-7F, 10F, -14F);
		rightaxe4.setTextureSize(128, 64);
		rightaxe4.mirror = true;
		setRotation(rightaxe4, 1.117011F, 0F, 0F);
		leftaxe4 = new ModelRenderer(this, 0, 0);
		leftaxe4.addBox(0F, 0F, 0F, 1, 6, 1);
		leftaxe4.setRotationPoint(6F, 10F, -14F);
		leftaxe4.setTextureSize(128, 64);
		leftaxe4.mirror = true;
		setRotation(leftaxe4, 1.117011F, 0F, 0F);
	}

	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);

		head.render(par7);
		body.render(par7);
		rightarm.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		rightleg2.render(par7);
		leftleg.render(par7);
		leftleg2.render(par7);
		righthand2.render(par7);
		lefthand2.render(par7);
		rightaxe1.render(par7);
		leftaxe1.render(par7);
		rightaxe2.render(par7);
		leftaxe2.render(par7);
		rightaxe3.render(par7);
		leftaxe3.render(par7);
		rightaxe4.render(par7);
		leftaxe4.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	{
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);

		this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
		this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
	}
}