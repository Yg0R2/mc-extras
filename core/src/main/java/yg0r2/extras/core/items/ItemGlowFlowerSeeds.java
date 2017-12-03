package yg0r2.extras.core.items;

import net.minecraft.init.Blocks;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItemSeed;

public final class ItemGlowFlowerSeeds extends McExtrasItemSeed {

    public ItemGlowFlowerSeeds() {
        super(McExtrasBlocks.GLOW_FLOWER_CROP, Blocks.farmland, "glowFlowerSeed", "core:glowFlowerSeed");
    }

}
