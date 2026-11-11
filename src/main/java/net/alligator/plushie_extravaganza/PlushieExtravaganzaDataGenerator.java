package net.alligator.plushie_extravaganza;

import net.alligator.plushie_extravaganza.datagen.ModBlockLootTableProvider;
import net.alligator.plushie_extravaganza.datagen.ModBlockTagsProvider;
import net.alligator.plushie_extravaganza.datagen.ModModelProvider;
import net.alligator.plushie_extravaganza.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PlushieExtravaganzaDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
