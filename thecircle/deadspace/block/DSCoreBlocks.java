package thecircle.deadspace.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thecircle.deadspace.main.DeadSpaceCore;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class DSCoreBlocks 
{
	public static Block corruptionBlock;
	public static Block DecorationBlock1;
	
	public static void init()
	{
		corruptionBlock = new DSBlockCorruptionBlock(500, Material.sand).setUnlocalizedName("The Corruption").setHardness(5.0F).setStepSound(Block.soundSandFootstep).setResistance(20000.0F);
		DecorationBlock1 = new DSBlock(501, Material.rock).setUnlocalizedName("Decoration Block 1").setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(20000.0F).setCreativeTab(DeadSpaceCore.tabDeadSpace);
		
		GameRegistry.registerBlock(corruptionBlock, DeadSpaceCore.DeadSpaceMod + corruptionBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecorationBlock1, DeadSpaceCore.DeadSpaceMod + DecorationBlock1.getUnlocalizedName().substring(5));
		
		LanguageRegistry.addName(corruptionBlock, "The Corruption");
		LanguageRegistry.addName(DecorationBlock1, "Decoration Block 1");

	}
}
