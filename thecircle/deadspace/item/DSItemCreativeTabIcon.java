package thecircle.deadspace.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class DSItemCreativeTabIcon extends Item
{
	public DSItemCreativeTabIcon(int ItemID)
	{
		super(ItemID);
	}

	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("deadspacemod:" + this.getUnlocalizedName().substring(5));
	}

	//Adds a description
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
	{
		par3List.add(StatCollector.translateToLocal("A useless item that shows"));
		par3List.add(StatCollector.translateToLocal("on the Dead Space tab"));
		par3List.add(StatCollector.translateToLocal("that we can't figure"));
		par3List.add(StatCollector.translateToLocal("out how to hide."));
	}
}
