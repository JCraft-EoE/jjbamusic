package com.jcraft_eoe.jjbamusic;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;

public interface JMSoundRegistry {

    DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(JjbaMusic.MOD_ID, Registries.SOUND_EVENT);

    RegistrySupplier<SoundEvent> STAND_PROUD = register("stand_proud");
    RegistrySupplier<SoundEvent> CRUCIFIED = register("crucified");
    RegistrySupplier<SoundEvent> HALLELUJAH_CHORUS = register("hallelujah_chorus");
    RegistrySupplier<SoundEvent> WONDER_OF_YOU = register("wonder_of_you");
    RegistrySupplier<SoundEvent> AWAKEN = register("awaken");
    RegistrySupplier<SoundEvent> DARK_REBIRTH = register("dark_rebirth");
    RegistrySupplier<SoundEvent> KIRA_THEME = register("kira_theme");
    RegistrySupplier<SoundEvent> PROPAGANDA = register("propaganda");
    RegistrySupplier<SoundEvent> GIORNO_THEME = register("giorno_theme");
    RegistrySupplier<SoundEvent> JONATHAN_THEME = register("jonathan_theme");
    RegistrySupplier<SoundEvent> JOSUKE_THEME = register("josuke_theme");
    RegistrySupplier<SoundEvent> JOLYNE_THEME = register("jolyne_theme");
    RegistrySupplier<SoundEvent> JOTARO_THEME = register("jotaro_theme");
    RegistrySupplier<SoundEvent> TORTURE_DANCE = register("torture_dance");
    RegistrySupplier<SoundEvent> UN_ALTRA_PERSONA = register("un_altra_persona");
    RegistrySupplier<SoundEvent> SONO_CHI_NO_SADAME = register("sono_chi_no_sadame");
    RegistrySupplier<SoundEvent> BLOODY_STREAM = register("bloody_stream");
    RegistrySupplier<SoundEvent> END_OF_THE_WORLD = register("end_of_the_world");
    RegistrySupplier<SoundEvent> CRAZY_NOISY_BIZARRE_TOWN = register("crazy_noisy_bizarre_town");
    RegistrySupplier<SoundEvent> CHASE = register("chase");
    RegistrySupplier<SoundEvent> GREAT_DAYS = register("great_days");
    RegistrySupplier<SoundEvent> FIGHTING_GOLD = register("fighting_gold");
    RegistrySupplier<SoundEvent> TRAITORS_REQUIEM = register("traitors_requiem");
    RegistrySupplier<SoundEvent> STONE_OCEAN = register("stone_ocean");
    RegistrySupplier<SoundEvent> HEAVENS_FALLING_DOWN = register("heavens_falling_down");
    RegistrySupplier<SoundEvent> TO_BE_CONTINUED = register("to_be_continued");
    RegistrySupplier<SoundEvent> WALK_LIKE_AN_EGYPTIAN = register("walk_like_an_egyptian");
    RegistrySupplier<SoundEvent> OINGO_BOINGO = register("oingo_boingo");
    RegistrySupplier<SoundEvent> I_WANT_YOU = register("i_want_you");
    RegistrySupplier<SoundEvent> FREEKN_YOU = register("freekn_you");
    RegistrySupplier<SoundEvent> MODERN_CRUSADERS = register("modern_crusaders");

    static RegistrySupplier<SoundEvent> register(String name) {
        var event = SoundEvent.createVariableRangeEvent(JjbaMusic.id(name));
        return SOUNDS.register(event.getLocation().getPath(), () -> event);
    }

}
