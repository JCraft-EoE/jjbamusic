package com.jcraft_eoe.jjbamusic.fabric;

import net.fabricmc.api.ModInitializer;

import com.jcraft_eoe.jjbamusic.JjbaMusic;

public final class JjbaMusicFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        JjbaMusic.init();
    }
}
