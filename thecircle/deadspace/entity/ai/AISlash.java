package thecircle.deadspace.entity.ai;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import p1.helper.P1sHelper;
import thecircle.deadspace.entity.DSEntitySlasher;
import thehippomaster.AnimationAPI.AIAnimation;
import thehippomaster.AnimationAPI.IAnimatedEntity;

public class AISlash extends AIAnimation{

	private DSEntitySlasher slasher;
	private EntityLivingBase attackTarget;
	
	public AISlash(IAnimatedEntity entity) {
		super(entity);
	}

	@Override
	public int getAnimID() {
		return 5;
	}

	@Override
	public boolean isAutomatic() {
		return false;
	}

	@Override
	public int getDuration() {
		return P1sHelper.durateSecs(1);
	}
	
	public void startExecuting() {
		super.startExecuting();
		attackTarget = slasher.getAttackTarget();
	}

	public void updateTask() {
		if(slasher.getAnimTick() < 14)
			slasher.getLookHelper().setLookPositionWithEntity(attackTarget, 30F, 30F);
		if(slasher.getAnimTick() == 14 && attackTarget != null)
			attackTarget.attackEntityFrom(DamageSource.causeMobDamage(slasher), 1);
	}
}
