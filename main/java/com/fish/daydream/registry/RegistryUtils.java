package com.fish.daydream.registry;

import net.minecraft.core.Registry;

import java.util.Optional;

public class RegistryUtils {

    public static <T> Optional<T> findRegistryEntryByData(Registry<T> registry, java.util.function.Predicate<T> condition) {
        return registry.stream().filter(condition).findFirst();
    }
}
