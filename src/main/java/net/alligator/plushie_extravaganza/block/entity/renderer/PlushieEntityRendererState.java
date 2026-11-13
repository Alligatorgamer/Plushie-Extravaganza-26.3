package net.alligator.plushie_extravaganza.block.entity.renderer;

import net.minecraft.client.renderer.block.BlockModelRenderState;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.world.level.Level;

public class PlushieEntityRendererState extends BlockEntityRenderState {
    public float squish;
    public int timer;
    public float f;

    final BlockModelRenderState blockModelRenderState = new BlockModelRenderState();
}
