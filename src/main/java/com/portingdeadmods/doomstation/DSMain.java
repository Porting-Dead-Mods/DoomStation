package com.portingdeadmods.doomstation;

import com.portingdeadmods.doomstation.registry.RegisterStuff;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(DSMain.MODID)
public class DSMain
{
    public static final String MODID = "doomstation";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DSMain(IEventBus modEventBus, ModContainer modContainer) {
        RegisterStuff.CREATIVE_MODE_TABS.register(modEventBus);
        RegisterStuff.ITEMS.register(modEventBus);
        //modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

}
