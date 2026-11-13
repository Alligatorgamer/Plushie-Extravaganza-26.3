package net.alligator.plushie_extravaganza;

import net.fabricmc.api.ClientModInitializer;
import net.alligator.plushie_extravaganza.block.entity.ModBlockEntities;
import net.alligator.plushie_extravaganza.block.entity.renderer.PlushieEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public class PlushieExtravaganzaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockEntityRenderers.register(ModBlockEntities.PLUSHIE_BE,PlushieEntityRenderer::new);

    }
}