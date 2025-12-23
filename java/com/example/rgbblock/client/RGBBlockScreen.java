package com.example.rgbblock.client;

import com.example.rgbblock.RGBBlockMod;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class RGBBlockScreen extends Screen {

    private int r = 255, g = 0, b = 0;
    private int textureIndex = 0;
    private final String[] textures = {"stone", "dirt", "grass"}; // Add more blocks

    protected RGBBlockScreen() { super(Text.literal("RGB Block UI")); }

    @Override
    protected void init() {
        int x = width / 2 - 100;
        int y = height / 2 - 70;

        // R, G, B sliders (0-255)
        addDrawableChild(ButtonWidget.builder(Text.literal("R: " + r), b -> r = (r + 1) % 256)
                .dimensions(x, y, 200, 20).build());
        addDrawableChild(ButtonWidget.builder(Text.literal("G: " + g), b -> g = (g + 1) % 256)
                .dimensions(x, y + 25, 200, 20).build());
        addDrawableChild(ButtonWidget.builder(Text.literal("B: " + b), b -> b = (b + 1) % 256)
                .dimensions(x, y + 50, 200, 20).build());

        // Texture selector
        addDrawableChild(ButtonWidget.builder(Text.literal("Texture: " + textures[textureIndex]), b -> {
            textureIndex = (textureIndex + 1) % textures.length;
            b.setMessage(Text.literal("Texture: " + textures[textureIndex]));
        }).dimensions(x, y + 75, 200, 20).build());

        // Apply block
        addDrawableChild(ButtonWidget.builder(Text.literal("Create Block"), b -> {
            var blockEntity = RGBBlockMod.RGB_BLOCK_ENTITY_TYPE.instantiate(
                    RGBBlockMod.RGB_BLOCK.getDefaultState(), null
            );
            blockEntity.r = r;
            blockEntity.g = g;
            blockEntity.b = b;
            blockEntity.texture = textures[textureIndex];
        }).dimensions(x, y + 100, 200, 20).build());
    }
}
