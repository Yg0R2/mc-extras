package yg0r2.extras.core.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.core.items.CoreItems;

import java.util.Arrays;
import java.util.List;

final class BlockOrangeFlowerCrop extends CoreBlockCrop {

    public BlockOrangeFlowerCrop() {
        super("orangeFlowerCrop");
    }

    @Override
    protected List<ItemStack> getItemsOnActivate() {
        return Arrays.asList(
            new ItemStack(CoreBlocks.ORANGE_FLOWER, 2, 0),
            new ItemStack(CoreItems.ORANGE_FLOWER_SEED, 1, 0)
        );
    }

    @Override
    protected Item getHarvestedItem() {
        return Item.getItemFromBlock(CoreBlocks.ORANGE_FLOWER);
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return CoreItems.ORANGE_FLOWER_SEED;
    }

}
