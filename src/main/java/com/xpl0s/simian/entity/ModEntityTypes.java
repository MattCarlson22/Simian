package com.xpl0s.simian.entity;

import com.xpl0s.simian.Simian;
import com.xpl0s.simian.entity.custom.OrangutanEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Simian.MOD_ID);

    public static final RegistryObject<EntityType<OrangutanEntity>> ORANGUTAN =
            ENTITY_TYPES.register("orangutan",
                    () -> EntityType.Builder.of(OrangutanEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1.35f)
                            .build(new ResourceLocation(Simian.MOD_ID, "orangutan").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
