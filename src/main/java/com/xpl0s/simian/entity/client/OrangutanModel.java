package com.xpl0s.simian.entity.client;

import com.xpl0s.simian.Simian;
import com.xpl0s.simian.entity.custom.OrangutanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrangutanModel extends AnimatedGeoModel<OrangutanEntity> {
    @Override
    public ResourceLocation getModelLocation(OrangutanEntity object) {
        return new ResourceLocation(Simian.MOD_ID, "geo/orangutan.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OrangutanEntity object) {
        return new ResourceLocation(Simian.MOD_ID, "textures/entity/orangutan/orangutan.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OrangutanEntity animatable) {
        return new ResourceLocation(Simian.MOD_ID, "animations/orangutan.animation.json");
    }
}
