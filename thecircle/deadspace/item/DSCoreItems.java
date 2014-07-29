package thecircle.deadspace.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class DSCoreItems {

	public static Item ABF5PlasmaSaw;
	public static Item SHB1PlasmaSaw;
	public static Item TIC2PlasmaSaw;
	public static Item UJD3PlasmaSaw;
	public static Item VKE4PlasmaSaw;

	public static Item plasmaCutter;
	public static Item seekerRifle;
	public static Item pulseRifle;
	public static Item lineGun;
	public static Item devilHorns;

	public static Item tungsten;
	public static Item somaticGel;
	public static Item semicunductor;
	public static Item transducer;
	public static Item scrapMetal;

	public static Item smallMedPack;
	public static Item mediumMedPack;
	public static Item largeMedPack;

	public static Item credits;
	public static Item powerNode;

	public static Item plasmaEnergy;
	public static Item pulseRounds;
	public static Item lineRacks;
	public static Item seekerShells;

	public static Item creativeTabIcon;

	public static EnumToolMaterial EnumToolMaterialPlasmaSaw1 = EnumHelper.addToolMaterial("PlasmaWeapon", 2, 500, 6.0F, 2, 30);
	public static EnumToolMaterial EnumToolMaterialPlasmaSaw2 = EnumHelper.addToolMaterial("PlasmaWeapon", 2, 1000, 6.0F, 4, 30);
	public static EnumToolMaterial EnumToolMaterialPlasmaSaw3 = EnumHelper.addToolMaterial("PlasmaWeapon", 2, 1500, 6.0F, 6, 30);
	public static EnumToolMaterial EnumToolMaterialPlasmaSaw4 = EnumHelper.addToolMaterial("PlasmaWeapon", 2, 2000, 6.0F, 8, 30);
	public static EnumToolMaterial EnumToolMaterialPlasmaSaw5 = EnumHelper.addToolMaterial("PlasmaWeapon", 2, 2500, 6.0F, 20, 30);

	public static void init() {
		tungsten = new DSItem(2013).setUnlocalizedName("Tungsten");
		somaticGel = new DSItem(2014).setUnlocalizedName("Somatic Gel");
		semicunductor = new DSItem(2015).setUnlocalizedName("Semicunductor");
		transducer = new DSItem(2016).setUnlocalizedName("Transducer");
		scrapMetal = new DSItem(2017).setUnlocalizedName("Scrap Metal");

		smallMedPack = new DSItemMedPackSmall(2018).setUnlocalizedName("Small Med Pack");
		mediumMedPack = new DSItemMedPackMedium(2019).setUnlocalizedName("Medium Med Pack");
		largeMedPack = new DSItemMedPackLarge(2020).setUnlocalizedName("Large Med Pack");

		credits = new DSCredits(2021).setUnlocalizedName("Credits");
		powerNode = new DSItem(2022).setUnlocalizedName("Power Node");

		plasmaEnergy = new DSItem(2023).setUnlocalizedName("Plasma Energy");
		pulseRounds = new DSItem(2024).setUnlocalizedName("Pulse Rounds");
		lineRacks = new DSItem(2025).setUnlocalizedName("Line Racks");
		seekerShells = new DSItem(2026).setUnlocalizedName("Seeker Shells");

		creativeTabIcon = new DSItemCreativeTabIcon(9000).setUnlocalizedName("red_marker_logo");

		ABF5PlasmaSaw = new DSItemPlasmaSaw(9014, EnumToolMaterialPlasmaSaw1).setUnlocalizedName("AB-F5 Plasma Saw");
		SHB1PlasmaSaw = new DSItemPlasmaSaw(9015, EnumToolMaterialPlasmaSaw2).setUnlocalizedName("SH-B1 Plasma Saw");
		TIC2PlasmaSaw = new DSItemPlasmaSaw(9016, EnumToolMaterialPlasmaSaw3).setUnlocalizedName("TI-C2 Plasma Saw");
		UJD3PlasmaSaw = new DSItemPlasmaSaw(9017, EnumToolMaterialPlasmaSaw4).setUnlocalizedName("UJ-D3 Plasma Saw");
		VKE4PlasmaSaw = new DSItemPlasmaSaw(9018, EnumToolMaterialPlasmaSaw5).setUnlocalizedName("VK-E4 Plasma Saw");

		plasmaCutter = new DSItemPlasmaCutter(9020).setFull3D().setUnlocalizedName("211-V Plasma Cutter");
		seekerRifle = new DSItemSeekerRifle(9021).setFull3D().setUnlocalizedName("Seeker Rifle");
		pulseRifle = new DSItemPulseRifle(9022).setFull3D().setUnlocalizedName("SWS Motorized Pulse Rifle");
		lineGun = new DSItemLineGun(9023).setFull3D().setUnlocalizedName("IM-822 Ore Cutter Line Gun");
		devilHorns = new DSItemDevilHorns(9024).setFull3D().setUnlocalizedName("The Devil Horns");

		LanguageRegistry.addName(tungsten, "Tungsten");
		LanguageRegistry.addName(somaticGel, "Somatic Gel");
		LanguageRegistry.addName(semicunductor, "Semicunductor");
		LanguageRegistry.addName(transducer, "Transducer");
		LanguageRegistry.addName(scrapMetal, "Scrap Metal");

		LanguageRegistry.addName(smallMedPack, "Small MedPack");
		LanguageRegistry.addName(mediumMedPack, "Medium MedPack");
		LanguageRegistry.addName(largeMedPack, "Large MedPack");

		LanguageRegistry.addName(credits, "Credits");
		LanguageRegistry.addName(powerNode, "Power Node");

		LanguageRegistry.addName(plasmaEnergy, "Plasma Energy");
		LanguageRegistry.addName(pulseRounds, "Pulse Rounds");
		LanguageRegistry.addName(lineRacks, "Line Racks");
		LanguageRegistry.addName(seekerShells, "Seeker Shells");

		LanguageRegistry.addName(creativeTabIcon, "red_marker_logo");
		GameRegistry.registerItem(creativeTabIcon, "red_marker_logo");

		LanguageRegistry.addName(ABF5PlasmaSaw, "AB-F5 Plasma Saw");
		LanguageRegistry.addName(SHB1PlasmaSaw, "SH-B1 Plasma Saw");
		LanguageRegistry.addName(TIC2PlasmaSaw, "TI-C2 Plasma Saw");
		LanguageRegistry.addName(UJD3PlasmaSaw, "UJ-D3 Plasma Saw");
		LanguageRegistry.addName(VKE4PlasmaSaw, "VK-E4 Plasma Saw");

		LanguageRegistry.addName(plasmaCutter, "211-V Plasma Cutter");
		LanguageRegistry.addName(seekerRifle, "Seeker Rifle");
		LanguageRegistry.addName(lineGun, "IM-822 Ore Cutter Line Gun");
		LanguageRegistry.addName(pulseRifle, "SWS Motorized Pulse Rifle");
		LanguageRegistry.addName(devilHorns, "The Devil Horns");

	}
}
