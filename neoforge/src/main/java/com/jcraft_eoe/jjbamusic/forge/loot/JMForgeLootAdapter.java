package com.jcraft_eoe.jjbamusic.forge.loot;

import com.google.common.base.Suppliers;
import com.jcraft_eoe.jjbamusic.JMLootTableHelper;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static net.minecraft.world.level.storage.loot.LootTable.createStackSplitter;

public class JMForgeLootAdapter extends LootModifier {
    public static final Supplier<Codec<? extends JMForgeLootAdapter>> CODEC = Suppliers.memoize(() ->
            RecordCodecBuilder.create(inst ->
                    LootModifier.codecStart(inst).apply(inst, JMForgeLootAdapter::new)
            )
    );

    protected JMForgeLootAdapter(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @SuppressWarnings("deprecation") // forge made another bad mixin-avoidant api
    @NonNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(final ObjectArrayList<ItemStack> generatedLoot, final LootContext context) {
        final LootTable.Builder builder = LootTable.lootTable();
        for (Consumer<LootTable.Builder> consumer : JMLootTableHelper.modifications.get(context.getQueriedLootTableId())) {
            consumer.accept(builder);
        }
        builder.build().getRandomItemsRaw(context, createStackSplitter(context.getLevel(), generatedLoot::add));
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
