package deadspacemod.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.*;
import deadspacemod.common.DeadSpaceCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class DSItemMedPackSmall extends Item
{
public static boolean keyPressed_quickHeal = false;
	public DSItemMedPackSmall(int par1)
	{
		super(par1); //Returns super constructor: par1 is ID
		maxStackSize = 1;
		setCreativeTab(DeadSpaceCore.tabDeadSpace); //Tells the game what creative mode tab it goes in
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("deadspacemod:Small Med Pack");
	}
}