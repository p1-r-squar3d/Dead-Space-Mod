package thecircle.deadspace.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import thecircle.deadspace.main.DeadSpaceCore;

public class DSItemPlasmaSaw extends ItemSword 
{
	public DSItemPlasmaSaw(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(DeadSpaceCore.tabDeadSpace);
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("deadspacemod:" + this.getUnlocalizedName().substring(5));
	}
}