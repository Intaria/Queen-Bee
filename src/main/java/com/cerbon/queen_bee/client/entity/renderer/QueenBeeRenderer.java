package com.cerbon.queen_bee.client.entity.renderer;

import com.cerbon.queen_bee.QueenBeeMod;
import com.cerbon.queen_bee.client.entity.model.QueenBeeModel;
import com.cerbon.queen_bee.entity.custom.QueenBeeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class QueenBeeRenderer extends GeoEntityRenderer<QueenBeeEntity> {
    public QueenBeeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new QueenBeeModel());
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(QueenBeeEntity entity) {
        if(entity.isAngry()){
            return new ResourceLocation(QueenBeeMod.MOD_ID, "textures/entity/queen_bee_angry.png");
        }else {
            return new ResourceLocation(QueenBeeMod.MOD_ID, "textures/entity/queen_bee.png");
        }
    }

    @Override
    public RenderType getRenderType(QueenBeeEntity animatable, float partialTick, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        poseStack.scale(1f, 1f, 1f);
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
