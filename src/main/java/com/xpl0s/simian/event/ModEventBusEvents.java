package com.xpl0s.simian.event;

import com.xpl0s.simian.Simian;
import com.xpl0s.simian.entity.ModEntityTypes;
import com.xpl0s.simian.entity.custom.OrangutanEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Simian.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.ORANGUTAN.get(), OrangutanEntity.setAttributes());
    }
}
