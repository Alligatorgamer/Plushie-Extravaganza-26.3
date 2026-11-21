package net.alligator.plushie_extravaganza.datagen;

import net.alligator.plushie_extravaganza.block.ModBlocks;
import net.alligator.plushie_extravaganza.block.custom.CottonPlantBlock;
import net.alligator.plushie_extravaganza.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.COMPRESSED_COTTON);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.SANS_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.PAPYRUS_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.TORIEL_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.FRISK_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.CHARA_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.UNDYNE_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.ALPHYS_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.METTATON_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.ASGORE_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.ASRIEL_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.MUFFET_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.GASTER_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.KRIS_DWR_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.KRIS_LWR_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.SUSIE_DWR_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.SUSIE_LWR_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.RALSEI_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.RALSEI_HAT_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.NOELLE_LWR_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.NOELLE_DWR_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.BERDLY_LWR_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.BERDLY_DWR_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.LANCER_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.KING_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.QUEEN_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.JEVIL_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.TENNA_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.SPAMTON_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.ROARING_KNIGHT_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.GERSON_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.FLOWERY_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.YELLOW_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.BLUE_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.AQUA_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.ORANGE_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.GREEN_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.SETH_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.PINK_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.TEMPLATE_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.TUNNELMASTER_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.HUNTER_SPIDER_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.CIPHER_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.BROTHER_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.CRESCENT_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.FORTUNE_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.SCRUTINY_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.FAMINE_PLUSHIE);
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.LSERA_PLUSHIE);


        blockModelGenerators.createCropBlock(ModBlocks.COTTON_PLANT, CottonPlantBlock.AGE, 0 ,1, 2, 3, 4);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.COTTON, ModelTemplates.FLAT_ITEM);
    }
}
