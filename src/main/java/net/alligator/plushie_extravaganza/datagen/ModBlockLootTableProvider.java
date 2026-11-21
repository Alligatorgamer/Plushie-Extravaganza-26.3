package net.alligator.plushie_extravaganza.datagen;

import net.alligator.plushie_extravaganza.block.ModBlocks;
import net.alligator.plushie_extravaganza.block.custom.CottonPlantBlock;
import net.alligator.plushie_extravaganza.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.storage.loot.predicates.MatchBlock;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.COMPRESSED_COTTON);
        dropSelf(ModBlocks.TEMPLATE_PLUSHIE);
        dropSelf(ModBlocks.SANS_PLUSHIE);
        dropSelf(ModBlocks.PAPYRUS_PLUSHIE);
        dropSelf(ModBlocks.TORIEL_PLUSHIE);
        dropSelf(ModBlocks.FRISK_PLUSHIE);
        dropSelf(ModBlocks.UNDYNE_PLUSHIE);
        dropSelf(ModBlocks.ALPHYS_PLUSHIE);
        dropSelf(ModBlocks.METTATON_PLUSHIE);
        dropSelf(ModBlocks.ASGORE_PLUSHIE);
        dropSelf(ModBlocks.ASRIEL_PLUSHIE);
        dropSelf(ModBlocks.MUFFET_PLUSHIE);
        dropSelf(ModBlocks.GASTER_PLUSHIE);
        dropSelf(ModBlocks.KRIS_DWR_PLUSHIE);
        dropSelf(ModBlocks.KRIS_LWR_PLUSHIE);
        dropSelf(ModBlocks.SUSIE_DWR_PLUSHIE);
        dropSelf(ModBlocks.SUSIE_LWR_PLUSHIE);
        dropSelf(ModBlocks.RALSEI_PLUSHIE);
        dropSelf(ModBlocks.RALSEI_HAT_PLUSHIE);
        dropSelf(ModBlocks.NOELLE_LWR_PLUSHIE);
        dropSelf(ModBlocks.NOELLE_DWR_PLUSHIE);
        dropSelf(ModBlocks.BERDLY_LWR_PLUSHIE);
        dropSelf(ModBlocks.BERDLY_DWR_PLUSHIE);
        dropSelf(ModBlocks.LANCER_PLUSHIE);
        dropSelf(ModBlocks.KING_PLUSHIE);
        dropSelf(ModBlocks.QUEEN_PLUSHIE);
        dropSelf(ModBlocks.JEVIL_PLUSHIE);
        dropSelf(ModBlocks.TENNA_PLUSHIE);
        dropSelf(ModBlocks.SPAMTON_PLUSHIE);
        dropSelf(ModBlocks.ROARING_KNIGHT_PLUSHIE);
        dropSelf(ModBlocks.GERSON_PLUSHIE);
        dropSelf(ModBlocks.FLOWERY_PLUSHIE);
        dropSelf(ModBlocks.YELLOW_PLUSHIE);
        dropSelf(ModBlocks.BLUE_PLUSHIE);
        dropSelf(ModBlocks.AQUA_PLUSHIE);
        dropSelf(ModBlocks.ORANGE_PLUSHIE);
        dropSelf(ModBlocks.GREEN_PLUSHIE);
        dropSelf(ModBlocks.SETH_PLUSHIE);
        dropSelf(ModBlocks.PINK_PLUSHIE);
        dropSelf(ModBlocks.TUNNELMASTER_PLUSHIE);
        dropSelf(ModBlocks.HUNTER_SPIDER_PLUSHIE);
        dropSelf(ModBlocks.CIPHER_PLUSHIE);
        dropSelf(ModBlocks.BROTHER_PLUSHIE);
        dropSelf(ModBlocks.CRESCENT_PLUSHIE);
        dropSelf(ModBlocks.FORTUNE_PLUSHIE);
        dropSelf(ModBlocks.SCRUTINY_PLUSHIE);
        dropSelf(ModBlocks.FAMINE_PLUSHIE);
        dropSelf(ModBlocks.LSERA_PLUSHIE);

        this.add(ModBlocks.COTTON_PLANT,this.createCropDrops(ModBlocks.COTTON_PLANT, ModItems.COTTON,ModItems.COTTON_SEEDS,
                MatchBlock.blockMatches(blocks, ModBlocks.COTTON_PLANT,
                        StatePropertiesPredicate.Builder.properties().hasProperty(CottonPlantBlock.AGE, CottonPlantBlock.MAX_AGE))));
    }
}
