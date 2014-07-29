package thecircle.deadspace.key;

import java.util.EnumSet;

import thecircle.deadspace.item.DSCoreItems;
import thecircle.deadspace.packet.DSPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;

public class DSKeyHandlers extends KeyHandler {

	private EnumSet tickTypes = EnumSet.of(TickType.CLIENT);
	public static String label = "keg";

	public DSKeyHandlers(KeyBinding[] keyBindings, boolean[] repeatings) {
		super(keyBindings, repeatings);
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat) {
		Minecraft mc = Minecraft.getMinecraft();

		if (tickEnd && DSKeybinds.DSKeyMap.containsKey(kb.keyCode) && FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT && FMLClientHandler.instance().getClient().inGameHasFocus) {
			EntityClientPlayerMP player = FMLClientHandler.instance().getClient().thePlayer;

			switch (DSKeybinds.DSKeyMap.get(kb.keyCode)) {
				case DSKeybinds.QUICKHEAL:
					player.sendQueue.addToSendQueue(DSPacket.getPacket((byte) DSKeybinds.DSKeyMap.get(kb.keyCode).byteValue()));
					if (player.inventory.hasItem(DSCoreItems.smallMedPack.itemID)) {
						if (player.getHealth() != player.getMaxHealth()) { 
						player.inventory.consumeInventoryItem(DSCoreItems.smallMedPack.itemID);
						player.heal(12.0F);
						}
					}
					else
					{
						player.addChatMessage(EnumChatFormatting.AQUA + "[RIG] " + EnumChatFormatting.WHITE + " No MedPacks detected in the inventory!");
					}
					break;
			}
		}
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {
	}

	@Override
	public EnumSet<TickType> ticks() {
		return tickTypes;
	}
}