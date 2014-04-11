package deadspacemod.client.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DSModelEarthGovWaster extends ModelBase
{
	//fields
	ModelRenderer leftbaton2;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer righhand1;
	ModelRenderer righthand2;
	ModelRenderer leftbaton1;
	ModelRenderer rightbaton2;
	ModelRenderer rightbaton1;
	ModelRenderer lefthand1;
	ModelRenderer rightleg;
	ModelRenderer lefthand2;
	ModelRenderer rightleg2;
	ModelRenderer leftleg;
	ModelRenderer leftleg2;

	public DSModelEarthGovWaster()
	{
		textureWidth = 128;
		textureHeight = 64;

		leftbaton2 = new ModelRenderer(this, 74, 9);
		leftbaton2.addBox(0F, 0F, 0F, 1, 1, 3);
		leftbaton2.setRotationPoint(6F, 10F, -5F);
		leftbaton2.setTextureSize(128, 64);
		leftbaton2.mirror = true;
		setRotation(leftbaton2, 1.134464F, 0F, 0F);
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
		righhand1 = new ModelRenderer(this, 40, 17);
		righhand1.addBox(-3F, -2F, -2F, 4, 7, 4);
		righhand1.setRotationPoint(-5F, 2F, 0F);
		righhand1.setTextureSize(128, 64);
		righhand1.mirror = true;
		setRotation(righhand1, 0.1745329F, 0F, 0.1396263F);
		righthand2 = new ModelRenderer(this, 57, 29);
		righthand2.addBox(0F, 0F, 0F, 4, 6, 4);
		righthand2.setRotationPoint(-8.7F, 6.3F, -1.3F);
		righthand2.setTextureSize(128, 64);
		righthand2.mirror = true;
		setRotation(righthand2, -0.4537856F, 0F, 0F);
		leftbaton1 = new ModelRenderer(this, 74, 18);
		leftbaton1.addBox(0F, 0F, 0F, 1, 15, 1);
		leftbaton1.setRotationPoint(6F, 7F, -12F);
		leftbaton1.setTextureSize(128, 64);
		leftbaton1.mirror = true;
		setRotation(leftbaton1, 1.117011F, 0F, 0F);
		rightbaton2 = new ModelRenderer(this, 74, 9);
		rightbaton2.addBox(0F, 0F, 0F, 1, 1, 3);
		rightbaton2.setRotationPoint(-7F, 10F, -5F);
		rightbaton2.setTextureSize(128, 64);
		rightbaton2.mirror = true;
		setRotation(rightbaton2, 1.134464F, 0F, 0F);
		rightbaton1 = new ModelRenderer(this, 74, 18);
		rightbaton1.addBox(0F, 0F, 0F, 1, 15, 1);
		rightbaton1.setRotationPoint(-7F, 7F, -12F);
		rightbaton1.setTextureSize(128, 64);
		rightbaton1.mirror = true;
		setRotation(rightbaton1, 1.117011F, 0F, 0F);
		lefthand1 = new ModelRenderer(this, 57, 17);
		lefthand1.addBox(-1F, -2F, -2F, 4, 7, 4);
		lefthand1.setRotationPoint(5F, 2F, 0F);
		lefthand1.setTextureSize(128, 64);
		lefthand1.mirror = true;
		setRotation(lefthand1, 0.1745329F, 0.0349066F, -0.2268928F);
		rightleg = new ModelRenderer(this, 0, 30);
		rightleg.addBox(-2F, 0F, -2F, 4, 6, 4);
		rightleg.setRotationPoint(-2F, 12F, 0F);
		rightleg.setTextureSize(128, 64);
		rightleg.mirror = true;
		setRotation(rightleg, -0.1745329F, 0.1745329F, 0.0872665F);
		lefthand2 = new ModelRenderer(this, 40, 29);
		lefthand2.addBox(0F, 0F, 0F, 4, 6, 4);
		lefthand2.setRotationPoint(5F, 6.3F, -1.3F);
		lefthand2.setTextureSize(128, 64);
		lefthand2.mirror = true;
		setRotation(lefthand2, -0.4363323F, 0F, 0F);
		rightleg2 = new ModelRenderer(this, 0, 41);
		rightleg2.addBox(0F, 0F, 0F, 4, 6, 4);
		rightleg2.setRotationPoint(-4.9F, 18F, -2.6F);
		rightleg2.setTextureSize(128, 64);
		rightleg2.mirror = true;
		setRotation(rightleg2, 0.1745329F, 0.1745329F, 0F);
		leftleg = new ModelRenderer(this, 17, 30);
		leftleg.addBox(-2F, 0F, -2F, 4, 6, 4);
		leftleg.setRotationPoint(2F, 12F, 0F);
		leftleg.setTextureSize(128, 64);
		leftleg.mirror = true;
		setRotation(leftleg, -0.1745329F, -0.1745329F, -0.0698132F);
		leftleg2 = new ModelRenderer(this, 17, 41);
		leftleg2.addBox(0F, 0F, 0F, 4, 6, 4);
		leftleg2.setRotationPoint(0.9F, 18F, -3.2F);
		leftleg2.setTextureSize(128, 64);
		leftleg2.mirror = true;
		setRotation(leftleg2, 0.1745329F, -0.1570796F, 0F);
	}

	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);

		leftbaton2.render(par7);
		head.render(par7);
		body.render(par7);
		righhand1.render(par7);
		righthand2.render(par7);
		leftbaton1.render(par7);
		rightbaton2.render(par7);
		rightbaton1.render(par7);
		lefthand1.render(par7);
		rightleg.render(par7);
		lefthand2.render(par7);
		rightleg2.render(par7);
		leftleg.render(par7);
		leftleg2.render(par7);
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
