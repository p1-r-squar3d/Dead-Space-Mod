package thecircle.deadspace.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import thecircle.deadspace.main.DeadSpaceCore;

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
