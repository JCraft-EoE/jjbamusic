package com.jcraft_eoe.jjbamusic;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

public interface JMCreativeMenuTabRegistry {

    DeferredRegister<CreativeModeTab> CREATIVE_TAB_REGISTRY = DeferredRegister.create(JjbaMusic.MOD_ID, Registries.CREATIVE_MODE_TAB);

    static void register() {
        CREATIVE_TAB_REGISTRY.register("music_discs", JMCreativeMenuTabRegistry::createMusicDiscItemGroup);
    }

    static CreativeModeTab createMusicDiscItemGroup() {
        return CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                .title(Component.translatable("itemGroup.jjbamusic.music_discs"))
                .icon(() -> JMItemRegistry.DISC_STAND_PROUD.get().getDefaultInstance())
                // order of the creative tab
                .displayItems((displayContext, entries) -> {
                    entries.accept(JMItemRegistry.DISC_CRUCIFIED.get());
                    entries.accept(JMItemRegistry.DISC_HALLELUJAH_CHORUS.get());
                    entries.accept(JMItemRegistry.DISC_WONDER_OF_YOU.get());
                    entries.accept(JMItemRegistry.DISC_AWAKEN.get());
                    entries.accept(JMItemRegistry.DISC_PROPAGANDA.get());
                    entries.accept(JMItemRegistry.DISC_DARK_REBIRTH.get());
                    entries.accept(JMItemRegistry.DISC_KIRA_THEME.get());
                    entries.accept(JMItemRegistry.DISC_GIORNO_THEME.get());
                    entries.accept(JMItemRegistry.DISC_JONATHAN_THEME.get());
                    entries.accept(JMItemRegistry.DISC_JOLYNE_THEME.get());
                    entries.accept(JMItemRegistry.DISC_JOTARO_THEME.get());
                    entries.accept(JMItemRegistry.DISC_JOSUKE_THEME.get());
                    entries.accept(JMItemRegistry.DISC_TORTURE_DANCE.get());
                    entries.accept(JMItemRegistry.DISC_UN_ALTRA_PERSONA.get());
                    entries.accept(JMItemRegistry.DISC_STAND_PROUD.get());
                    entries.accept(JMItemRegistry.DISC_SONO_CHI_NO_SADAME.get());
                    entries.accept(JMItemRegistry.DISC_BLOODY_STREAM.get());
                    entries.accept(JMItemRegistry.DISC_END_OF_THE_WORLD.get());
                    entries.accept(JMItemRegistry.DISC_CRAZY_NOISY_BIZARRE_TOWN.get());
                    entries.accept(JMItemRegistry.DISC_CHASE.get());
                    entries.accept(JMItemRegistry.DISC_GREAT_DAYS.get());
                    entries.accept(JMItemRegistry.DISC_FIGHTING_GOLD.get());
                    entries.accept(JMItemRegistry.DISC_TRAITORS_REQUIEM.get());
                    entries.accept(JMItemRegistry.DISC_STONE_OCEAN.get());
                    entries.accept(JMItemRegistry.DISC_HEAVENS_FALLING_DOWN.get());
                    entries.accept(JMItemRegistry.DISC_TO_BE_CONTINUED.get());
                    entries.accept(JMItemRegistry.DISC_WALK_LIKE_AN_EGYPTIAN.get());
                    entries.accept(JMItemRegistry.DISC_OINGO_BOINGO.get());
                    entries.accept(JMItemRegistry.DISC_I_WANT_YOU.get());
                    entries.accept(JMItemRegistry.DISC_FREEKN_YOU.get());
                    entries.accept(JMItemRegistry.DISC_MODERN_CRUSADERS.get());
                })
                .build();
    }
}
