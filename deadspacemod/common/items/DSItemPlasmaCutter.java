package deadspacemod.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import deadspacemod.client.projectiles.DSEntityPlasmaCutterProjectile;

public class DSItemPlasmaCutter extends DSItem {
	public DSItemPlasmaCutter(int ItemID) {
		super(ItemID);
		this.maxStackSize = 1;
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(DSCoreItems.plasmaEnergy.itemID)) {
			par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F,0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
			 par3EntityPlayer.inventory.consumeInventoryItem(DSCoreItems.plasmaEnergy.itemID);
			if (!par2World.isRemote) {
				par2World.spawnEntityInWorld(new DSEntityPlasmaCutterProjectile(par2World, par3EntityPlayer, 0));
				par2World.spawnEntityInWorld(new DSEntityPlasmaCutterProjectile(par2World, par3EntityPlayer, 1));
				par2World.spawnEntityInWorld(new DSEntityPlasmaCutterProjectile(par2World, par3EntityPlayer, 2));

			}
		}
		return par1ItemStack;
	}
}
