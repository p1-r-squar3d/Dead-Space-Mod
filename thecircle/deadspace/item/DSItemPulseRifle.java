package thecircle.deadspace.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import thecircle.deadspace.projectile.DSEntityPulseRifleProjectile;

public class DSItemPulseRifle extends DSItem
{
	public DSItemPulseRifle(int ItemID) 
	{
		super(ItemID);
		this.maxStackSize = 1;
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(DSCoreItems.pulseRounds.itemID)) {
			par3EntityPlayer.inventory.consumeInventoryItem(DSCoreItems.pulseRounds.itemID);
		par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		if (!par2World.isRemote)
		{
			par2World.spawnEntityInWorld(new DSEntityPulseRifleProjectile(par2World, par3EntityPlayer));
		}
	}
		return par1ItemStack;
}
}