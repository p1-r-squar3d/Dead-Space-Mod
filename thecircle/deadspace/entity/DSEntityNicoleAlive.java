package thecircle.deadspace.entity;


import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class DSEntityNicoleAlive extends EntityMob
{
	//Modifiers	
	public DSEntityNicoleAlive(World par1World) 
	{
		super(par1World);
		{
			//Tasks
			this.tasks.addTask(0, new EntityAISwimming(this));
			this.tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1.0D));
			this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 1.0D, false));
			this.tasks.addTask(4, new EntityAIWander(this, 1.0D));
			this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
			this.tasks.addTask(5, new EntityAILookIdle(this));
			//Target Tasks
			this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		}
	}
	
	//AI Enabler	
	protected boolean isAIEnabled()
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
	//We use zombies for temporary.
	//Living Default Sound
	protected String getLivingSound()
	{
		return "mob";
	}
	
	//Hurt Sound on Hit
	protected String getHurtSound()
	{
		return "damage.hit";
	}
	
	//Death Sound on Death
	protected String getDeathSound()
	{
		return "mob";
	}
	
	//Step Sound
	protected void playStepSound(int par1, int par2, int par3, int par4)
	{
		this.worldObj.playSoundAtEntity(this, "mob.zombie.step", 0.15F, 1.0F);
	}

	
}