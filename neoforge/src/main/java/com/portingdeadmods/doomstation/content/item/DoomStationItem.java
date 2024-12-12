package com.portingdeadmods.doomstation.content.item;

import com.portingdeadmods.doomstation.content.screen.DoomStationScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DoomStationItem extends Item {
    public DoomStationItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemstack = player.getItemInHand(usedHand);
        if (!level.isClientSide) {
            return InteractionResultHolder.pass(itemstack);
        }

        Minecraft.getInstance().setScreen(new DoomStationScreen(Component.literal("DoomStation 1")));
        return InteractionResultHolder.pass(player.getItemInHand(usedHand));
    }
}
