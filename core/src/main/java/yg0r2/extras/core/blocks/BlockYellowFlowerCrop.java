package yg0r2.extras.core.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.core.items.CoreItems;

import java.util.Arrays;
import java.util.List;

final class BlockYellowFlowerCrop extends CoreBlockCrop {

    public BlockYellowFlowerCrop() {
        super("yellowFlowerCrop");
    }

    @Override
    protected List<ItemStack> getItemsOnActivate() {
        return Arrays.asList(
            new ItemStack(CoreBlocks.YELLOW_FLOWER, 2, 0),
            new ItemStack(CoreItems.YELLOW_FLOWER_SEED, 1, 0)
        );
    }

    @Override
    protected Item getHarvestedItem() {
        return Item.getItemFromBlock(CoreBlocks.YELLOW_FLOWER);
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return CoreItems.YELLOW_FLOWER_SEED;
    }

}
