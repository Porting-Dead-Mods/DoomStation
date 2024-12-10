package com.portingdeadmods.doomstation.registry;
import com.portingdeadmods.doomstation.content.item.DoomStationItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.portingdeadmods.doomstation.DSMain.MODID;

public class RegisterStuff {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<DoomStationItem> DOOM_STATION = ITEMS.register("doom_station", () -> new DoomStationItem(new Item.Properties()));

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DOOM_TAB = CREATIVE_MODE_TABS.register("doomstation", () -> CreativeModeTab.builder()
            .title(Component.literal("DoomStation"))
            .icon(() ->  DOOM_STATION.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(DOOM_STATION.get());
            }).build());

}
