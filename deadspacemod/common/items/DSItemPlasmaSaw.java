package deadspacemod.common.items;

import deadspacemod.common.DeadSpaceCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

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