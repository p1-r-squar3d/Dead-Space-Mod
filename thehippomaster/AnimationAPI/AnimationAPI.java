package thehippomaster.AnimationAPI;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = "AnimationAPI", name = "AnimationAPI", version = "1.1.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true, channels = {"AnimAPIEntity"}, packetHandler = AnimationAPI.class)
public class AnimationAPI implements IPacketHandler {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.initTimer();
	}
	
	public static boolean isClient() {
		return FMLCommonHandler.instance().getSide().isClient();
	}
	
	public static boolean isEffectiveClient() {
		return FMLCommonHandler.instance().getEffectiveSide().isClient();
	}
	
	public static void sendAnimPacket(IAnimatedEntity entity, int animID) {
		if(isEffectiveClient()) return;
		entity.setAnimID(animID);
		ByteArrayOutputStream bos = new ByteArrayOutputStream(5);
		DataOutputStream out = new DataOutputStream(bos);
		try {
			out.writeByte(animID);
			out.writeInt(((Entity)entity).entityId);
		} catch(Exception e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = "AnimAPIEntity";
		packet.data = bos.toByteArray();
		packet.length = bos.size();
		PacketDispatcher.sendPacketToAllPlayers(packet);
	}
	
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
		if(packet.channel.startsWith("AnimAPIEntity")) {
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(packet.data));
			int id = -1, entityId = -1;
			try {
				id = in.readByte();
				entityId = in.readInt();
			} catch(Exception e) {
				e.printStackTrace();
			}
			IAnimatedEntity entity = (IAnimatedEntity)Minecraft.getMinecraft().theWorld.getEntityByID(entityId);
			if(entity != null && id != -1) {
				entity.setAnimID(id);
				if(id == 0) entity.setAnimTick(0);
			}
		}
	}
	
	@Instance("AnimationAPI")
	public static AnimationAPI instance;
	@SidedProxy(clientSide="thehippomaster.AnimationAPI.client.ClientProxy", serverSide="thehippomaster.AnimationAPI.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String[] fTimer;
	
	static {
		fTimer = new String[] {"field_71428_T", "S", "timer"};
	}
}
