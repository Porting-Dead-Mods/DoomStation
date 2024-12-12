package com.portingdeadmods.doomstation;

import com.portingdeadmods.doomstation.registry.RegisterStuff;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

import java.io.IOException;

@Mod(DSMain.MODID)
public class DSMain
{
    public static final String MODID = "doomstation";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DSMain(IEventBus modEventBus, ModContainer modContainer) throws IOException {
        RegisterStuff.CREATIVE_MODE_TABS.register(modEventBus);
        RegisterStuff.ITEMS.register(modEventBus);
        ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
        Thread doomThread = new Thread(() -> {
            try {
                Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
                mochadoom.Engine.main(new String[]{});
                System.out.println("Engine started");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                Thread.currentThread().setContextClassLoader(originalClassLoader);
            }
        });
        doomThread.start();
        //modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

}
