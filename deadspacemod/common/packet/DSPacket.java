package deadspacemod.common.packet;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import net.minecraft.network.packet.Packet250CustomPayload;

public class DSPacket {
	public static Packet250CustomPayload getPacket(byte key) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(2);
		DataOutputStream outputStream = new DataOutputStream(bos);
		try {
			outputStream.writeByte(DSPacketHandler.PACKET_KEYPRESS);
			outputStream.writeByte(key);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return new Packet250CustomPayload("DSPacketHandler", bos.toByteArray());
	}
}