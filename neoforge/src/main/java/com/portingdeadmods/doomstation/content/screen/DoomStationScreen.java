package com.portingdeadmods.doomstation.content.screen;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class DoomStationScreen extends Screen {
    private final String type;
    public DoomStationScreen(Component title) {
        super(title);
        this.type = title.toString();
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
