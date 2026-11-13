package net.alligator.plushie_extravaganza.block;

import net.alligator.plushie_extravaganza.PlushieExtravaganza;
import net.alligator.plushie_extravaganza.block.custom.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static final Block COMPRESSED_COTTON = registerBlock("compressed_cotton",
            properties -> new Block(properties.strength(1f).sound(SoundType.WOOL)));

    public static final Block SANS_PLUSHIE = registerBlock("sans_plushie",
            properties -> new SansPlushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion()));
    public static final Block PAPYRUS_PLUSHIE = registerBlock("papyrus_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion()));
    public static final Block TORIEL_PLUSHIE = registerBlock("toriel_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion()));
    public static final Block FRISK_PLUSHIE = registerBlock("frisk_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion()));
    public static final Block CHARA_PLUSHIE = registerBlock("chara_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion()));
    public static final Block UNDYNE_PLUSHIE = registerBlock("undyne_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion()));
    public static final Block ALPHYS_PLUSHIE = registerBlock("alphys_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion()));
    public static final Block METTATON_PLUSHIE = registerBlock("mettaton_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion()));
    public static final Block ASGORE_PLUSHIE = registerBlock("asgore_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion()));

    public static final Block TEMPLATE_PLUSHIE = registerBlock("template_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion()));

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        PlushieExtravaganza.LOGGER.info("Registering Mod Blocks for " + PlushieExtravaganza.MOD_ID);
    }
}