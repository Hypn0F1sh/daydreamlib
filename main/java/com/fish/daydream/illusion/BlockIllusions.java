package com.fish.daydream.illusion;

import com.fish.daydream.DaydreamLib;
import com.fish.daydream.registry.DaydreamRegistries;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockIllusions {
    public static final DeferredRegister<BlockIllusion> BLOCK_ILLUSIONS = DeferredRegister.create(
            DaydreamRegistries.BLOCK_ILLUSION,
            DaydreamLib.MODID
    );

    Supplier<BlockIllusion> TEST_ILLUSION = BLOCK_ILLUSIONS.register("test_illusion",
            () -> new BlockIllusion(
                    Blocks.OAK_PLANKS,
                    Blocks.AIR,
                    (state) -> true,
                    true,
                    true,
                    true,
                    true,
                    true,
                    true
            ));

    public static void register(IEventBus eventBus) {
        BLOCK_ILLUSIONS.register(eventBus);
    }
}
