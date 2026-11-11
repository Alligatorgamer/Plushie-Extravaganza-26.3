package net.alligator.plushie_extravaganza.datagen;

import net.alligator.plushie_extravaganza.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.COMPRESSED_COTTON);
        dropSelf(ModBlocks.SANS_PLUSHIE);
        dropSelf(ModBlocks.PAPYRUS_PLUSHIE);
        dropSelf(ModBlocks.TORIEL_PLUSHIE);
        dropSelf(ModBlocks.FRISK_PLUSHIE);
        dropSelf(ModBlocks.UNDYNE_PLUSHIE);
        dropSelf(ModBlocks.ALPHYS_PLUSHIE);
        dropSelf(ModBlocks.METTATON_PLUSHIE);
        dropSelf(ModBlocks.TEMPLATE_PLUSHIE);
    }
}
