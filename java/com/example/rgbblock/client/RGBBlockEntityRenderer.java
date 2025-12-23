package com.example.rgbblock.client;

import com.example.rgbblock.RGBBlockEntity;
import com.mojang.blaze3d.vertex.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;

public class RGBBlockEntityRenderer implements BlockEntityRenderer<RGBBlockEntity> {

    public RGBBlockEntityRenderer(BlockEntityRendererFactory.Context ctx) {}

    @Override
    public void render(RGBBlockEntity blockEntity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {

        // Here you can render just one face with blockEntity.r, g, b
        // For simplicity, you can use a colored quad on the front face
        // Or use a baked model if you want a texture preview
    }
}
