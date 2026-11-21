package net.alligator.plushie_extravaganza.creativemodetab;

import net.alligator.plushie_extravaganza.PlushieExtravaganza;
import net.alligator.plushie_extravaganza.block.ModBlocks;
import net.alligator.plushie_extravaganza.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab PLUSHIE_EXTRAVAGANZA_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "plushie_extravaganza_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COTTON))
                    .title(Component.translatable("creativemodetab.plushie-extravaganza.plushie_xtravaganza_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.COTTON);
                        output.accept(ModItems.COTTON_SEEDS);
                        output.accept(ModBlocks.COMPRESSED_COTTON);
                        output.accept(ModBlocks.TEMPLATE_PLUSHIE);
                        output.accept(ModBlocks.SANS_PLUSHIE);
                        output.accept(ModBlocks.PAPYRUS_PLUSHIE);
                        output.accept(ModBlocks.TORIEL_PLUSHIE);
                        output.accept(ModBlocks.FRISK_PLUSHIE);
                        output.accept(ModBlocks.CHARA_PLUSHIE);
                        output.accept(ModBlocks.UNDYNE_PLUSHIE);
                        output.accept(ModBlocks.ALPHYS_PLUSHIE);
                        output.accept(ModBlocks.METTATON_PLUSHIE);
                        output.accept(ModBlocks.ASGORE_PLUSHIE);
                        output.accept(ModBlocks.ASRIEL_PLUSHIE);
                        output.accept(ModBlocks.MUFFET_PLUSHIE);
                        output.accept(ModBlocks.GASTER_PLUSHIE);
                        output.accept(ModBlocks.KRIS_DWR_PLUSHIE);
                        output.accept(ModBlocks.KRIS_LWR_PLUSHIE);
                        output.accept(ModBlocks.SUSIE_DWR_PLUSHIE);
                        output.accept(ModBlocks.SUSIE_LWR_PLUSHIE);
                        output.accept(ModBlocks.RALSEI_PLUSHIE);
                        output.accept(ModBlocks.RALSEI_HAT_PLUSHIE);
                        output.accept(ModBlocks.NOELLE_LWR_PLUSHIE);
                        output.accept(ModBlocks.NOELLE_DWR_PLUSHIE);
                        output.accept(ModBlocks.BERDLY_LWR_PLUSHIE);
                        output.accept(ModBlocks.BERDLY_DWR_PLUSHIE);
                        output.accept(ModBlocks.LANCER_PLUSHIE);
                        output.accept(ModBlocks.KING_PLUSHIE);
                        output.accept(ModBlocks.QUEEN_PLUSHIE);
                        output.accept(ModBlocks.JEVIL_PLUSHIE);
                        output.accept(ModBlocks.TENNA_PLUSHIE);
                        output.accept(ModBlocks.SPAMTON_PLUSHIE);
                        output.accept(ModBlocks.ROARING_KNIGHT_PLUSHIE);
                        output.accept(ModBlocks.GERSON_PLUSHIE);
                        output.accept(ModBlocks.FLOWERY_PLUSHIE);
                        output.accept(ModBlocks.ORANGE_PLUSHIE);
                        output.accept(ModBlocks.YELLOW_PLUSHIE);
                        output.accept(ModBlocks.GREEN_PLUSHIE);
                        output.accept(ModBlocks.AQUA_PLUSHIE);
                        output.accept(ModBlocks.SETH_PLUSHIE);
                        output.accept(ModBlocks.PINK_PLUSHIE);
                        output.accept(ModBlocks.BLUE_PLUSHIE);
                        output.accept(ModBlocks.TUNNELMASTER_PLUSHIE);
                        output.accept(ModBlocks.HUNTER_SPIDER_PLUSHIE);
                        output.accept(ModBlocks.CIPHER_PLUSHIE);
                        output.accept(ModBlocks.BROTHER_PLUSHIE);
                        output.accept(ModBlocks.CRESCENT_PLUSHIE);
                        output.accept(ModBlocks.FORTUNE_PLUSHIE);
                        output.accept(ModBlocks.SCRUTINY_PLUSHIE);
                        output.accept(ModBlocks.LSERA_PLUSHIE);
                        output.accept(ModBlocks.FAMINE_PLUSHIE);



                    }).build());

    public static void registerModCreativeModeTabs() {
        PlushieExtravaganza.LOGGER.info("Registering Creative Mode tabs for " + PlushieExtravaganza.MOD_ID);
    }
}
