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

                shaped(RecipeCategory.MISC,ModBlocks.SANS_PLUSHIE)
                        .pattern(" C ")
                        .pattern("CCC")
                        .pattern(" C ")
                        .define('C', ModItems.COTTON)
                        .unlockedBy(getHasName(ModItems.COTTON), has(ModItems.COTTON))
                        .group("plushie")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.COTTON,9)
                        .requires(ModBlocks.COMPRESSED_COTTON)
                        .unlockedBy(getHasName(ModBlocks.COMPRESSED_COTTON),has(ModBlocks.COMPRESSED_COTTON))
                        .group("plushie")
                        .save(output, "cotton_from_compressed_cotton");

            }
        };
    }

    @Override
    public String getName() {
        return "Plushie Extravaganza Recipes";
    }
}
