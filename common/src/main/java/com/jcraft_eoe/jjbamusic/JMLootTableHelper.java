package com.jcraft_eoe.jjbamusic;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;

import java.util.function.Consumer;

public final class JMLootTableHelper {
    public static final Multimap<ResourceLocation, Consumer<LootTable.Builder>> modifications = MultimapBuilder.hashKeys().linkedHashSetValues().build();

    private JMLootTableHelper() {
        /* No instantiation */
    }

    public static void registerMusicDiscLootTables() {
        // Openings: Desert/Jungle Temples (pyramids)
        registerModification(JMLootTableHelper::addOpeningDiscs,
                new ResourceLocation("chests/desert_pyramid"),
                new ResourceLocation("chests/jungle_temple")
        );

        // JoJo's OST: Dungeons
        registerModification(JMLootTableHelper::addOSTDiscs,
                new ResourceLocation("chests/simple_dungeon")
        );

        // Endings: Ancient Cities and End Cities
        registerModification(JMLootTableHelper::addEndingDiscs,
                new ResourceLocation("chests/ancient_city"),
                new ResourceLocation("chests/end_city_treasure")
        );
    }

    // Openings: Desert Pyramids & Jungle Temples
    private static void addOpeningDiscs(LootTable.Builder builder) {
        builder.withPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_SONO_CHI_NO_SADAME.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_BLOODY_STREAM.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_STAND_PROUD.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_END_OF_THE_WORLD.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_CRAZY_NOISY_BIZARRE_TOWN.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_CHASE.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_GREAT_DAYS.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_FIGHTING_GOLD.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_TRAITORS_REQUIEM.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_STONE_OCEAN.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_HEAVENS_FALLING_DOWN.get()).setWeight(1))
                .when(LootItemRandomChanceCondition.randomChance(0.25f))
        );
    }

    // JoJo's OST: Dungeons
    private static void addOSTDiscs(LootTable.Builder builder) {
        builder.withPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_AWAKEN.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_DARK_REBIRTH.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_KIRA_THEME.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_GIORNO_THEME.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_JONATHAN_THEME.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_JOLYNE_THEME.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_JOTARO_THEME.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_TORTURE_DANCE.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_UN_ALTRA_PERSONA.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_JOSUKE_THEME.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_PROPAGANDA.get()).setWeight(1))
                .when(LootItemRandomChanceCondition.randomChance(0.25f))
        );
    }

    // Endings: Ancient Cities & End Cities
    private static void addEndingDiscs(LootTable.Builder builder) {
        builder.withPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_TO_BE_CONTINUED.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_WALK_LIKE_AN_EGYPTIAN.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_OINGO_BOINGO.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_I_WANT_YOU.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_FREEKN_YOU.get()).setWeight(1))
                .add(LootItem.lootTableItem(JMItemRegistry.DISC_MODERN_CRUSADERS.get()).setWeight(1))
                .when(LootItemRandomChanceCondition.randomChance(0.25f))
        );
    }

    public static void registerModification(Consumer<LootTable.Builder> modifier, ResourceLocation... lootTables) {
        for (ResourceLocation lootTable : lootTables) {
            modifications.put(lootTable, modifier);
        }
    }
    
}
