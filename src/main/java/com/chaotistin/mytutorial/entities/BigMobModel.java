package com.chaotistin.mytutorial.entities;

import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.math.MathHelper;

public class BigMobModel extends QuadrupedModel<BigMobEntity> {
    private final RendererModel main;
    private final RendererModel head;
    private final RendererModel bone6;
    private final RendererModel bone7;
    private final RendererModel tail;
    private final RendererModel bone;
    private final RendererModel body;
    private final RendererModel bone2;
    private final RendererModel bone4;
    private final RendererModel bone3;
    private final RendererModel bone5;

    public BigMobModel() {
        super(6, 0.0F);
        textureWidth = 128;
        textureHeight = 128;

        main = new RendererModel(this);
        main.setRotationPoint(0.0F, 24.0F, 0.0F);
        main.cubeList.add(new ModelBox(main, 0, 31, -8.0F, -30.0F, -8.0F, 16, 30, 17, 0.0F, false));

        head = new RendererModel(this);
        head.setRotationPoint(0.0F, -30.0F, -4.0F);
        main.addChild(head);
        head.cubeList.add(new ModelBox(head, 0, 78, -4.0F, -10.0F, -1.0F, 8, 14, 8, 0.0F, false));

        bone6 = new RendererModel(this);
        bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
        head.addChild(bone6);
        bone6.cubeList.add(new ModelBox(bone6, 47, 59, -9.0F, -20.0F, -10.0F, 19, 12, 19, 0.0F, false));

        bone7 = new RendererModel(this);
        bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone6.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 81, 42, -5.0F, -15.0F, -14.0F, 10, 6, 6, 0.0F, false));

        tail = new RendererModel(this);
        tail.setRotationPoint(0.0F, -2.0F, 6.75F);
        main.addChild(tail);
        tail.cubeList.add(new ModelBox(tail, 49, 31, -5.0F, -6.0F, 2.25F, 10, 8, 9, 0.0F, false));

        bone = new RendererModel(this);
        bone.setRotationPoint(0.0F, -0.5F, 11.25F);
        tail.addChild(bone);
        bone.cubeList.add(new ModelBox(bone, 84, 90, -3.0F, -2.5F, 0.0F, 6, 5, 6, 0.0F, false));

        body = new RendererModel(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        main.addChild(body);
        body.cubeList.add(new ModelBox(body, 0, 0, -10.0F, -31.0F, -10.0F, 21, 10, 21, 0.0F, false));

        bone2 = new RendererModel(this);
        bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        main.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 84, 12, 7.0F, -12.0F, -4.0F, 5, 12, 9, 0.0F, false));

        bone4 = new RendererModel(this);
        bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone2.addChild(bone4);
        bone4.cubeList.add(new ModelBox(bone4, 58, 90, 10.0F, -5.0F, -8.0F, 5, 5, 8, 0.0F, false));

        bone3 = new RendererModel(this);
        bone3.setRotationPoint(-18.0F, 0.0F, 0.0F);
        main.addChild(bone3);
        bone3.cubeList.add(new ModelBox(bone3, 63, 0, 7.0F, -12.0F, -4.0F, 5, 12, 9, 0.0F, false));

        bone5 = new RendererModel(this);
        bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(bone5);
        bone5.cubeList.add(new ModelBox(bone5, 32, 90, 3.0F, -5.0F, -7.0F, 5, 5, 8, 0.0F, false));
    }

    @Override
    public void render(BigMobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        main.render(scale);
    }

    @Override
    public void setRotationAngles(BigMobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        this.headModel.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.headModel.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        //this.main.rotateAngleX = ((float)Math.PI / 2F);
        //this.leg_front_left.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        //this.leg_front_right.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        //this.leg_back_left.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        //this.leg_back_right.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }

    public RendererModel getHead() {
        return this.head;
    }

}
