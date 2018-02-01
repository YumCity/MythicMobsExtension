package main.java.com.gmail.berndivader.mythicmobsext.conditions;

import io.lumine.xikage.mythicmobs.adapters.AbstractEntity;
import io.lumine.xikage.mythicmobs.io.MythicLineConfig;
import io.lumine.xikage.mythicmobs.skills.conditions.IEntityCondition;

public class IsTargetPresentCondition
extends
AbstractCustomCondition
implements
IEntityCondition {
	public IsTargetPresentCondition(String line, MythicLineConfig mlc) {
		super(line, mlc);
	}

	@Override
	public boolean check(AbstractEntity entity) {
		return entity!=null;
	}

}
