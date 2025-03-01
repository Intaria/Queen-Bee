package com.cerbon.queen_bee.entity;

import com.cerbon.queen_bee.QueenBeeMod;
import com.cerbon.queen_bee.entity.custom.QueenBeeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class QueenBeeModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, QueenBeeMod.MOD_ID);

    public static final RegistryObject<EntityType<QueenBeeEntity>> QUEEN_BEE =
            ENTITY_TYPES.register("queen_bee",
                    () -> EntityType.Builder.of(QueenBeeEntity::new, MobCategory.CREATURE)
                            .sized(0.85f, 1.38f)
                            .build(new ResourceLocation(QueenBeeMod.MOD_ID, "queen_bee").toString()));

    public static void register(IEventBus eventBusbus){
        ENTITY_TYPES.register(eventBusbus);
    }
}
