package yg0r2.extras.core.blocks;

import net.minecraft.item.ItemStack;
import yg0r2.extras.core.items.CoreItems;

import java.util.Arrays;
import java.util.List;

final class BlockRedFlower extends CoreBlockFlower {

    public BlockRedFlower() {
        super("redFlower", "flower_rose");
    }

    @Override
    public List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(CoreBlocks.RED_FLOWER, 2, 0),
            new ItemStack(CoreItems.RED_FLOWER_SEED, 1, 0)
        );
    }

}
