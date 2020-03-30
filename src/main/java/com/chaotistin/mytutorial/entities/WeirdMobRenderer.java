package com.chaotistin.mytutorial.entities;

import com.chaotistin.mytutorial.MyTutorial;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class WeirdMobRenderer extends MobRenderer<WeirdMobEntity, WeirdMobModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(MyTutorial.MODID, "textures/entity/weirdmob.png");

    public WeirdMobRenderer(EntityRendererManager manager) {
        super(manager, new WeirdMobModel(), 0.5f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(WeirdMobEntity entity) {
        return TEXTURE;
    }
}
