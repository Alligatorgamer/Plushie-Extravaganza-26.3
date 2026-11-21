package net.alligator.plushie_extravaganza;

import net.alligator.plushie_extravaganza.block.ModBlocks;
import net.alligator.plushie_extravaganza.block.entity.ModBlockEntities;
import net.alligator.plushie_extravaganza.block.entity.renderer.PlushieEntityRenderer;
import net.alligator.plushie_extravaganza.creativemodetab.ModCreativeModeTabs;
import net.alligator.plushie_extravaganza.item.ModItems;
import net.alligator.plushie_extravaganza.loot.ModLootTableModifiers;
import net.alligator.plushie_extravaganza.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlushieExtravaganza implements ModInitializer {
	public static final String MOD_ID = "plushie-extravaganza";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModSounds.registerSounds();
		LootTableEvents.MODIFY.register(ModLootTableModifiers::modifyLootTables);
		BlockEntityRenderers.register(ModBlockEntities.PLUSHIE_BE, PlushieEntityRenderer::new);
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
