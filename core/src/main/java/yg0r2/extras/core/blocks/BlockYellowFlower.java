package yg0r2.extras.core.blocks;

import net.minecraft.item.ItemStack;
import yg0r2.extras.core.items.CoreItems;

import java.util.Arrays;
import java.util.List;

final class BlockYellowFlower extends CoreBlockFlower {

    public BlockYellowFlower() {
        super("yellowFlower", "flower_dandelion");
    }

    @Override
    public List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(CoreBlocks.YELLOW_FLOWER, 2, 0),
            new ItemStack(CoreItems.YELLOW_FLOWER_SEED, 1, 0)
        );
    }

}
