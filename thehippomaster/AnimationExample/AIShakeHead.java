package thehippomaster.AnimationExample;

import net.minecraft.entity.EntityLiving;
import p1.helper.P1sHelper;
import thehippomaster.AnimationAPI.AIAnimation;
import thehippomaster.AnimationAPI.IAnimatedEntity;

public class AIShakeHead extends AIAnimation {

	public AIShakeHead(IAnimatedEntity entity) {
		super(entity);
	}

	public int getAnimID() {
		return 2;
	}

	public boolean isAutomatic() {
		return false;
	}

	public int getDuration() {
		return 10;
	}

	public boolean shouldAnimate() {
		EntityLiving living = getEntity();
		
		if (living.getAttackTarget() == null)
			return false;
		if (living.getHealth() > living.getMaxHealth() - 4)
			return false;
		IAnimatedEntity entity = (IAnimatedEntity) living;
		return entity.getAnimID() == 0 && living.getRNG().nextInt(30) == 0;
	}

	public void resetTask() {
		super.resetTask();
		
	}
}
