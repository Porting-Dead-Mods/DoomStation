package com.portingdeadmods.doomstation.content.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class DoomStationItem extends Item {
    public DoomStationItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }
}
