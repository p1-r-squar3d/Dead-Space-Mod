package thecircle.deadspace.item.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DSModelPlasmaCutter extends ModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape21;
	ModelRenderer Shape22;
	ModelRenderer Shape24;
	ModelRenderer Shape25;
	ModelRenderer Shape26;

	public DSModelPlasmaCutter()
	{
		textureWidth = 512;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this, 98, 0);
		Shape1.addBox(0F, 0F, 0F, 2, 5, 3);
		Shape1.setRotationPoint(-5F, 5F, -13F);
		Shape1.setTextureSize(512, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0.3141593F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 98, 14);
		Shape2.addBox(0F, 0F, 0F, 2, 2, 12);
		Shape2.setRotationPoint(-5F, 3F, -21F);
		Shape2.setTextureSize(512, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 28, 14);
		Shape3.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape3.setRotationPoint(-5F, 9.6F, -11F);
		Shape3.setTextureSize(512, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0.3141593F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 109, 2);
		Shape4.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape4.setRotationPoint(-5F, 2.6F, -10.7F);
		Shape4.setTextureSize(512, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 118, 0);
		Shape6.addBox(0F, 0F, 0F, 2, 1, 5);
		Shape6.setRotationPoint(-5F, 2.8F, -15.7F);
		Shape6.setTextureSize(512, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 37, 19);
		Shape7.addBox(0F, 0F, 0F, 3, 3, 7);
		Shape7.setRotationPoint(-5.5F, 4F, -23F);
		Shape7.setTextureSize(512, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 29, 5);
		Shape9.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape9.setRotationPoint(-5F, 4.1F, -13F);
		Shape9.setTextureSize(512, 32);
		Shape9.mirror = true;
		setRotation(Shape9, -0.6632251F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 41, 0);
		Shape10.addBox(0F, 0F, 0F, 2, 3, 4);
		Shape10.setRotationPoint(-5F, 6F, -22F);
		Shape10.setTextureSize(512, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 65, 15);
		Shape11.addBox(0F, 0F, 0F, 1, 7, 2);
		Shape11.setRotationPoint(-6.5F, 9F, -25F);
		Shape11.setTextureSize(512, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 58, 25);
		Shape12.addBox(0F, 0F, 0F, 1, 2, 4);
		Shape12.setRotationPoint(-6.5F, 14F, -23F);
		Shape12.setTextureSize(512, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 58, 15);
		Shape13.addBox(0F, 0F, 0F, 1, 7, 2);
		Shape13.setRotationPoint(-6.5F, 0F, -25F);
		Shape13.setTextureSize(512, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 58, 8);
		Shape14.addBox(0F, 0F, 0F, 1, 2, 4);
		Shape14.setRotationPoint(-6.5F, 0F, -23F);
		Shape14.setTextureSize(512, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 72, 15);
		Shape15.addBox(0F, 0F, 0F, 1, 7, 2);
		Shape15.setRotationPoint(-2.5F, 0F, -25F);
		Shape15.setTextureSize(512, 32);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 80, 25);
		Shape16.addBox(0F, 0F, 0F, 1, 2, 4);
		Shape16.setRotationPoint(-2.5F, 0F, -23F);
		Shape16.setTextureSize(512, 32);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 79, 16);
		Shape17.addBox(0F, 0F, 0F, 1, 7, 2);
		Shape17.setRotationPoint(-2.5F, 9F, -25F);
		Shape17.setTextureSize(512, 32);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelRenderer(this, 69, 25);
		Shape18.addBox(0F, 0F, 0F, 1, 2, 4);
		Shape18.setRotationPoint(-2.5F, 14F, -23F);
		Shape18.setTextureSize(512, 32);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		Shape19 = new ModelRenderer(this, 54, 0);
		Shape19.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape19.setRotationPoint(-4.5F, 12F, -20F);
		Shape19.setTextureSize(512, 32);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);
		Shape20 = new ModelRenderer(this, 69, 0);
		Shape20.addBox(0F, 0F, 0F, 1, 1, 13);
		Shape20.setRotationPoint(-4.5F, 13F, -19F);
		Shape20.setTextureSize(512, 32);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 0F, 0F);
		Shape21 = new ModelRenderer(this, 1, 24);
		Shape21.addBox(0F, 0F, 0F, 1, 2, 4);
		Shape21.setRotationPoint(-4.5F, 11F, -10F);
		Shape21.setTextureSize(512, 32);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Shape22 = new ModelRenderer(this, 18, 19);
		Shape22.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape22.setRotationPoint(-4.5F, 12F, -13F);
		Shape22.setTextureSize(512, 32);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, 0F);
		Shape24 = new ModelRenderer(this, 1, 15);
		Shape24.addBox(0F, 0F, 0F, 1, 1, 7);
		Shape24.setRotationPoint(-4.5F, 14F, -13F);
		Shape24.setTextureSize(512, 32);
		Shape24.mirror = true;
		setRotation(Shape24, 0F, 0F, 0F);
		Shape25 = new ModelRenderer(this, 12, 24);
		Shape25.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape25.setRotationPoint(-4.5F, 15F, -10F);
		Shape25.setTextureSize(512, 32);
		Shape25.mirror = true;
		setRotation(Shape25, 0F, 0F, 0F);
		Shape26 = new ModelRenderer(this, 37, 8);
		Shape26.addBox(0F, 0F, 0F, 3, 3, 7);
		Shape26.setRotationPoint(-5.5F, 9F, -23F);
		Shape26.setTextureSize(512, 32);
		Shape26.mirror = true;
		setRotation(Shape26, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Shape16.render(f5);
		Shape17.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
		Shape20.render(f5);
		Shape21.render(f5);
		Shape22.render(f5);
		Shape24.render(f5);
		Shape25.render(f5);
		Shape26.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}
