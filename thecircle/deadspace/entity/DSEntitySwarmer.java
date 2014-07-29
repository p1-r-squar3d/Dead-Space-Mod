package thecircle.deadspace.entity;


import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class DSEntitySwarmer extends EntityMob
{
	//Modifiers	
	public DSEntitySwarmer(World par1World)
	{
		super(par1World);
		this.setSize(0.5F, 0.5F);
		{
			//Tasks
			this.tasks.addTask(0, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
			this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
			this.tasks.addTask(3, new EntityAIAttackOnCollide(this, DSEntityIsaac.class, 1.0D, true));
			this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
			this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, 1.0D, false));
			this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
			this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
			this.tasks.addTask(7, new EntityAILookIdle(this));
			//Target Tasks
			this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
			this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
			this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, DSEntityIsaac.class, 0, false));
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
		return "deadspacemod:swarmer_say";
	}
	
	//Hurt Sound on Hit
	protected String getHurtSound()
	{
		return "deadspacemod:swarmer_hurt";
	}
	
	//Death Sound on Death
	protected String getDeathSound()
	{
		return "deadspacemod:swarmer_death";
	}
	
	//Step Sound
	protected void playStepSound(int par1, int par2, int par3, int par4)
	{
		this.worldObj.playSoundAtEntity(this, null, 0.15F, 1.0F);
	}

}