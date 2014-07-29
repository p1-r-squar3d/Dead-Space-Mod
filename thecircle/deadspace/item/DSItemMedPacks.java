package thecircle.deadspace.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DSItemMedPacks extends Item {

	public DSItemMedPacks(int par1) {
		super(par1); //Returns super constructor: par1 is ID
		maxStackSize = 1;
		setCreativeTab(CreativeTabs.tabMisc); //Tells the game what creative mode tab it goes in
	}
}