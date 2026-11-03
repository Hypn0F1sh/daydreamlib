package com.fish.daydream.mixin;

import com.fish.daydream.illusion.BlockIllusion;
import com.fish.daydream.registry.DaydreamRegistries;
import com.fish.daydream.registry.RegistryUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(BlockBehaviour.class)
public abstract class BlockBehaviourMixin {

    @Shadow
    protected abstract Block asBlock();

    @Unique
    private Block block = this.asBlock();

    @Inject(
            method = "getRenderShape",
            at = @At("HEAD"),
            cancellable = true
    )
    private void onGetRenderShape(BlockState state, CallbackInfoReturnable<RenderShape> cir) {

        System.out.println("buh??");

        Optional<BlockIllusion> optional = RegistryUtils.findRegistryEntryByData(DaydreamRegistries.BLOCK_ILLUSION,
                data -> data.original == block);

        BlockIllusion illusion = optional.orElse(null);
        if (illusion != null) {
            System.out.println("meow");
            if (illusion.useRenderShape) {
                if (illusion.check.apply(state)) {
                    System.out.println("rahhhhh");
                    cir.setReturnValue(illusion.illusion.defaultBlockState().getRenderShape());
                }
            }
        }
    }
}