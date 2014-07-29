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
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class DSEntityIsaac extends EntityMob
{
	//Modifiers	
	public DSEntityIsaac(World par1World) 
	{
		super(par1World);
		{
			//Tasks
			this.getNavigator().setBreakDoors(true);
			this.tasks.addTask(0, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
			this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySkeleton.class, 1.0D, true));
			this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0D, true));
			this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntitySpider.class, 1.0D, true));
			this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityEnderman.class, 1.0D, true));
			this.tasks.addTask(6, new EntityAIAttackOnCollide(this, EntityWitch.class, 1.0D, true));
			this.tasks.addTask(7, new EntityAIAttackOnCollide(this, EntitySilverfish.class, 1.0D, true));
			this.tasks.addTask(8, new EntityAIAttackOnCollide(this, EntityIronGolem.class, 1.0D, true));
			this.tasks.addTask(9, new EntityAIAttackOnCollide(this, EntitySlime.class, 1.0D, true));
			this.tasks.addTask(10, new EntityAIAttackOnCollide(this, EntityMagmaCube.class, 1.0D, true));
			this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntityGiantZombie.class, 1.0D, true));
			this.tasks.addTask(12, new EntityAIAttackOnCollide(this, EntityCaveSpider.class, 1.0D, true));
			this.tasks.addTask(13, new EntityAIAttackOnCollide(this, EntityBlaze.class, 1.0D, true));
			this.tasks.addTask(14, new EntityAIAttackOnCollide(this, EntityGhast.class, 1.0D, true));
			this.tasks.addTask(15, new EntityAIAttackOnCollide(this, DSEntitySlasher.class, 1.0D, true));
			this.tasks.addTask(16, new EntityAIAttackOnCollide(this, DSEntityEnhancedSlasher.class, 1.0D, true));        
			this.tasks.addTask(17, new EntityAIAttackOnCollide(this, DSEntityLeaper.class, 1.0D, true));
			this.tasks.addTask(18, new EntityAIAttackOnCollide(this, DSEntityEnhancedLeaper.class, 1.0D, true));
			this.tasks.addTask(19, new EntityAIAttackOnCollide(this, DSEntityInfector.class, 1.0D, true));
			this.tasks.addTask(20, new EntityAIAttackOnCollide(this, DSEntityEnhancedInfector.class, 1.0D, true));
			this.tasks.addTask(21, new EntityAIAttackOnCollide(this, DSEntitySwarmer.class, 1.0D, true));
			this.tasks.addTask(22, new EntityAIMoveTowardsRestriction(this, 1.0D));
			this.tasks.addTask(23, new EntityAIMoveThroughVillage(this, 1.0D, false));
			this.tasks.addTask(24, new EntityAIWander(this, 1.0D));
			this.tasks.addTask(25, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
			this.tasks.addTask(25, new EntityAILookIdle(this));
			//Target Tasks
			this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, DSEntitySlasher.class, 0, true));
			this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, false));
			this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, false));
			this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, false));
			this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityCaveSpider.class, 0, false));
			this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityEnderman.class, 0, false));
			this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntitySlime.class, 0, false));
			this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, EntitySilverfish.class, 0, false));
			this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntityWitch.class, 0, false));
			this.targetTasks.addTask(11, new EntityAINearestAttackableTarget(this, EntityGhast.class, 0, false));
			this.targetTasks.addTask(12, new EntityAINearestAttackableTarget(this, DSEntityEnhancedSlasher.class, 0, false));
			this.targetTasks.addTask(13, new EntityAINearestAttackableTarget(this, DSEntityEnhancedLeaper.class, 0, false));
			this.targetTasks.addTask(14, new EntityAINearestAttackableTarget(this, DSEntityLeaper.class, 0, false));
			this.targetTasks.addTask(15, new EntityAINearestAttackableTarget(this, DSEntitySwarmer.class, 0, false));
			this.targetTasks.addTask(16, new EntityAINearestAttackableTarget(this, DSEntityInfector.class, 0, false));
			this.targetTasks.addTask(17, new EntityAINearestAttackableTarget(this, DSEntityEnhancedInfector.class, 0, false));
			this.targetTasks.addTask(18, new EntityAINearestAttackableTarget(this, EntityMagmaCube.class, 0, false));
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