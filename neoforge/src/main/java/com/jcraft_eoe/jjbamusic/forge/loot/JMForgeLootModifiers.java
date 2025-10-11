package com.jcraft_eoe.jjbamusic.forge.loot;

import com.jcraft_eoe.jjbamusic.JjbaMusic;
import com.mojang.serialization.Codec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public interface JMForgeLootModifiers {
    DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, JjbaMusic.MOD_ID);

    DeferredHolder<Codec<? extends IGlobalLootModifier>, Codec<? extends JMForgeLootAdapter>> LOOT_ADAPTER =
            LOOT_MODIFIER_SERIALIZERS.register("loot_adapter", JMForgeLootAdapter.CODEC);

    static void register(final IEventBus eventBus) {
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }
}
