package deadspacemod.common;

import net.minecraft.block.BlockButtonStone;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import deadspacemod.client.entity.DSEntities;
import deadspacemod.client.entity.DSEntityEarthGovWaster;
import deadspacemod.client.entity.DSEntityEngineerSlasher;
import deadspacemod.client.entity.DSEntityEnhancedInfector;
import deadspacemod.client.entity.DSEntityEnhancedLeaper;
import deadspacemod.client.entity.DSEntityEnhancedSlasher;
import deadspacemod.client.entity.DSEntityExploder;
import deadspacemod.client.entity.DSEntityInfector;
import deadspacemod.client.entity.DSEntityIsaac;
import deadspacemod.client.entity.DSEntityLeaper;
import deadspacemod.client.entity.DSEntityNicoleAlive;
import deadspacemod.client.entity.DSEntityNicoleHalluccination;
import deadspacemod.client.entity.DSEntitySCAFlightWaster;
import deadspacemod.client.entity.DSEntitySlasher;
import deadspacemod.client.entity.DSEntitySwarmer;
import deadspacemod.client.handler.DSConnectionHandler;
import deadspacemod.client.keybind.DSKeybinds;
import deadspacemod.client.projectiles.DSEntityDevilHornsProjectile;
import deadspacemod.client.projectiles.DSEntityLineGunProjectile;
import deadspacemod.client.projectiles.DSEntityPlasmaCutterProjectile;
import deadspacemod.client.projectiles.DSEntityPulseRifleProjectile;
import deadspacemod.client.projectiles.DSEntitySeekerRifleProjectile;
import deadspacemod.client.sound.DSSounds;
import deadspacemod.common.blocks.DSCoreBlocks;
import deadspacemod.common.items.DSCoreItems;
import deadspacemod.common.packet.DSPacketHandler;

@Mod(modid=DeadSpaceCore.ID, name=DeadSpaceCore.NAME, version=NAME)

public class DeadSpaceCore
{
	public static final String ID = "deadspacemod";
	public static final String NAME = "Dead Space mod for Minecraft";
	public static final String VERSION = "Beta 0.4.0";
	public static final String CHANNEL = "Dead Space";
	@SidedProxy(clientSide = "deadspacemod.client.DSClientProxy", serverSide = "deadspacemod.common.DSCommonProxy")
	public static DSCommonProxy proxy;
	
	public static final String DeadSpaceMod = "MasQuitt0_DeadSpaceMod";
	public static CreativeTabs tabDeadSpace;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Configuration c = new Configuration(e.getSuggestedConfigurationFile());		
		if(FMLCommonHandler.instance().getSide().isClient())DSKeybinds.init(c);
	}
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	
		
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
                EntityRegistry.registerGobalEntityID(DSEntityStalker.class "Stalker",10);
		
		EntityRegistry.registerModEntity(DSEntityPlasmaCutterProjectile.class, "PlasmsaCutterProjectile", 50, this, 150, 1, true);
		EntityRegistry.registerModEntity(DSEntitySeekerRifleProjectile.class, "SeekerRifleProjectile", 51, this, 150, 1, true);
		EntityRegistry.registerModEntity(DSEntityLineGunProjectile.class, "LineGunProjectile", 52, this, 150, 1, true);
		EntityRegistry.registerModEntity(DSEntityPulseRifleProjectile.class, "PulseRifleProjectile", 53, this, 150, 1, true);
		EntityRegistry.registerModEntity(DSEntityDevilHornsProjectile.class, "DevilHornsProjectile", 54, this, 150, 1, true);

		GameRegistry.addRecipe(new ItemStack(DSCoreItems.smallMedPack, 1),  new Object[]{
			"MBM", "MSM", "MSM", 'S', DSCoreItems.somaticGel, 'M', DSCoreItems.scrapMetal, 'B', BlockButtonStone.stoneButton
		});

		GameRegistry.addRecipe(new ItemStack(DSCoreItems.mediumMedPack, 1),  new Object[]{
			" SS", " MM", 'S', DSCoreItems.smallMedPack, 'M', DSCoreItems.scrapMetal
		});

		GameRegistry.addRecipe(new ItemStack(DSCoreItems.largeMedPack, 1),  new Object[]{
			"SSS", "MIM", 'S', DSCoreItems.smallMedPack, 'M', DSCoreItems.scrapMetal, 'I', Item.ingotIron
		});
                 @EventHandler
                 public void postInit(FMLPostInitializationEvent event) {
         
                 }
              }
            }
