package com.jcraft_eoe.jjbamusic.datagen.provider.assets;

import com.jcraft_eoe.jjbamusic.JMItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

public class JMModelProvider extends FabricModelProvider {

    public JMModelProvider(final FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(final BlockModelGenerators blockModelGenerators) {
        // intentionally empty (no blocks in this mod)
    }

    @Override
    public void generateItemModels(final ItemModelGenerators generator) {
        generator.generateFlatItem(JMItemRegistry.DISC_STAND_PROUD.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_CRUCIFIED.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_HALLELUJAH_CHORUS.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_WONDER_OF_YOU.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_AWAKEN.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_PROPAGANDA.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_DARK_REBIRTH.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_KIRA_THEME.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_GIORNO_THEME.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_JONATHAN_THEME.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_JOLYNE_THEME.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_JOTARO_THEME.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_JOSUKE_THEME.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_TORTURE_DANCE.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_UN_ALTRA_PERSONA.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_SONO_CHI_NO_SADAME.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_BLOODY_STREAM.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_END_OF_THE_WORLD.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_CRAZY_NOISY_BIZARRE_TOWN.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_CHASE.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_GREAT_DAYS.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_FIGHTING_GOLD.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_TRAITORS_REQUIEM.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_STONE_OCEAN.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_HEAVENS_FALLING_DOWN.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_TO_BE_CONTINUED.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_WALK_LIKE_AN_EGYPTIAN.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_OINGO_BOINGO.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_I_WANT_YOU.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_FREEKN_YOU.get(), ModelTemplates.MUSIC_DISC);
        generator.generateFlatItem(JMItemRegistry.DISC_MODERN_CRUSADERS.get(), ModelTemplates.MUSIC_DISC);
    }
}
