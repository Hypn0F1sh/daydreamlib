package com.fish.daydream;

import com.fish.daydream.registry.DaydreamRegistries;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.NewRegistryEvent;

@Mod(DaydreamLib.MODID)
@EventBusSubscriber
public class DaydreamLibEventHandler {

    @SubscribeEvent // on the mod event bus
    public static void registerRegistries(NewRegistryEvent event) {
        event.register(DaydreamRegistries.BLOCK_ILLUSION);
    }
}
