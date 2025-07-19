package com.jcraft_eoe.jjbamusic;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

import java.util.function.Supplier;

public interface JMItemRegistry {

    DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(JjbaMusic.MOD_ID, Registries.ITEM);

    RegistrySupplier<Item> DISC_STAND_PROUD = register("disc_stand_proud", () -> new RecordItem(1, JMSoundRegistry.STAND_PROUD.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 92));
    RegistrySupplier<Item> DISC_CRUCIFIED = register("disc_crucified", () -> new RecordItem(1, JMSoundRegistry.CRUCIFIED.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));
    RegistrySupplier<Item> DISC_AWAKEN = register("disc_awaken", () -> new RecordItem(1, JMSoundRegistry.AWAKEN.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 195));
    RegistrySupplier<Item> DISC_DARK_REBIRTH = register("disc_dark_rebirth", () -> new RecordItem(1, JMSoundRegistry.DARK_REBIRTH.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 64));
    RegistrySupplier<Item> DISC_KIRA_THEME = register("disc_kira_theme", () -> new RecordItem(1, JMSoundRegistry.KIRA_THEME.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 177));
    RegistrySupplier<Item> DISC_GIORNO_THEME = register("disc_giorno_theme", () -> new RecordItem(1, JMSoundRegistry.GIORNO_THEME.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 266));
    RegistrySupplier<Item> DISC_JONATHAN_THEME = register("disc_jonathan_theme", () -> new RecordItem(1, JMSoundRegistry.JONATHAN_THEME.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 49));
    RegistrySupplier<Item> DISC_JOSUKE_THEME = register("disc_josuke_theme", () -> new RecordItem(1, JMSoundRegistry.JOSUKE_THEME.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 238));
    RegistrySupplier<Item> DISC_JOLYNE_THEME = register("disc_jolyne_theme", () -> new RecordItem(1, JMSoundRegistry.JOLYNE_THEME.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 237));
    RegistrySupplier<Item> DISC_JOTARO_THEME = register("disc_jotaro_theme", () -> new RecordItem(1, JMSoundRegistry.JOTARO_THEME.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 49));
    RegistrySupplier<Item> DISC_TORTURE_DANCE = register("disc_torture_dance", () -> new RecordItem(1, JMSoundRegistry.TORTURE_DANCE.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 97));
    RegistrySupplier<Item> DISC_WONDER_OF_YOU = register("disc_wonder_of_you", () -> new RecordItem(1, JMSoundRegistry.WONDER_OF_YOU.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 24));
    RegistrySupplier<Item> DISC_HALLELUJAH_CHORUS = register("disc_hallelujah_chorus", () -> new RecordItem(1, JMSoundRegistry.HALLELUJAH_CHORUS.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 207));
    RegistrySupplier<Item> DISC_UN_ALTRA_PERSONA = register("disc_un_altra_persona", () -> new RecordItem(1, JMSoundRegistry.UN_ALTRA_PERSONA.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 153));
    RegistrySupplier<Item> DISC_SONO_CHI_NO_SADAME = register("disc_sono_chi_no_sadame", () -> new RecordItem(1, JMSoundRegistry.SONO_CHI_NO_SADAME.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 86));
    RegistrySupplier<Item> DISC_BLOODY_STREAM = register("disc_bloody_stream", () -> new RecordItem(1, JMSoundRegistry.BLOODY_STREAM.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 93));
    RegistrySupplier<Item> DISC_END_OF_THE_WORLD = register("disc_end_of_the_world", () -> new RecordItem(1, JMSoundRegistry.END_OF_THE_WORLD.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 84));
    RegistrySupplier<Item> DISC_CRAZY_NOISY_BIZARRE_TOWN = register("disc_crazy_noisy_bizarre_town", () -> new RecordItem(1, JMSoundRegistry.CRAZY_NOISY_BIZARRE_TOWN.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 181));
    RegistrySupplier<Item> DISC_CHASE = register("disc_chase", () -> new RecordItem(1, JMSoundRegistry.CHASE.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 135));
    RegistrySupplier<Item> DISC_GREAT_DAYS = register("disc_great_days", () -> new RecordItem(1, JMSoundRegistry.GREAT_DAYS.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 240));
    RegistrySupplier<Item> DISC_FIGHTING_GOLD = register("disc_fighting_gold", () -> new RecordItem(1, JMSoundRegistry.FIGHTING_GOLD.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 252));
    RegistrySupplier<Item> DISC_TRAITORS_REQUIEM = register("disc_traitors_requiem", () -> new RecordItem(1, JMSoundRegistry.TRAITORS_REQUIEM.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 88));
    RegistrySupplier<Item> DISC_STONE_OCEAN = register("disc_stone_ocean", () -> new RecordItem(1, JMSoundRegistry.STONE_OCEAN.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 86));
    RegistrySupplier<Item> DISC_HEAVENS_FALLING_DOWN = register("disc_heavens_falling_down", () -> new RecordItem(1, JMSoundRegistry.HEAVENS_FALLING_DOWN.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 205));
    RegistrySupplier<Item> DISC_PROPAGANDA = register("disc_propaganda", () -> new RecordItem(1, JMSoundRegistry.PROPAGANDA.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 179));
    RegistrySupplier<Item> DISC_TO_BE_CONTINUED = register("disc_to_be_continued", () -> new RecordItem(1, JMSoundRegistry.TO_BE_CONTINUED.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 18));
    RegistrySupplier<Item> DISC_WALK_LIKE_AN_EGYPTIAN = register("disc_walk_like_an_egyptian", () -> new RecordItem(1, JMSoundRegistry.WALK_LIKE_AN_EGYPTIAN.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 40));
    RegistrySupplier<Item> DISC_OINGO_BOINGO = register("disc_oingo_boingo", () -> new RecordItem(1, JMSoundRegistry.OINGO_BOINGO.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 84));
    RegistrySupplier<Item> DISC_I_WANT_YOU = register("disc_i_want_you", () -> new RecordItem(1, JMSoundRegistry.I_WANT_YOU.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 197));
    RegistrySupplier<Item> DISC_FREEKN_YOU = register("disc_freekn_you", () -> new RecordItem(1, JMSoundRegistry.FREEKN_YOU.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 116));
    RegistrySupplier<Item> DISC_MODERN_CRUSADERS = register("disc_modern_crusaders", () -> new RecordItem(1, JMSoundRegistry.MODERN_CRUSADERS.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 156));

    static <T extends Item> RegistrySupplier<T> register(String id, Supplier<? extends T> supplier) {
        return ITEM_REGISTRY.register(id, supplier);
    }

}
