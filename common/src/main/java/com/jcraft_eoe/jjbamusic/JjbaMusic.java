package com.jcraft_eoe.jjbamusic;

import net.minecraft.resources.ResourceLocation;

public final class JjbaMusic {
    public static final String MOD_ID = "jjbamusic";

    public static void init() {
        JMSoundRegistry.SOUNDS.register();
        JMItemRegistry.ITEM_REGISTRY.register();
        JMLootTableHelper.registerMusicDiscLootTables();
        JMCreativeMenuTabRegistry.register();
    }

    public static ResourceLocation id(String location) {
        return new ResourceLocation(MOD_ID, location);
    }
}
