package deadspacemod.common.items;

import java.util.List;

import deadspacemod.common.DeadSpaceCore;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class DSItem extends Item
{
	public DSItem(int ItemID)
	{
		super(ItemID);
		setCreativeTab(DeadSpaceCore.tabDeadSpace);
	}

	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("deadspacemod:" + this.getUnlocalizedName().substring(5));
	}
}
