package com.example.rgbblock.client;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ModKeybinds {

    public static KeyBinding openRGBBlockUI;

    public static void register() {
        openRGBBlockUI = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.rgbblockmod.open_ui",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_B,
                "category.rgbblockmod"
        ));
    }
}
