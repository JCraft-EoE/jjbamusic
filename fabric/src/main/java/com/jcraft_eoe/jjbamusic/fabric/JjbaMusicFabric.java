package com.jcraft_eoe.jjbamusic.fabric;

import com.jcraft_eoe.jjbamusic.JMLootTableHelper;
import net.fabricmc.api.ModInitializer;

import com.jcraft_eoe.jjbamusic.JjbaMusic;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.function.Consumer;

public final class JjbaMusicFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        JjbaMusic.init();
        // modify loot tables
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            for (Consumer<LootTable.Builder> modification : JMLootTableHelper.modifications.get(id)) {
                modification.accept(tableBuilder);
            }
        });
    }
}
