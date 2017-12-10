package yg0r2.extras.core.items;

import net.minecraft.init.Blocks;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItemSeed;

public final class ItemRedFlowerSeed extends McExtrasItemSeed {

    public ItemRedFlowerSeed() {
        super(McExtrasBlocks.RED_FLOWER_CROP, Blocks.farmland, "redFlowerSeed", "core:redFlowerSeed");
    }

}
