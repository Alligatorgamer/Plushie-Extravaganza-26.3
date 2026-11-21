package net.alligator.plushie_extravaganza.block.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import net.alligator.plushie_extravaganza.block.entity.custom.PlushieEntity;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.block.BlockModelResolver;
import net.minecraft.client.renderer.block.model.BlockDisplayContext;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public class PlushieEntityRenderer implements BlockEntityRenderer<PlushieEntity, PlushieEntityRendererState> {
    public final BlockModelResolver blockModelResolver;

    public PlushieEntityRenderer(BlockEntityRendererProvider.Context context) {
        blockModelResolver = context.blockModelResolver();
    }

    @Override
    public PlushieEntityRendererState createRenderState() {
        return new PlushieEntityRendererState();
    }


    @Override
    public void extractRenderState(PlushieEntity blockEntity, PlushieEntityRendererState state,
                                   float partialTicks, Vec3 cameraPosition, ModelFeatureRenderer.@Nullable CrumblingOverlay breakProgress) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, partialTicks, cameraPosition, breakProgress);

        //(float) (1-(-(Math.cos(Math.PI * (state.timer-partialTicks)) -1) /4)*0.5);
        state.timer = blockEntity.getTimer();
        state.squish = (float) (1 - (Math.pow(Math.max(state.timer-partialTicks,0),1)/3) * 0.3f);


        blockModelResolver.update(state.blockModelRenderState,
                blockEntity.getBlockState(), BlockDisplayContext.create());
    }

    @Override
    public void submit(PlushieEntityRendererState state, PoseStack poseStack,
                       SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
        poseStack.pushPose();

        if (state.timer > 0) {
            poseStack.scale(1, state.squish, 1);
        }
        state.blockModelRenderState.submit(poseStack, submitNodeCollector, state.lightCoords, OverlayTexture.NO_OVERLAY, 0);

        poseStack.popPose();
    }
}
