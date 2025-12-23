package com.example.rgbblock.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class RGBBlockModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModKeybinds.register();

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (ModKeybinds.openRGBBlockUI.wasPressed()) {
                MinecraftClient mc = MinecraftClient.getInstance();
                // Toggle screen
                if (mc.currentScreen instanceof RGBBlockScreen) {
                    mc.setScreen(null);
                } else {
                    mc.setScreen(new RGBBlockScreen());
                }
            }
        });
    }
}
