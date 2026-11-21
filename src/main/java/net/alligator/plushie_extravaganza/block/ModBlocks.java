package net.alligator.plushie_extravaganza.block;

import net.alligator.plushie_extravaganza.PlushieExtravaganza;
import net.alligator.plushie_extravaganza.block.custom.*;
import net.alligator.plushie_extravaganza.sound.ModSounds;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class ModBlocks {
    public static final Block COMPRESSED_COTTON = registerBlock("compressed_cotton",
            properties -> new Block(properties.strength(1f).sound(SoundType.WOOL)));

    //Undertale
    public static final Block SANS_PLUSHIE = registerBlock("sans_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block PAPYRUS_PLUSHIE = registerBlock("papyrus_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block TORIEL_PLUSHIE = registerBlock("toriel_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block FRISK_PLUSHIE = registerBlock("frisk_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block CHARA_PLUSHIE = registerBlock("chara_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block UNDYNE_PLUSHIE = registerBlock("undyne_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block ALPHYS_PLUSHIE = registerBlock("alphys_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block METTATON_PLUSHIE = registerBlock("mettaton_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block ASGORE_PLUSHIE = registerBlock("asgore_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block ASRIEL_PLUSHIE = registerBlock("asriel_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block MUFFET_PLUSHIE = registerBlock("muffet_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block GASTER_PLUSHIE = registerBlock("gaster_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));


    //Deltarune
    public static final Block KRIS_LWR_PLUSHIE = registerBlock("kris_light_wr_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block KRIS_DWR_PLUSHIE = registerBlock("kris_dark_wr_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block SUSIE_LWR_PLUSHIE = registerBlock("susie_light_wr_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block SUSIE_DWR_PLUSHIE = registerBlock("susie_dark_wr_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block RALSEI_PLUSHIE = registerBlock("ralsei_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block RALSEI_HAT_PLUSHIE = registerBlock("ralsei_hat_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block NOELLE_LWR_PLUSHIE = registerBlock("noelle_light_wr_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block NOELLE_DWR_PLUSHIE = registerBlock("noelle_dark_wr_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block BERDLY_LWR_PLUSHIE = registerBlock("berdly_light_wr_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block BERDLY_DWR_PLUSHIE = registerBlock("berdly_dark_wr_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block LANCER_PLUSHIE = registerBlock("lancer_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block KING_PLUSHIE = registerBlock("king_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block QUEEN_PLUSHIE = registerBlock("queen_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block JEVIL_PLUSHIE = registerBlock("jevil_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block TENNA_PLUSHIE = registerBlock("tenna_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block SPAMTON_PLUSHIE = registerBlock("spamton_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block ROARING_KNIGHT_PLUSHIE = registerBlock("roaring_knight_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block GERSON_PLUSHIE = registerBlock("gerson_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));

    public static final Block FLOWERY_PLUSHIE = registerBlock("flowery_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block YELLOW_PLUSHIE = registerBlock("yellow_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block BLUE_PLUSHIE = registerBlock("blue_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block AQUA_PLUSHIE = registerBlock("aqua_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block ORANGE_PLUSHIE = registerBlock("orange_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block GREEN_PLUSHIE = registerBlock("green_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block SETH_PLUSHIE = registerBlock("seth_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));
    public static final Block PINK_PLUSHIE = registerBlock("pink_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));

    //Hypnophobia: Think Tank
    public static final Block TUNNELMASTER_PLUSHIE = registerBlock("tunnelmaster_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,ModSounds.TUNNELMASTER_SQUISH));
    public static final Block HUNTER_SPIDER_PLUSHIE = registerBlock("hunter_spider_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,ModSounds.HUNTERSPIDER_SQUISH));
    public static final Block CIPHER_PLUSHIE = registerBlock("cipher_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,ModSounds.CIPHER_SQUISH));
    public static final Block BROTHER_PLUSHIE = registerBlock("brother_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,ModSounds.BROTHER_SQUISH));
    public static final Block CRESCENT_PLUSHIE = registerBlock("crescent_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,ModSounds.CRESCENT_SQUISH));
    public static final Block SCRUTINY_PLUSHIE = registerBlock("scrutiny_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,ModSounds.SCRUTINY_SQUISH));
    public static final Block FORTUNE_PLUSHIE = registerBlock("fortune_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,ModSounds.FORTUNE_SQUISH));
    public static final Block LSERA_PLUSHIE = registerBlock("lsera_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,ModSounds.LSERA_SQUISH));
    public static final Block FAMINE_PLUSHIE = registerBlock("famine_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));

    public static final Block TEMPLATE_PLUSHIE = registerBlock("template_plushie",
            properties -> new Plushie(properties.strength(1f).sound(SoundType.WOOL).noOcclusion(),ModSounds.PLUSHIE_SQUISH,null));

    public static final Block COTTON_PLANT = registerBlockWithoutBlockitem("cotton_plant",
            properties -> new CottonPlantBlock(properties.noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED)));

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    private static Block registerBlockWithoutBlockitem(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, name), toRegister);
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