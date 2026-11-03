package com.fish.daydream.registry;

import com.fish.daydream.DaydreamLib;
import com.fish.daydream.illusion.BlockIllusion;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.registries.RegistryBuilder;

public class DaydreamRegistries {

    public static final ResourceKey<Registry<BlockIllusion>> BLOCK_ILLUSION_KEY =
            ResourceKey.createRegistryKey(Identifier.fromNamespaceAndPath(DaydreamLib.MODID, "block_illusion"));

    public static final Registry<BlockIllusion> BLOCK_ILLUSION = new RegistryBuilder<>(BLOCK_ILLUSION_KEY).create();
}
