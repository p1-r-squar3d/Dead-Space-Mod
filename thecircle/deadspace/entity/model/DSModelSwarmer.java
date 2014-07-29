package thecircle.deadspace.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DSModelSwarmer extends ModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape14;
	ModelRenderer Shape2;
	ModelRenderer Shape13;
	ModelRenderer Shape3;
	ModelRenderer Shape12;
	ModelRenderer Shape4;
	ModelRenderer Shape11;
	ModelRenderer Shape5;
	ModelRenderer Shape10;
	ModelRenderer Shape6;
	ModelRenderer Shape9;
	ModelRenderer Shape7;
	ModelRenderer Shape8;

	public DSModelSwarmer()
	{
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this, 0, 24);
		Shape1.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape1.setRotationPoint(0F, 17F, 0F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 24, 6);
		Shape14.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape14.setRotationPoint(-1.9F, 17F, -1.5F);
		Shape14.setTextureSize(64, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0.7679449F, 0F);
		Shape2 = new ModelRenderer(this, 0, 21);
		Shape2.addBox(0F, 0F, 0F, 1, 1, 2);
		Shape2.setRotationPoint(0F, 21.3F, -1.6F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, -0.3665191F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 4, 24);
		Shape13.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape13.setRotationPoint(0F, 17F, 0F);
		Shape13.setTextureSize(64, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0.9948377F);
		Shape3 = new ModelRenderer(this, 0, 18);
		Shape3.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape3.setRotationPoint(0F, 21.3F, 2.6F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, -1.204277F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 16, 6);
		Shape12.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape12.setRotationPoint(0.2F, 17F, 0.3F);
		Shape12.setTextureSize(64, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, -0.7679449F, 0F);
		Shape4 = new ModelRenderer(this, 0, 15);
		Shape4.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape4.setRotationPoint(0.2F, 22F, 1F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, -1.989675F, 1.570796F, 0F);
		Shape11 = new ModelRenderer(this, 4, 28);
		Shape11.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape11.setRotationPoint(-1.2F, 14.8F, 0F);
		Shape11.setTextureSize(64, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, -0.4537856F);
		Shape5 = new ModelRenderer(this, 0, 13);
		Shape5.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape5.setRotationPoint(0.8F, 22F, 0F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, -0.3490659F);
		Shape10 = new ModelRenderer(this, 14, 13);
		Shape10.addBox(0F, 0F, 0F, 3, 1, 1);
		Shape10.setRotationPoint(2.7F, 21.3F, 0F);
		Shape10.setTextureSize(64, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0.6632251F);
		Shape6 = new ModelRenderer(this, 0, 10);
		Shape6.addBox(0F, 0F, 0F, 3, 0, 3);
		Shape6.setRotationPoint(-1.7F, 22.2F, 0.5F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0.7853982F, 0F);
		Shape9 = new ModelRenderer(this, 6, 13);
		Shape9.addBox(0F, 0F, 0F, 3, 1, 1);
		Shape9.setRotationPoint(-3.9F, 23.2F, 0F);
		Shape9.setTextureSize(64, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, -0.7330383F);
		Shape7 = new ModelRenderer(this, 0, 6);
		Shape7.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape7.setRotationPoint(0F, 23.3F, -3.9F);
		Shape7.setTextureSize(64, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0.715585F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 8, 6);
		Shape8.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape8.setRotationPoint(0F, 21.3F, 2.6F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, -0.715585F, 0F, 0F);
	}

	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		Shape1.render(par7);
		Shape14.render(par7);
		Shape2.render(par7);
		Shape13.render(par7);
		Shape3.render(par7);
		Shape12.render(par7);
		Shape4.render(par7);
		Shape11.render(par7);
		Shape5.render(par7);
		Shape10.render(par7);
		Shape6.render(par7);
		Shape9.render(par7);
		Shape7.render(par7);
		Shape8.render(par7);
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
	}
}
