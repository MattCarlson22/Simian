package com.xpl0s.simian.item;

import com.xpl0s.simian.Simian;
import com.xpl0s.simian.entity.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Simian.MOD_ID);

    public static final RegistryObject<Item> ORANGUTAN_SPAWN_EGG = ITEMS.register("orangutan_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ORANGUTAN,0x50452b,0x271f0b,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
