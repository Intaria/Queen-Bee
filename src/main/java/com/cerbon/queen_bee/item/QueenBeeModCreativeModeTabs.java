package com.cerbon.queen_bee.item;

import com.cerbon.queen_bee.QueenBeeMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class QueenBeeModCreativeModeTabs {
    public static final CreativeModeTab QUEEN_BEE_TAB = new CreativeModeTab(QueenBeeMod.MOD_ID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(QueenBeeModItems.STINGER.get());
        }
    };

}
