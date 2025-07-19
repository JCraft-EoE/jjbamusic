package com.jcraft_eoe.jjbamusic.datagen.provider.data;

import com.jcraft_eoe.jjbamusic.JMItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public interface JMTagProviders {

    class JMItemTags extends FabricTagProvider.ItemTagProvider {

        public JMItemTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            final var musicDiscs = getOrCreateRawBuilder(ItemTags.MUSIC_DISCS);
            musicDiscs.addElement(JMItemRegistry.DISC_CRUCIFIED.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_HALLELUJAH_CHORUS.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_WONDER_OF_YOU.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_AWAKEN.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_PROPAGANDA.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_DARK_REBIRTH.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_KIRA_THEME.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_GIORNO_THEME.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_JONATHAN_THEME.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_JOSUKE_THEME.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_JOLYNE_THEME.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_JOTARO_THEME.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_TORTURE_DANCE.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_UN_ALTRA_PERSONA.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_STAND_PROUD.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_SONO_CHI_NO_SADAME.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_BLOODY_STREAM.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_END_OF_THE_WORLD.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_CRAZY_NOISY_BIZARRE_TOWN.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_CHASE.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_GREAT_DAYS.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_FIGHTING_GOLD.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_TRAITORS_REQUIEM.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_STONE_OCEAN.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_HEAVENS_FALLING_DOWN.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_TO_BE_CONTINUED.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_WALK_LIKE_AN_EGYPTIAN.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_OINGO_BOINGO.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_I_WANT_YOU.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_FREEKN_YOU.getId());
            musicDiscs.addElement(JMItemRegistry.DISC_MODERN_CRUSADERS.getId());

            final var creeperDiscs = getOrCreateRawBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS);
            creeperDiscs.addElement(JMItemRegistry.DISC_CRUCIFIED.getId());
            creeperDiscs.addElement(JMItemRegistry.DISC_HALLELUJAH_CHORUS.getId());
            creeperDiscs.addElement(JMItemRegistry.DISC_WONDER_OF_YOU.getId());
        }
    }

}
