package thecircle.deadspace.packet;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.EnumChatFormatting;
import thecircle.deadspace.item.DSCoreItems;
import thecircle.deadspace.key.DSKeybinds;
import thecircle.deadspace.main.DSExtendedPlayer;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class DSPacketHandler implements IPacketHandler {
	/** Packet IDs */
	public static final byte PACKET_KEYPRESS = 1, PACKET_EXTENDEDPLAYER = 2;

	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
		DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
		byte packetType;
		try {
			packetType = inputStream.readByte();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		switch (packetType) {
			case PACKET_KEYPRESS:
				handlePacketKeyPress(packet, (EntityPlayer) player, inputStream);
				break;
			case PACKET_EXTENDEDPLAYER:
				
				break;
		}
	}
	/**
	 * Handles packet pertaining to keybind presses
	 * @author p1-r_squar3d
	 */
	private void handlePacketKeyPress(Packet250CustomPayload packet, EntityPlayer player, DataInputStream inputStream) {
		byte key;
		try {
			key = inputStream.readByte();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		switch (key) {
			case DSKeybinds.QUICKHEAL:
				if (player.inventory.hasItem(DSCoreItems.smallMedPack.itemID)) {
					if (player.getHealth() != player.getMaxHealth()) { 
					player.inventory.consumeInventoryItem(DSCoreItems.smallMedPack.itemID);
					player.heal(200.0F);
					}
				}
				else
				{
					player.addChatMessage(EnumChatFormatting.AQUA + "[MEDPacks] " + EnumChatFormatting.WHITE + " No MedPacks detected in the inventory!");
				}
				break;
		}
	}
	private void handleExtendedProperties(Packet250CustomPayload packet, Player player)
	{
		DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));

		DSExtendedPlayer props = DSExtendedPlayer.get((EntityPlayer) player);

		try {
			props.setMaxRIGPoints(inputStream.readInt());
			props.setCurrentRIGPoints(inputStream.readInt());
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		System.out.println("[PACKET] DNA Points from packet: " + props.getCurrentRIGPoints() + "/" + props.getMaxRIGPoints());
	}
}