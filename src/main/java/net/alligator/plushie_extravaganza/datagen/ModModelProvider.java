package net.alligator.plushie_extravaganza.datagen;

import net.alligator.plushie_extravaganza.block.ModBlocks;
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
        blockModelGenerators.createNonTemplateHorizontalBlock(ModBlocks.TEMPLATE_PLUSHIE);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.COTTON, ModelTemplates.FLAT_ITEM);
    }
}
