package com.fish.daydream.illusion;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Function;

public class BlockIllusion {

    public Block original;
    public Block illusion;
    public Function<BlockState, Boolean> check;
    public boolean useModel;
    public boolean useCollisionShape;
    public boolean useVisualShape;
    public boolean useRenderShape;
    public boolean useLoot;
    public boolean usePathfindable;

    public BlockIllusion(Block original, Block illusion, Function<BlockState, Boolean> check, boolean useModel, boolean useCollisionShape, boolean useVisualShape, boolean useRenderShape, boolean useLoot, boolean usePathfindable) {
        this.original = original;
        this.illusion = illusion;
        this.check = check;
        this.useModel = useModel;
        this.useCollisionShape = useCollisionShape;
        this.useVisualShape = useVisualShape;
        this.useRenderShape = useRenderShape;
        this.useLoot = useLoot;
        this.usePathfindable = usePathfindable;
    }
}

