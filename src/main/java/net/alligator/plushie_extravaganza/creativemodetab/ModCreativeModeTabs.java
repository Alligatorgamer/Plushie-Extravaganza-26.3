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
                        output.accept(ModBlocks.COMPRESSED_COTTON);
                        output.accept(ModBlocks.SANS_PLUSHIE);
                        output.accept(ModBlocks.PAPYRUS_PLUSHIE);
                        output.accept(ModBlocks.TORIEL_PLUSHIE);
                        output.accept(ModBlocks.FRISK_PLUSHIE);
                        output.accept(ModBlocks.CHARA_PLUSHIE);
                        output.accept(ModBlocks.UNDYNE_PLUSHIE);
                        output.accept(ModBlocks.ALPHYS_PLUSHIE);
                        output.accept(ModBlocks.METTATON_PLUSHIE);
                        output.accept(ModBlocks.TEMPLATE_PLUSHIE);


                    }).build());

    public static void registerModCreativeModeTabs() {
        PlushieExtravaganza.LOGGER.info("Registering Creative Mode tabs for " + PlushieExtravaganza.MOD_ID);
    }
}
