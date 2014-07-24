package deadspacemod.client;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
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
import deadspacemod.client.entity.DSModelEarthGovWaster;
import deadspacemod.client.entity.DSModelEngineerSlasher;
import deadspacemod.client.entity.DSModelEnhancedInfector;
import deadspacemod.client.entity.DSModelEnhancedLeaper;
import deadspacemod.client.entity.DSModelEnhancedSlasher;
import deadspacemod.client.entity.DSModelExploder;
import deadspacemod.client.entity.DSModelInfector;
import deadspacemod.client.entity.DSModelIsaac;
import deadspacemod.client.entity.DSModelLeaper;
import deadspacemod.client.entity.DSModelNicoleAlive;
import deadspacemod.client.entity.DSModelNicoleHalluccination;
import deadspacemod.client.entity.DSModelSCAFlightWaster;
import deadspacemod.client.entity.DSModelSlasher;
import deadspacemod.client.entity.DSModelSwarmer;
import deadspacemod.client.entity.DSRenderEarthGovWaster;
import deadspacemod.client.entity.DSRenderEngineerSlasher;
import deadspacemod.client.entity.DSRenderEnhancedInfector;
import deadspacemod.client.entity.DSRenderEnhancedLeaper;
import deadspacemod.client.entity.DSRenderEnhancedSlasher;
import deadspacemod.client.entity.DSRenderExploder;
import deadspacemod.client.entity.DSRenderInfector;
import deadspacemod.client.entity.DSRenderIsaac;
import deadspacemod.client.entity.DSRenderLeaper;
import deadspacemod.client.entity.DSRenderNicoleAlive;
import deadspacemod.client.entity.DSRenderNicoleHalluccination;
import deadspacemod.client.entity.DSRenderSCAFlightWaster;
import deadspacemod.client.entity.DSRenderSlasher;
import deadspacemod.client.entity.DSRenderSwarmer;
import deadspacemod.client.itemrenders.DSRenderDevilHorns;
import deadspacemod.client.itemrenders.DSRenderLineGun;
import deadspacemod.client.itemrenders.DSRenderPlasmaCutter;
import deadspacemod.client.itemrenders.DSRenderPulseRifle;
import deadspacemod.client.itemrenders.DSRenderSeekerRifle;
import deadspacemod.client.projectiles.DSEntityDevilHornsProjectile;
import deadspacemod.client.projectiles.DSEntityLineGunProjectile;
import deadspacemod.client.projectiles.DSEntityPlasmaCutterProjectile;
import deadspacemod.client.projectiles.DSEntityPulseRifleProjectile;
import deadspacemod.client.projectiles.DSEntitySeekerRifleProjectile;
import deadspacemod.client.projectiles.DSRenderDevilHornsProjectile;
import deadspacemod.client.projectiles.DSRenderLineGunProjectile;
import deadspacemod.client.projectiles.DSRenderPlasmaCutterProjectile;
import deadspacemod.client.projectiles.DSRenderPulseRifleProjectile;
import deadspacemod.client.projectiles.DSRenderSeekerRifleProjectile;
import deadspacemod.common.DSCommonProxy;
import deadspacemod.common.items.DSCoreItems;
import deadspacemod.client.entity.DSEntityStalker;

public class DSClientProxy extends DSCommonProxy 
{
	@Override
	public void registerRenderers() 
	{
		//Weapon Render
		MinecraftForgeClient.registerItemRenderer(DSCoreItems.plasmaCutter.itemID, new DSRenderPlasmaCutter());
		MinecraftForgeClient.registerItemRenderer(DSCoreItems.seekerRifle.itemID, new DSRenderSeekerRifle());
		MinecraftForgeClient.registerItemRenderer(DSCoreItems.pulseRifle.itemID, new DSRenderPulseRifle());
		MinecraftForgeClient.registerItemRenderer(DSCoreItems.lineGun.itemID, new DSRenderLineGun());
		MinecraftForgeClient.registerItemRenderer(DSCoreItems.devilHorns.itemID, new DSRenderDevilHorns());
		
		RenderingRegistry.registerEntityRenderingHandler(DSEntityPlasmaCutterProjectile.class, new DSRenderPlasmaCutterProjectile());
		RenderingRegistry.registerEntityRenderingHandler(DSEntitySeekerRifleProjectile.class, new DSRenderSeekerRifleProjectile());
		RenderingRegistry.registerEntityRenderingHandler(DSEntityLineGunProjectile.class, new DSRenderLineGunProjectile());
		RenderingRegistry.registerEntityRenderingHandler(DSEntityPulseRifleProjectile.class, new DSRenderPulseRifleProjectile());
		RenderingRegistry.registerEntityRenderingHandler(DSEntityDevilHornsProjectile.class, new DSRenderDevilHornsProjectile());

		
		//Entity Render
		RenderingRegistry.registerEntityRenderingHandler(DSEntitySlasher.class, new DSRenderSlasher(new DSModelSlasher(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntityEngineerSlasher.class, new DSRenderEngineerSlasher(new DSModelEngineerSlasher(), 0.6F));
        RenderingRegistry.registerEntityRenderingHandler(DSEntityEnhancedSlasher.class, new DSRenderEnhancedSlasher(new DSModelEnhancedSlasher(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntityLeaper.class, new DSRenderLeaper(new DSModelLeaper(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntityEnhancedLeaper.class, new DSRenderEnhancedLeaper(new DSModelEnhancedLeaper(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntityInfector.class, new DSRenderInfector(new DSModelInfector(), 0.6F, 2.0F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntityEnhancedInfector.class, new DSRenderEnhancedInfector(new DSModelEnhancedInfector(), 0.6F, 2.0F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntitySwarmer.class, new DSRenderSwarmer(new DSModelSwarmer(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntityIsaac.class, new DSRenderIsaac(new DSModelIsaac(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntitySCAFlightWaster.class, new DSRenderSCAFlightWaster(new DSModelSCAFlightWaster(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntityEarthGovWaster.class, new DSRenderEarthGovWaster(new DSModelEarthGovWaster(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntityNicoleAlive.class, new DSRenderNicoleAlive(new DSModelNicoleAlive(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntityNicoleHalluccination.class, new DSRenderNicoleHalluccination(new DSModelNicoleHalluccination(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(DSEntityExploder.class, new DSRenderExploder(new DSModelExploder(), 0.6F));
                RenderingRegistry.registerEntityRenderingHandler(DSEntityStalker.class, new DSRenderStalker(new DSModelStalker(), 0.6F));
	}
}
