package com.example.rgbblock;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class RGBBlockItem extends BlockItem {

    public RGBBlockItem(Block block) {
        super(block, new Item.Settings());
    }
}