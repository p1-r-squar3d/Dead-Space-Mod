package deadspacemod.common.items;

import deadspacemod.client.projectiles.DSEntityLineGunProjectile;
import deadspacemod.client.projectiles.DSEntityPlasmaCutterProjectile;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DSItemLineGun extends DSItem
{
	public DSItemLineGun(int ItemID) 
	{
		super(ItemID);
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(DSCoreItems.lineRacks.itemID)) {
			par3EntityPlayer.inventory.consumeInventoryItem(DSCoreItems.lineRacks.itemID);
			par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		if (!par2World.isRemote)
		{
			par2World.spawnEntityInWorld(new DSEntityLineGunProjectile(par2World, par3EntityPlayer));
		}
		}
		return par1ItemStack;
	}
}
