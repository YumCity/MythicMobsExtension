package main.java.com.gmail.berndivader.mythicmobsext.conditions;

import io.lumine.xikage.mythicmobs.adapters.AbstractLocation;
import io.lumine.xikage.mythicmobs.io.MythicLineConfig;
import io.lumine.xikage.mythicmobs.skills.conditions.ILocationCondition;

public class BiomeFixCondition 
extends 
AbstractCustomCondition 
implements
ILocationCondition {
	private String[] biomes;

	public BiomeFixCondition(String line, MythicLineConfig mlc) {
		super(line, mlc);
		biomes=mlc.getString(new String[] { "biome", "b" }, "ANY").toUpperCase().split(",");
	}

	@Override
	public boolean check(AbstractLocation l) {
		String s1=l.getBiome().toString().toUpperCase();
		if(biomes.length==1&&biomes[0].equals("ANY")) return true;
		for(String s2:biomes) {
			if (s1.equals(s2)) return true;
		}
		return false;
	}
}
