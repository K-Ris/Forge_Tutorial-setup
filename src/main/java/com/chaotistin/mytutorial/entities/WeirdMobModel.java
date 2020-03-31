package com.chaotistin.mytutorial.entities;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class WeirdMobModel extends EntityModel<WeirdMobEntity> {

    private final RendererModel bone;
    private final RendererModel bone2;
    private final RendererModel bone3;

    public WeirdMobModel() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new RendererModel(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -7.0F, -5.0F, 16, 7, 10, 0.0F, false));

        bone2 = new RendererModel(this);
        bone2.setRotationPoint(7.0F, -6.0F, 0.0F);
        bone.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 0, 32, -2.0F, -7.0F, -6.0F, 9, 8, 12, 0.0F, false));

        bone3 = new RendererModel(this);
        bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(bone3);
        bone3.cubeList.add(new ModelBox(bone3, 0, 17, -9.0F, -8.0F, -6.0F, 12, 3, 12, 0.0F, false));
    }

    @Override
    public void render(WeirdMobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        bone.render(scale);
    }

    @Override
    public void setRotationAngles(WeirdMobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {

    }
}
