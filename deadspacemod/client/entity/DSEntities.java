package deadspacemod.client.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import deadspacemod.client.itemrenders.DSRenderPlasmaCutter;
import deadspacemod.common.items.DSCoreItems;

public class DSEntities 
{
	static int startEntityId = 301;
	
	public static void init()
	{
		//Entity Natural Spawning
		//EntityRegistry.addSpawn(DSEntityEngineerSlasher.class, 3, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntitySlasher.class, 3, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntityEnhancedSlasher.class, 3, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntityLeaper.class, 3, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntityEnhancedLeaper.class, 3, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntityInfector.class, 2, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntityEnhancedInfector.class, 3, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntitySwarmer.class, 1, 20, 30, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntityIsaac.class, 2, 1, 1, EnumCreatureType.creature, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntitySCAFlightWaster.class, 3, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntityEarthGovWaster.class, 3, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntityNicoleAlive.class, 3, 2, 4, EnumCreatureType.ambient, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		//EntityRegistry.addSpawn(DSEntityNicoleHalluccination.class, 3, 2, 4, EnumCreatureType.creature, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);

		//Egg Registry
		registerEntityEgg(DSEntitySlasher.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityEngineerSlasher.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityEnhancedSlasher.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityLeaper.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityEnhancedLeaper.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityInfector.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityEnhancedInfector.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntitySwarmer.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityIsaac.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntitySCAFlightWaster.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityEarthGovWaster.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityNicoleAlive.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityNicoleHalluccination.class,  0xFFFDB8, 0xFF0000);
		registerEntityEgg(DSEntityExploder.class,  0xFFFDB8, 0xFF0000);

		//Server Support
		//Name Registry
		LanguageRegistry.instance().addStringLocalization("entity.Slasher.name", "Slasher");
		LanguageRegistry.instance().addStringLocalization("entity.EngineerSlasher.name", "Engineer Slasher");
		LanguageRegistry.instance().addStringLocalization("entity.EnhancedSlasher.name", "Enhanced Slasher");
		LanguageRegistry.instance().addStringLocalization("entity.Leaper.name", "Leaper");
		LanguageRegistry.instance().addStringLocalization("entity.EnhancedLeaper.name", "Enhanced Leaper");
		LanguageRegistry.instance().addStringLocalization("entity.Infector.name", "Infector");
		LanguageRegistry.instance().addStringLocalization("entity.EnhancedInfector.name", "Enhanced Infector");
		LanguageRegistry.instance().addStringLocalization("entity.Swarmer.name", "Swarmer");
		LanguageRegistry.instance().addStringLocalization("entity.Isaac.name", "Isaac Clarke");
		LanguageRegistry.instance().addStringLocalization("entity.SCAFlightWaster.name", "S.C.A.F Waster");
		LanguageRegistry.instance().addStringLocalization("entity.EarthGovWaster.name", "EarthGov Waster");
		LanguageRegistry.instance().addStringLocalization("entity.NicoleAlive.name", "Nicole Brennan (Alive)");
		LanguageRegistry.instance().addStringLocalization("entity.NicoleHalluccination.name", "Nicole Brennan (Halluccination)");
		LanguageRegistry.instance().addStringLocalization("entity.Exploder.name", "Exploder");
	}

	//Entity Parse
	public static int getUniqueEntityId()
	{
		do
		{
			startEntityId++;
		}
		while(EntityList.getStringFromID(startEntityId) !=null);

		return startEntityId;
	}

	public static void registerEntityEgg(Class <? extends Entity> entity, int primaryColor, int secondaryColor)
	{
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
}
