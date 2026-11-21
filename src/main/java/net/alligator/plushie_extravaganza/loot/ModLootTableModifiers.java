package net.alligator.plushie_extravaganza.loot;

import net.alligator.plushie_extravaganza.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.floats.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProvider;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

public class ModLootTableModifiers {
    public static void modifyLootTables(ResourceKey<LootTable> key, FabricLootTableBuilder builder,
                                        LootTableSource source, HolderLookup.Provider provider) {
        if(key.identifier().equals(Identifier.withDefaultNamespace("chests/village/village_plains_house"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.COTTON_SEEDS))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(5, 8)).build());


            builder.pool(poolBuilder.build());
        }
        if(key.identifier().equals(Identifier.withDefaultNamespace("chests/village/village_plains_house"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.COTTON))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 5)).build());


            builder.pool(poolBuilder.build());
        }if(key.identifier().equals(Identifier.withDefaultNamespace("chests/village/village_desert_house"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.COTTON_SEEDS))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(5, 8)).build());


            builder.pool(poolBuilder.build());
        }
        if(key.identifier().equals(Identifier.withDefaultNamespace("chests/village/village_desert_house"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.COTTON))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 5)).build());


            builder.pool(poolBuilder.build());
        }if(key.identifier().equals(Identifier.withDefaultNamespace("chests/village/village_savanna_house"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.COTTON_SEEDS))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(5, 8)).build());


            builder.pool(poolBuilder.build());
        }
        if(key.identifier().equals(Identifier.withDefaultNamespace("chests/village/village_savanna_house"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.COTTON))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 5)).build());


            builder.pool(poolBuilder.build());
        }if(key.identifier().equals(Identifier.withDefaultNamespace("chests/village/village_snowy_house"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.COTTON_SEEDS))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(5, 8)).build());


            builder.pool(poolBuilder.build());
        }
        if(key.identifier().equals(Identifier.withDefaultNamespace("chests/village/village_snowy_house"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.COTTON))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 5)).build());


            builder.pool(poolBuilder.build());
        }if(key.identifier().equals(Identifier.withDefaultNamespace("chests/village/village_taiga_house"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.COTTON_SEEDS))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(5, 8)).build());


            builder.pool(poolBuilder.build());
        }
        if(key.identifier().equals(Identifier.withDefaultNamespace("chests/village/village_taiga_house"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.COTTON))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 5)).build());


            builder.pool(poolBuilder.build());
        }


    }
}
