package com.jcraft_eoe.jjbamusic.datagen.provider.assets;

import com.jcraft_eoe.jjbamusic.JMItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class JMLangProvider extends FabricLanguageProvider {
    
    public JMLangProvider(final FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(final TranslationBuilder builder) {
        builder.add("itemGroup.jjbamusic.music_discs", "JJBA Music Discs");
        final String musicDisc = "Music Disc";
        final String desc = ".desc";
        final String item = "item";
        builder.add(JMItemRegistry.DISC_STAND_PROUD.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_STAND_PROUD.getId().toLanguageKey(item) + desc, "Jin Hoshimoto - STAND PROUD");
        builder.add(JMItemRegistry.DISC_CRUCIFIED.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_CRUCIFIED.getId().toLanguageKey(item) + desc, "Army of Lovers - Crucified");
        builder.add(JMItemRegistry.DISC_HALLELUJAH_CHORUS.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_HALLELUJAH_CHORUS.getId().toLanguageKey(item) + desc, "Georg Friedrich Händel - Hallelujah Chorus");
        builder.add(JMItemRegistry.DISC_WONDER_OF_YOU.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_WONDER_OF_YOU.getId().toLanguageKey(item) + desc, "Elvis Presley - Wonder of You");
        builder.add(JMItemRegistry.DISC_AWAKEN.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_AWAKEN.getId().toLanguageKey(item) + desc, "Taku Iwasaki - awake");
        builder.add(JMItemRegistry.DISC_PROPAGANDA.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_PROPAGANDA.getId().toLanguageKey(item) + desc, "Taku Iwasaki - Propaganda");
        builder.add(JMItemRegistry.DISC_DARK_REBIRTH.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_DARK_REBIRTH.getId().toLanguageKey(item) + desc, "Yugo Kanno - Dark Rebirth");
        builder.add(JMItemRegistry.DISC_KIRA_THEME.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_KIRA_THEME.getId().toLanguageKey(item) + desc, "Yugo Kanno - Killer");
        builder.add(JMItemRegistry.DISC_GIORNO_THEME.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_GIORNO_THEME.getId().toLanguageKey(item) + desc, "Yugo Kanno - il vento d'oro");
        builder.add(JMItemRegistry.DISC_JONATHAN_THEME.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_JONATHAN_THEME.getId().toLanguageKey(item) + desc, "Hayato Matsuo - Fukutsu Mushinno Sakebi");
        builder.add(JMItemRegistry.DISC_JOLYNE_THEME.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_JOLYNE_THEME.getId().toLanguageKey(item) + desc, "Yugo Kanno - Theme of Stone Ocean");
        builder.add(JMItemRegistry.DISC_JOTARO_THEME.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_JOTARO_THEME.getId().toLanguageKey(item) + desc, "Yugo Kanno - Stardust Crusaders");
        builder.add(JMItemRegistry.DISC_JOSUKE_THEME.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_JOSUKE_THEME.getId().toLanguageKey(item) + desc, "Yugo Kanno - Diamond is Unbreakable");
        builder.add(JMItemRegistry.DISC_TORTURE_DANCE.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_TORTURE_DANCE.getId().toLanguageKey(item) + desc, "Yugo Kanno - canzoni preferite");
        builder.add(JMItemRegistry.DISC_UN_ALTRA_PERSONA.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_UN_ALTRA_PERSONA.getId().toLanguageKey(item) + desc, "Yugo Kanno - un'altra persona");
        builder.add(JMItemRegistry.DISC_SONO_CHI_NO_SADAME.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_SONO_CHI_NO_SADAME.getId().toLanguageKey(item) + desc, "TOMMY - Sono Chi no Sadame");
        builder.add(JMItemRegistry.DISC_BLOODY_STREAM.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_BLOODY_STREAM.getId().toLanguageKey(item) + desc, "Coda - Bloody Stream");
        builder.add(JMItemRegistry.DISC_END_OF_THE_WORLD.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_END_OF_THE_WORLD.getId().toLanguageKey(item) + desc, "JO☆STARS - Sono Chi no Kioku ~end of THE WORLD~");
        builder.add(JMItemRegistry.DISC_CRAZY_NOISY_BIZARRE_TOWN.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_CRAZY_NOISY_BIZARRE_TOWN.getId().toLanguageKey(item) + desc, "THE DU - Crazy Noisy Bizarre Town");
        builder.add(JMItemRegistry.DISC_CHASE.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_CHASE.getId().toLanguageKey(item) + desc, "batta - chase");
        builder.add(JMItemRegistry.DISC_GREAT_DAYS.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_GREAT_DAYS.getId().toLanguageKey(item) + desc, "Karen Aoki & Daisuke Hasegawa - Great Days");
        builder.add(JMItemRegistry.DISC_FIGHTING_GOLD.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_FIGHTING_GOLD.getId().toLanguageKey(item) + desc, "Coda - Fighting Gold");
        builder.add(JMItemRegistry.DISC_TRAITORS_REQUIEM.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_TRAITORS_REQUIEM.getId().toLanguageKey(item) + desc, "Daisuke Hasegawa - Traitors' Requiem");
        builder.add(JMItemRegistry.DISC_STONE_OCEAN.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_STONE_OCEAN.getId().toLanguageKey(item) + desc, "ichigo - Stone Ocean");
        builder.add(JMItemRegistry.DISC_HEAVENS_FALLING_DOWN.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_HEAVENS_FALLING_DOWN.getId().toLanguageKey(item) + desc, "sana (Sajou no Hana) - Heaven's falling down");
        builder.add(JMItemRegistry.DISC_TO_BE_CONTINUED.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_TO_BE_CONTINUED.getId().toLanguageKey(item) + desc, "Yes - To Be Continued");
        builder.add(JMItemRegistry.DISC_WALK_LIKE_AN_EGYPTIAN.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_WALK_LIKE_AN_EGYPTIAN.getId().toLanguageKey(item) + desc, "The Bangles - Walk Like an Egyptian");
        builder.add(JMItemRegistry.DISC_OINGO_BOINGO.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_OINGO_BOINGO.getId().toLanguageKey(item) + desc, "Oingo & Boingo - Akuyaku◇Kyōsōkyoku");
        builder.add(JMItemRegistry.DISC_I_WANT_YOU.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_I_WANT_YOU.getId().toLanguageKey(item) + desc, "Savage Garden - I Want You");
        builder.add(JMItemRegistry.DISC_FREEKN_YOU.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_FREEKN_YOU.getId().toLanguageKey(item) + desc, "Jodeci - Freek'n You");
        builder.add(JMItemRegistry.DISC_MODERN_CRUSADERS.get(), musicDisc);
        builder.add(JMItemRegistry.DISC_MODERN_CRUSADERS.getId().toLanguageKey(item) + desc, "Enigma - Modern Crusaders");
    }
}
