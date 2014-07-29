package thecircle.deadspace.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import thecircle.deadspace.main.DeadSpaceCore;

public class DSItemMedPackLarge extends Item
{

	public DSItemMedPackLarge(int par1)
	{
		super(par1); //Returns super constructor: par1 is ID
		maxStackSize = 1;
		setCreativeTab(DeadSpaceCore.tabDeadSpace); //Tells the game what creative mode tab it goes in
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("deadspacemod:Large Med Pack");
	}
}