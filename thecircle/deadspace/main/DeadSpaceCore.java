package thecircle.deadspace.main;

import net.minecraft.block.BlockButtonStone;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import thecircle.deadspace.block.DSCoreBlocks;
import thecircle.deadspace.entity.DSEntities;
import thecircle.deadspace.entity.DSEntityEarthGovWaster;
import thecircle.deadspace.entity.DSEntityEngineerSlasher;
import thecircle.deadspace.entity.DSEntityEnhancedInfector;
import thecircle.deadspace.entity.DSEntityEnhancedLeaper;
import thecircle.deadspace.entity.DSEntityEnhancedSlasher;
import thecircle.deadspace.entity.DSEntityExploder;
import thecircle.deadspace.entity.DSEntityInfector;
import thecircle.deadspace.entity.DSEntityIsaac;
import thecircle.deadspace.entity.DSEntityLeaper;
import thecircle.deadspace.entity.DSEntityNicoleAlive;
import thecircle.deadspace.entity.DSEntityNicoleHalluccination;
import thecircle.deadspace.entity.DSEntitySCAFlightWaster;
import thecircle.deadspace.entity.DSEntitySlasher;
import thecircle.deadspace.entity.DSEntitySwarmer;
import thecircle.deadspace.handler.DSConnectionHandler;
import thecircle.deadspace.item.DSCoreItems;
import thecircle.deadspace.item.tab.DSCreativeTab;
import thecircle.deadspace.key.DSKeybinds;
import thecircle.deadspace.packet.DSPacketHandler;
import thecircle.deadspace.projectile.DSEntityDevilHornsProjectile;
import thecircle.deadspace.projectile.DSEntityLineGunProjectile;
import thecircle.deadspace.projectile.DSEntityPlasmaCutterProjectile;
import thecircle.deadspace.projectile.DSEntityPulseRifleProjectile;
import thecircle.deadspace.projectile.DSEntitySeekerRifleProjectile;
import thecircle.deadspace.proxy.DSCommonProxy;
import thecircle.deadspace.sound.DSSounds;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = DeadSpaceCore.ID, name = DeadSpaceCore.NAME, version = DeadSpaceCore.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, packetHandler = DSPacketHandler.class, channels = { DeadSpaceCore.CHANNEL })
public class DeadSpaceCore {

	public static final String ID = "deadspacemod";
	public static final String NAME = "Dead Space mod for Minecraft";
	public static final String VERSION = "Beta 0.4.0";
	public static final String CHANNEL = "Dead Space";
	@SidedProxy(clientSide = "thecircle.deadspace.proxy.DSClientProxy", serverSide = "thecircle.deadspace.proxy.DSCommonProxy")
	public static DSCommonProxy proxy;

	public static final String DeadSpaceMod = "MasQuitt0_DeadSpaceMod";
	public static CreativeTabs tabDeadSpace;

	@EventHandler
	public void preLoad(FMLPreInitializationEvent e) {
		Configuration c = new Configuration(e.getSuggestedConfigurationFile());
		if (FMLCommonHandler.instance().getSide().isClient()) DSKeybinds.init(c);
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		tabDeadSpace = new DSCreativeTab("DeadSpace");
		LanguageRegistry.instance().addStringLocalization("itemGroup.DeadSpace", "en_US", "Dead Space");

		DSCoreBlocks.init();
		DSCoreItems.init();
		DSEntities.init();

		proxy.registerRenderers();

		MinecraftForge.EVENT_BUS.register(new DSSounds());
		NetworkRegistry.instance().registerConnectionHandler(new DSConnectionHandler());

		EntityRegistry.registerGlobalEntityID(DSEntityEngineerSlasher.class, "EngineerSlasher", 1);
		EntityRegistry.registerGlobalEntityID(DSEntitySlasher.class, "Slasher", 2);
		EntityRegistry.registerGlobalEntityID(DSEntityEnhancedSlasher.class, "EnhancedSlasher", 3);
		EntityRegistry.registerGlobalEntityID(DSEntityLeaper.class, "Leaper", 4);
		EntityRegistry.registerGlobalEntityID(DSEntityEnhancedLeaper.class, "EnhancedLeaper", 5);
		EntityRegistry.registerGlobalEntityID(DSEntityInfector.class, "Infector", 6);
		EntityRegistry.registerGlobalEntityID(DSEntityEnhancedInfector.class, "EnhancedInfector", 7);
		EntityRegistry.registerGlobalEntityID(DSEntitySwarmer.class, "Swarmer", 8);
		EntityRegistry.registerGlobalEntityID(DSEntityIsaac.class, "Isaac", 9);
		EntityRegistry.registerGlobalEntityID(DSEntitySCAFlightWaster.class, "SCAFlightWaster", 10);
		EntityRegistry.registerGlobalEntityID(DSEntityEarthGovWaster.class, "EarthGovWaster", 11);
		EntityRegistry.registerGlobalEntityID(DSEntityNicoleAlive.class, "NicoleAlive", 12);
		EntityRegistry.registerGlobalEntityID(DSEntityNicoleHalluccination.class, "NicoleHalluccination", 13);
		EntityRegistry.registerGlobalEntityID(DSEntityExploder.class, "Exploder", 14);

		EntityRegistry.registerModEntity(DSEntityPlasmaCutterProjectile.class, "PlasmsaCutterProjectile", 50, this, 150, 1, true);
		EntityRegistry.registerModEntity(DSEntitySeekerRifleProjectile.class, "SeekerRifleProjectile", 51, this, 150, 1, true);
		EntityRegistry.registerModEntity(DSEntityLineGunProjectile.class, "LineGunProjectile", 52, this, 150, 1, true);
		EntityRegistry.registerModEntity(DSEntityPulseRifleProjectile.class, "PulseRifleProjectile", 53, this, 150, 1, true);
		EntityRegistry.registerModEntity(DSEntityDevilHornsProjectile.class, "DevilHornsProjectile", 54, this, 150, 1, true);

		GameRegistry.addRecipe(new ItemStack(DSCoreItems.smallMedPack, 1), new Object[] { "MBM", "MSM", "MSM", 'S',
				DSCoreItems.somaticGel, 'M', DSCoreItems.scrapMetal, 'B', BlockButtonStone.stoneButton });

		GameRegistry.addRecipe(new ItemStack(DSCoreItems.mediumMedPack, 1), new Object[] { " SS", " MM", 'S',
				DSCoreItems.smallMedPack, 'M', DSCoreItems.scrapMetal });

		GameRegistry.addRecipe(new ItemStack(DSCoreItems.largeMedPack, 1), new Object[] { "SSS", "MIM", 'S',
				DSCoreItems.smallMedPack, 'M', DSCoreItems.scrapMetal, 'I', Item.ingotIron });
	}
}