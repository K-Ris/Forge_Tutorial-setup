package com.chaotistin.mytutorial.entities;

import com.chaotistin.mytutorial.MyTutorial;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class BigMobRenderer extends MobRenderer<BigMobEntity, BigMobModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(MyTutorial.MODID, "textures/entity/bigmob.png");

    public BigMobRenderer(EntityRendererManager manager) {
        super(manager, new BigMobModel(), 0.5f); //0.5f = shadow size
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(BigMobEntity entity) {
        return TEXTURE;
    }
}
