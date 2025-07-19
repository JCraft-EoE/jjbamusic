package com.jcraft_eoe.jjbamusic.forge;

import net.minecraftforge.fml.common.Mod;

import com.jcraft_eoe.jjbamusic.JjbaMusic;

@Mod(JjbaMusic.MOD_ID)
public final class JjbaMusicForge {
    public JjbaMusicForge() {
        // Run our common setup.
        JjbaMusic.init();
    }
}
