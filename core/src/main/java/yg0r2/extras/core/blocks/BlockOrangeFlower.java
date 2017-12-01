package yg0r2.extras.core.blocks;

import net.minecraft.item.ItemStack;
import yg0r2.extras.core.items.CoreItems;

import java.util.Arrays;
import java.util.List;

final class BlockOrangeFlower extends CoreBlockFlower {

    public BlockOrangeFlower() {
        super("orangeFLower");
    }

    @Override
    public List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(CoreBlocks.ORANGE_FLOWER, 2, 0),
            new ItemStack(CoreItems.ORANGE_FLOWER_SEED, 1, 0)
        );
    }

}
