package com.chaotistin.mytutorial.proxy;

import com.chaotistin.mytutorial.entities.BigMobEntity;
import com.chaotistin.mytutorial.entities.BigMobRenderer;
import com.chaotistin.mytutorial.entities.WeirdMobEntity;
import com.chaotistin.mytutorial.entities.WeirdMobRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy implements IProxy{
    @Override
    public void init() {
        RenderingRegistry.registerEntityRenderingHandler(WeirdMobEntity.class, WeirdMobRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(BigMobEntity.class, BigMobRenderer::new);
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
