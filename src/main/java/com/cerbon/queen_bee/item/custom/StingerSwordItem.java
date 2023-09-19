package com.cerbon.queen_bee.item.custom;

import com.cerbon.queen_bee.QueenBeeMod;
import com.cerbon.queen_bee.config.QueenBeeModCommonConfigs;
import com.cerbon.queen_bee.item.QueenBeeModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class StingerSwordItem extends SwordItem {
    public StingerSwordItem(int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(new Tier() {
            @Override
            public int getUses() {
                return 250;
            }

            @Override
            public float getSpeed() {
                return 2.0F;
            }

            @Override
            public float getAttackDamageBonus() {
                return 0;
            }

            @Override
            public int getLevel() {
                return 0;
            }

            @Override
            public int getEnchantmentValue() {
                return 12;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return null;
            }
        }, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack pStack, @NotNull LivingEntity pTarget, @NotNull LivingEntity pAttacker) {
        if (QueenBeeModCommonConfigs.ENABLE_POISON_EFFECT.get()) {
            pTarget.addEffect(new MobEffectInstance(MobEffects.POISON, QueenBeeModCommonConfigs.STINGER_SWORD_POISON_EFFECT_DURATION.get(), QueenBeeModCommonConfigs.STINGER_SWORD_POISON_EFFECT_AMPLIFIER.get()));
        }
        if (QueenBeeModCommonConfigs.ENABLE_NAUSEA_EFFECT.get()) {
            pTarget.addEffect(new MobEffectInstance(MobEffects.CONFUSION, QueenBeeModCommonConfigs.NAUSEA_EFFECT_DURATION.get(), 0));
        }
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, @NotNull Player pPlayer, @NotNull InteractionHand pUsedHand) {
        return super.use(pLevel, pPlayer, pUsedHand);
    }


    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
