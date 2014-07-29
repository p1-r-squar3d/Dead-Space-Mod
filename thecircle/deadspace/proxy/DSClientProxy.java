package thecircle.deadspace.proxy;

import net.minecraftforge.client.MinecraftForgeClient;
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
import thecircle.deadspace.entity.model.DSModelEarthGovWaster;
import thecircle.deadspace.entity.model.DSModelEngineerSlasher;
import thecircle.deadspace.entity.model.DSModelEnhancedInfector;
import thecircle.deadspace.entity.model.DSModelEnhancedLeaper;
import thecircle.deadspace.entity.model.DSModelEnhancedSlasher;
import thecircle.deadspace.entity.model.DSModelExploder;
import thecircle.deadspace.entity.model.DSModelInfector;
import thecircle.deadspace.entity.model.DSModelIsaac;
import thecircle.deadspace.entity.model.DSModelLeaper;
import thecircle.deadspace.entity.model.DSModelNicoleAlive;
import thecircle.deadspace.entity.model.DSModelNicoleHalluccination;
import thecircle.deadspace.entity.model.DSModelSCAFlightWaster;
import thecircle.deadspace.entity.model.DSModelSlasher;
import thecircle.deadspace.entity.model.DSModelSwarmer;
import thecircle.deadspace.entity.render.DSRenderEarthGovWaster;
import thecircle.deadspace.entity.render.DSRenderEngineerSlasher;
import thecircle.deadspace.entity.render.DSRenderEnhancedInfector;
import thecircle.deadspace.entity.render.DSRenderEnhancedLeaper;
import thecircle.deadspace.entity.render.DSRenderEnhancedSlasher;
import thecircle.deadspace.entity.render.DSRenderExploder;
import thecircle.deadspace.entity.render.DSRenderInfector;
import thecircle.deadspace.entity.render.DSRenderIsaac;
import thecircle.deadspace.entity.render.DSRenderLeaper;
import thecircle.deadspace.entity.render.DSRenderNicoleAlive;
import thecircle.deadspace.entity.render.DSRenderNicoleHalluccination;
import thecircle.deadspace.entity.render.DSRenderSCAFlightWaster;
import thecircle.deadspace.entity.render.DSRenderSlasher;
import thecircle.deadspace.entity.render.DSRenderSwarmer;
import thecircle.deadspace.item.DSCoreItems;
import thecircle.deadspace.item.render.DSRenderDevilHorns;
import thecircle.deadspace.item.render.DSRenderLineGun;
import thecircle.deadspace.item.render.DSRenderPlasmaCutter;
import thecircle.deadspace.item.render.DSRenderPulseRifle;
import thecircle.deadspace.item.render.DSRenderSeekerRifle;
import thecircle.deadspace.projectile.DSEntityDevilHornsProjectile;
import thecircle.deadspace.projectile.DSEntityLineGunProjectile;
import thecircle.deadspace.projectile.DSEntityPlasmaCutterProjectile;
import thecircle.deadspace.projectile.DSEntityPulseRifleProjectile;
import thecircle.deadspace.projectile.DSEntitySeekerRifleProjectile;
import thecircle.deadspace.projectile.DSRenderDevilHornsProjectile;
import thecircle.deadspace.projectile.DSRenderLineGunProjectile;
import thecircle.deadspace.projectile.DSRenderPlasmaCutterProjectile;
import thecircle.deadspace.projectile.DSRenderPulseRifleProjectile;
import thecircle.deadspace.projectile.DSRenderSeekerRifleProjectile;
import cpw.mods.fml.client.registry.RenderingRegistry;

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
	}
}