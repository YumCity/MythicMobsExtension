package main.java.com.gmail.berndivader.mythicmobsext.targeters;

import java.util.HashSet;

import org.bukkit.entity.Player;

import main.java.com.gmail.berndivader.mythicmobsext.utils.Utils;

import io.lumine.xikage.mythicmobs.adapters.AbstractEntity;
import io.lumine.xikage.mythicmobs.adapters.bukkit.BukkitAdapter;
import io.lumine.xikage.mythicmobs.io.MythicLineConfig;
import io.lumine.xikage.mythicmobs.skills.SkillCaster;
import io.lumine.xikage.mythicmobs.skills.SkillMetadata;
import io.lumine.xikage.mythicmobs.skills.targeters.IEntitySelector;

public class CrosshairTargeter 
extends 
IEntitySelector {

	public CrosshairTargeter(MythicLineConfig mlc) {
		super(mlc);
	}

	@Override
	public HashSet<AbstractEntity> getEntities(SkillMetadata data) {
		HashSet<AbstractEntity> targets = new HashSet<AbstractEntity>();
		SkillCaster caster = data.getCaster();
		if (caster.getEntity().isPlayer()) {
			targets.add(BukkitAdapter.adapt(Utils.getTargetedEntity((Player)caster.getEntity().getBukkitEntity())));
		}
		return targets;
	}
}
