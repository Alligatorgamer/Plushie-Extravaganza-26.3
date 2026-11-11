package net.alligator.plushie_extravaganza.block.entity;

import net.alligator.plushie_extravaganza.PlushieExtravaganza;
import net.alligator.plushie_extravaganza.block.ModBlocks;
import net.alligator.plushie_extravaganza.block.entity.custom.PlushieEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntities {
    public static final BlockEntityType<PlushieEntity> PLUSHIE_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "plushie_be"),
                    FabricBlockEntityTypeBuilder.create(PlushieEntity::new, ModBlocks.TEMPLATE_PLUSHIE).build());


    public static void registerBlockEntities() {
        PlushieExtravaganza.LOGGER.info("Registering ModBlockEntities for " + PlushieExtravaganza.MOD_ID);
    }
}
