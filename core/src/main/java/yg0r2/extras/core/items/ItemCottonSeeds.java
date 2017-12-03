package yg0r2.extras.core.items;

import net.minecraft.init.Blocks;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItemSeed;

public final class ItemCottonSeeds extends McExtrasItemSeed {

    public ItemCottonSeeds() {
        super(McExtrasBlocks.COTTON_FLOWER_CROP, Blocks.farmland, "cottonFlowerSeed", "core:cottonFlowerSeed");
    }

}
