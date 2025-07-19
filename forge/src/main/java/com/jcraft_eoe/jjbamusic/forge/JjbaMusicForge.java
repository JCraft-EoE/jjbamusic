package com.jcraft_eoe.jjbamusic.forge;

import com.jcraft_eoe.jjbamusic.forge.loot.JMForgeLootModifiers;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import com.jcraft_eoe.jjbamusic.JjbaMusic;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(JjbaMusic.MOD_ID)
public final class JjbaMusicForge {
    public JjbaMusicForge() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(JjbaMusic.MOD_ID, modBus);
        // Run our common setup.
        JjbaMusic.init();
        JMForgeLootModifiers.register(modBus);
    }
}
