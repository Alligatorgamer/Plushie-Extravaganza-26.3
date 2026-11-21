package net.alligator.plushie_extravaganza.block.entity;

import net.alligator.plushie_extravaganza.PlushieExtravaganza;
import net.alligator.plushie_extravaganza.block.ModBlocks;
import net.alligator.plushie_extravaganza.block.entity.custom.PlushieEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntities {
    public static final BlockEntityType<PlushieEntity> PLUSHIE_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "plushie_be"),
                    FabricBlockEntityTypeBuilder.create(PlushieEntity::new,
                            ModBlocks.TEMPLATE_PLUSHIE,

                            ModBlocks.CIPHER_PLUSHIE,
                            ModBlocks.TUNNELMASTER_PLUSHIE,
                            ModBlocks.HUNTER_SPIDER_PLUSHIE,
                            ModBlocks.BROTHER_PLUSHIE,
                            ModBlocks.CRESCENT_PLUSHIE,
                            ModBlocks.SCRUTINY_PLUSHIE,
                            ModBlocks.FORTUNE_PLUSHIE,
                            ModBlocks.LSERA_PLUSHIE,
                            ModBlocks.FAMINE_PLUSHIE,

                            ModBlocks.SANS_PLUSHIE,
                            ModBlocks.PAPYRUS_PLUSHIE,
                            ModBlocks.TORIEL_PLUSHIE,
                            ModBlocks.FRISK_PLUSHIE,
                            ModBlocks.CHARA_PLUSHIE,
                            ModBlocks.UNDYNE_PLUSHIE,
                            ModBlocks.ALPHYS_PLUSHIE,
                            ModBlocks.METTATON_PLUSHIE,
                            ModBlocks.ASGORE_PLUSHIE,
                            ModBlocks.ASRIEL_PLUSHIE,
                            ModBlocks.MUFFET_PLUSHIE,
                            ModBlocks.GASTER_PLUSHIE,

                            ModBlocks.KRIS_DWR_PLUSHIE,
                            ModBlocks.KRIS_LWR_PLUSHIE,
                            ModBlocks.SUSIE_DWR_PLUSHIE,
                            ModBlocks.SUSIE_LWR_PLUSHIE,
                            ModBlocks.RALSEI_PLUSHIE,
                            ModBlocks.RALSEI_HAT_PLUSHIE,
                            ModBlocks.NOELLE_LWR_PLUSHIE,
                            ModBlocks.NOELLE_DWR_PLUSHIE,
                            ModBlocks.BERDLY_LWR_PLUSHIE,
                            ModBlocks.BERDLY_DWR_PLUSHIE,
                            ModBlocks.LANCER_PLUSHIE,
                            ModBlocks.KING_PLUSHIE,
                            ModBlocks.QUEEN_PLUSHIE,
                            ModBlocks.JEVIL_PLUSHIE,
                            ModBlocks.TENNA_PLUSHIE,
                            ModBlocks.SPAMTON_PLUSHIE,
                            ModBlocks.ROARING_KNIGHT_PLUSHIE,
                            ModBlocks.GERSON_PLUSHIE,
                            ModBlocks.FLOWERY_PLUSHIE,
                            ModBlocks.YELLOW_PLUSHIE,
                            ModBlocks.BLUE_PLUSHIE,
                            ModBlocks.AQUA_PLUSHIE,
                            ModBlocks.ORANGE_PLUSHIE,
                            ModBlocks.GREEN_PLUSHIE,
                            ModBlocks.SETH_PLUSHIE,
                            ModBlocks.PINK_PLUSHIE
                    ).build());



    public static void registerBlockEntities() {
        PlushieExtravaganza.LOGGER.info("Registering ModBlockEntities for " + PlushieExtravaganza.MOD_ID);
    }
}
