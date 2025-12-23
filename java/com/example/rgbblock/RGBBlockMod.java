package com.example.rgbblock;

import com.example.rgbblock.client.RGBBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.render.block.entity.v1.BlockEntityRendererRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RGBBlockMod implements ModInitializer, ClientModInitializer {

    public static final RGBBlock RGB_BLOCK = new RGBBlock();
    public static BlockEntityType<RGBBlockEntity> RGB_BLOCK_ENTITY_TYPE;

    @Override
    public void onInitialize() {
        // Server-side / common registration

        // Register block
        Registry.register(Registries.BLOCK, new Identifier("rgbblock", "rgb_block"), RGB_BLOCK);

        // Register item
        Registry.register(Registries.ITEM, new Identifier("rgbblock", "rgb_block"),
                new BlockItem(RGB_BLOCK, new Item.Settings()));

        // Register block entity type
        RGB_BLOCK_ENTITY_TYPE = Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                new Identifier("rgbblock", "rgb_block_entity"),
                BlockEntityType.Builder.create(RGBBlockEntity::new, RGB_BLOCK).build(null)
        );
    }

    @Override
    public void onInitializeClient() {
        // Client-side: block entity renderer
        BlockEntityRendererRegistry.INSTANCE.register(RGB_BLOCK_ENTITY_TYPE, RGBBlockEntityRenderer::new);
    }
}
