package com.example.rgbblock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class RGBBlock extends Block {
    public RGBBlock() {
        super(Settings.of(Material.METAL).strength(1.5f));
    }

    @Override
    public boolean hasBlockEntity() {
        return true;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new RGBBlockEntity(pos, state);
    }
}
