package deadspacemod.client.entity;


import java.io.File;

import thehippomaster.AnimationAPI.AnimationAPI;
import thehippomaster.AnimationAPI.IAnimatedEntity;
import deadspacemod.client.entity.ai.AISlash;
import deadspacemod.common.DeadSpaceCore;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class DSEntitySlasher extends EntityMob implements IAnimatedEntity
{
	private int animID;
	private int animTick;
	
	//Modifiers	
	public DSEntitySlasher(World par1World) 
	{
		super(par1World);
		{
			animID = 5;
			animTick = 0;
			//Tasks
			this.tasks.addTask(0, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
			this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
			this.tasks.addTask(3, new EntityAIAttackOnCollide(this, DSEntityIsaac.class, 1.0D, true));
			this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
			this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, 1.0D, false));
			this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
			this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
			this.tasks.addTask(8, new EntityAILookIdle(this));
			this.tasks.addTask(9, new AISlash(this));
			//Target Tasks
			this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
			this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
			this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, DSEntityIsaac.class, 0, false));
		}
	}
	
	//AI Enabler	
	public boolean isAIEnabled()
    {
        return true;
    }

	//Set Properties
	protected void applyEntityAttributes()
    {
		super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(20.0D); //Health
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.20000000298023224D); //Speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(2.0D); //Attack Damage
    }

	//Drops
	protected int getDropItemId()
	{
		return Item.stick.itemID;
	}
	protected void dropRareDrop(int par1)
	{
		switch (this.rand.nextInt(3))
		{
		case 0:
			this.dropItem(Item.stick.itemID, 1);
			break;
		case 1:
			this.dropItem(Item.stick.itemID, 1);
			break;
		case 2:
			this.dropItem(Item.stick.itemID, 1);
			break;
		case 3:
			this.dropItem(Item.stick.itemID, 1);
			break;
		case 4:
			this.dropItem(Item.stick.itemID, 1);
			break;
		case 5:
			this.dropItem(Item.stick.itemID, 1);
			break;
		case 6:
			this.dropItem(Item.stick.itemID, 1);
			break;
		case 7:
			this.dropItem(Item.stick.itemID, 1);
			break;
		case 8:
			this.dropItem(Item.stick.itemID, 1);
			break;
		case 9:
			this.dropItem(Item.stick.itemID, 1);
		}
	}
	
	//Creature Type	
	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEAD;
	}
	
	//Sounds
	//Living Default Sound
	protected String getLivingSound()
	{
		return "deadspacemod:slasher_say";
	}
	
	//Hurt Sound on Hit
	protected String getHurtSound()
	{
		return "deadspacemod:slasher_hurt";
	}
	
	//Death Sound on Death
	protected String getDeathSound()
	{
		return "deadspacemod:slasher_death";
	}
	
	//Step Sound
	protected void playStepSound(int par1, int par2, int par3, int par4)
	{
		this.worldObj.playSoundAtEntity(this, "mob.zombie.step", 0.15F, 1.0F);
	}

	public void setAnimID(int id) {
		animID = id;
	}
	
	/*
	 * Implemented method from IAnimatedEntity.
	 * Set the animTick field to the tick in the parameter.
	 */
	public void setAnimTick(int tick) {
		animTick = tick;
	}
	
	/*
	 * Implemented method from IAnimatedEntity.
	 * Return the animID.
	 */
	public int getAnimID() {
		return animID;
	}
	
	/*
	 * Implemented method from IAnimatedEntity.
	 * Return the animTick.
	 */
	public int getAnimTick() {
		return animTick;
	}
	
	public void onUpdate() {
		super.onUpdate();
		//increment the animTick if there is an animation playing
		if(animID != 5) animTick++;
	}
	
	public boolean attackEntityAsMob(Entity entity) {
		if(animID == 5) AnimationAPI.sendAnimPacket(this, 1);
		return true;
	}
}
