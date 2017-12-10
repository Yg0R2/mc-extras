package yg0r2.extras.core.items;

import net.minecraft.init.Blocks;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItemSeed;

public final class ItemYellowFlowerSeed extends McExtrasItemSeed {

    public ItemYellowFlowerSeed() {
        super(McExtrasBlocks.YELLOW_FLOWER_CROP, Blocks.farmland, "yellowFlowerSeed", "core:yellowFlowerSeed");
    }

}
