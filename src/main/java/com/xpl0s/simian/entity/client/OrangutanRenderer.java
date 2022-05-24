package com.xpl0s.simian.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.xpl0s.simian.Simian;
import com.xpl0s.simian.entity.custom.OrangutanEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OrangutanRenderer extends GeoEntityRenderer<OrangutanEntity> {
    public OrangutanRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new OrangutanModel());
        this.shadowRadius = 0.6f;
    }
    @Override
    public ResourceLocation getTextureLocation(OrangutanEntity instance) {
        return new ResourceLocation(Simian.MOD_ID, "textures/entity/orangutan/orangutan.png");
    }
    @Override
    public RenderType getRenderType(OrangutanEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
