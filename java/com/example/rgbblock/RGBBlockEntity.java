package com.example.rgbblock;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class RGBBlockEntity extends BlockEntity {

    public int r = 255;
    public int g = 0;
    public int b = 0;
    public String texture = "stone";

    public RGBBlockEntity(BlockPos pos, BlockState state) {
        super(RGBBlockMod.RGB_BLOCK_ENTITY_TYPE, pos, state);
    }
}
