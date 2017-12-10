package yg0r2.extras.core.items;

import net.minecraft.init.Blocks;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItemSeed;

public final class ItemOrangeFlowerSeed extends McExtrasItemSeed {

    public ItemOrangeFlowerSeed() {
        super(McExtrasBlocks.ORANGE_FLOWER_CROP, Blocks.farmland, "orangeFlowerSeed", "core:orangeFlowerSeed");
    }

}
