package thecircle.deadspace.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import thecircle.deadspace.projectile.DSEntityDevilHornsProjectile;

public class DSItemDevilHorns extends DSItem
{
	public DSItemDevilHorns(int ItemID) 
	{
		super(ItemID);
		this.maxStackSize = 1;
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		if (!par2World.isRemote)
		{
			par2World.spawnEntityInWorld(new DSEntityDevilHornsProjectile(par2World, par3EntityPlayer));
		}
		
		return par1ItemStack;
	}
}
