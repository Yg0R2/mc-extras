package yg0r2.extras.core.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.core.items.CoreItems;

import java.util.Arrays;
import java.util.List;

final class BlockRedFlowerCrop extends CoreBlockCrop {

    public BlockRedFlowerCrop() {
        super("redFlowerCrop");
    }

    @Override
    protected List<ItemStack> getItemsOnActivate() {
        return Arrays.asList(
            new ItemStack(CoreBlocks.RED_FLOWER, 2, 0),
            new ItemStack(CoreItems.RED_FLOWER_SEED, 1, 0)
        );
    }

    @Override
    protected Item getHarvestedItem() {
        return Item.getItemFromBlock(CoreBlocks.RED_FLOWER);
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return CoreItems.RED_FLOWER_SEED;
    }

}
