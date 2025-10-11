package com.jcraft_eoe.jjbamusic.forge;

import com.jcraft_eoe.jjbamusic.forge.loot.JMForgeLootModifiers;

import com.jcraft_eoe.jjbamusic.JjbaMusic;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(JjbaMusic.MOD_ID)
public final class JjbaMusicForge {
    public JjbaMusicForge(final IEventBus modBus) {
        // Run our common setup.
        JjbaMusic.init();
        JMForgeLootModifiers.register(modBus);
    }
}
