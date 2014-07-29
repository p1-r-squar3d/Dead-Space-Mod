package thecircle.deadspace.main;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

public class DSExtendedPlayer implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "DSExtendedPlayer";
	private static EntityPlayer player;
	private static int maxRIGPoints;

	public static final int RIGPoints_WATCHER = 30; // 0

	public DSExtendedPlayer(EntityPlayer player) {

		this.player = player;
		this.player.getDataWatcher().addObject(RIGPoints_WATCHER, this.maxRIGPoints);
		this.maxRIGPoints = (int)player.getMaxHealth();
	}

	public static void sync() {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
		DataOutputStream outputStream = new DataOutputStream(bos);

		try {
			outputStream.writeInt(maxRIGPoints);
			outputStream.writeInt(player.getDataWatcher().getWatchableObjectInt(RIGPoints_WATCHER));
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		Packet250CustomPayload packet = new Packet250CustomPayload(DeadSpaceCore.CHANNEL, bos.toByteArray());

		if (!player.worldObj.isRemote) {
			EntityPlayerMP player1 = (EntityPlayerMP) player;
			PacketDispatcher.sendPacketToPlayer(packet, (Player) player1);
		}
	}

	public static final void register(EntityPlayer player) {
		player.registerExtendedProperties(DSExtendedPlayer.EXT_PROP_NAME, new DSExtendedPlayer(player));
	}

	public static final DSExtendedPlayer get(EntityPlayer player) {
		return (DSExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();

		properties.setInteger("DefaultRIGPoints", this.player.getDataWatcher().getWatchableObjectInt(RIGPoints_WATCHER));
		properties.setInteger("MaxRIGPoints", this.maxRIGPoints);

		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);

		this.player.getDataWatcher().updateObject(RIGPoints_WATCHER, properties.getInteger("DefaultRIGPoints"));
		this.maxRIGPoints = properties.getInteger("MaxRIGPoints");

		System.out.println("[DS PROPS] RIG Points from NBT: " + this.RIGPoints_WATCHER + " / " + this.maxRIGPoints);
	}

	@Override
	public void init(Entity entity, World world) {

	}

	public boolean consumeRIGPoints(int amount) {
		int RIGPoints = this.player.getDataWatcher().getWatchableObjectInt(RIGPoints_WATCHER);

		boolean sufficient = amount <= RIGPoints;
		RIGPoints -= (amount < RIGPoints ? amount : RIGPoints);

		this.player.getDataWatcher().updateObject(RIGPoints_WATCHER, RIGPoints);

		return sufficient;
	}

	public final void replenishRIGPoints() {
		this.player.getDataWatcher().updateObject(RIGPoints_WATCHER, this.maxRIGPoints);
	}

	public final int getCurrentRIGPoints() {
		return this.player.getDataWatcher().getWatchableObjectInt(RIGPoints_WATCHER);
	}

	public final int getMaxRIGPoints() {
		return this.maxRIGPoints;
	}

	public final void setCurrentRIGPoints(int amount) {
		this.player.getDataWatcher().updateObject(RIGPoints_WATCHER, (amount < this.maxRIGPoints ? amount : this.maxRIGPoints));
	}

	public void setMaxRIGPoints(int amount) {
		this.maxRIGPoints = (amount > 0 ? amount : 0);
		this.sync();
	}
}