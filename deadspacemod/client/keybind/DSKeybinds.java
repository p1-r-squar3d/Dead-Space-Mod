package deadspacemod.client.keybind;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.Configuration;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.KeyBindingRegistry;

public class DSKeybinds {
	public static final int QUICKHEAL = 0;
	private static final String[] desc = { "Quick Heal"};
	private static final int[] keyValues = { Keyboard.KEY_H};
	public static final Map<Integer, Integer> DSKeyMap = new HashMap<Integer, Integer>();

	public static void init(Configuration config) {
		KeyBinding[] key = new KeyBinding[desc.length];
		boolean[] repeat = new boolean[desc.length];

		for (int i = 0; i < desc.length; ++i) {
			key[i] = new KeyBinding(desc[i], config.get(DSKeyHandlers.label, desc[i], keyValues[i]).getInt());
			repeat[i] = false;
			DSKeyMap.put(key[i].keyCode, i);
		}
		KeyBindingRegistry.registerKeyBinding(new DSKeyHandlers(key, repeat));
	}
}