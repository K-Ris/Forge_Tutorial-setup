package com.chaotistin.mytutorial.setup;

import com.chaotistin.mytutorial.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public static ItemGroup itemGroup = new ItemGroup("mytutorial"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }
    };

    public void init(){

    }
}
