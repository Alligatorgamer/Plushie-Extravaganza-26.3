package net.alligator.plushie_extravaganza.datagen;

import net.alligator.plushie_extravaganza.block.ModBlocks;
import net.alligator.plushie_extravaganza.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import org.intellij.lang.annotations.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.COTTON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_COTTON);

                shaped(RecipeCategory.MISC,ModBlocks.TEMPLATE_PLUSHIE)
                        .pattern(" C ")
                        .pattern("CCC")
                        .pattern(" C ")
                        .define('C', ModItems.COTTON)
                        .unlockedBy(getHasName(ModItems.COTTON), has(ModItems.COTTON))
                        .group("plushie")
                        .save(output);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.SANS_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.PAPYRUS_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.TORIEL_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.FRISK_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.CHARA_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.UNDYNE_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.ALPHYS_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.METTATON_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.ASGORE_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.ASRIEL_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.MUFFET_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.GASTER_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.KRIS_LWR_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.KRIS_DWR_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.SUSIE_LWR_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.SUSIE_DWR_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.RALSEI_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.RALSEI_HAT_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.NOELLE_LWR_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.NOELLE_DWR_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.BERDLY_LWR_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.BERDLY_DWR_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.LANCER_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.KING_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.QUEEN_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.JEVIL_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.TENNA_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.SPAMTON_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.ROARING_KNIGHT_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.GERSON_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.FLOWERY_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.ORANGE_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.YELLOW_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.GREEN_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.AQUA_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.BLUE_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.SETH_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.PINK_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.HUNTER_SPIDER_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.TUNNELMASTER_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.BROTHER_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.CRESCENT_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.SCRUTINY_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.FORTUNE_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.FAMINE_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);
                stonecutterResultFromBase(RecipeCategory.MISC,ModBlocks.LSERA_PLUSHIE,ModBlocks.TEMPLATE_PLUSHIE);

            }
        };
    }

    @Override
    public String getName() {
        return "Plushie Extravaganza Recipes";
    }
}
