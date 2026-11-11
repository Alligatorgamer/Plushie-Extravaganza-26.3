package net.alligator.plushie_extravaganza.block.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.alligator.plushie_extravaganza.block.custom.Plushie;
import net.alligator.plushie_extravaganza.block.entity.custom.PlushieEntity;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class PlushieEntityRenderer implements BlockEntityRenderer<PlushieEntity, PlushieEntityRendererState> {
    public final ModelBlockRenderer models;

    public PlushieEntityRenderer(BlockEntityRendererProvider.Context context, ModelBlockRenderer models) {
        this.models = models;
    }


    @Override
    public PlushieEntityRendererState createRenderState() {
        return new PlushieEntityRendererState();
    }

    @Override
    public void extractRenderState(PlushieEntity blockEntity, PlushieEntityRendererState state, float partialTicks, Vec3 cameraPosition, ModelFeatureRenderer.@Nullable CrumblingOverlay breakProgress) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, partialTicks, cameraPosition, breakProgress);
    }

    @Override
    public void submit(PlushieEntityRendererState state, PoseStack poseStack,
                       SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
        poseStack.pushPose();

        poseStack.translate(0,0,0);
        float scaleFactor =2f;
        poseStack.scale(0,scaleFactor,0);


        poseStack.popPose();
    }
}
