package lettuce.lack.keybinding;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.settings.IKeyConflictContext;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

/**
 * Created by tyler ellis on 10/7/2017.
 */
public class ModKeybindings {
    public static KeyBinding KeybindingDebug = new KeyBinding("Debug", Keyboard.KEY_LCONTROL,"key.categories.lack");

    public static void register() {
        int id = 0;

    }
}
