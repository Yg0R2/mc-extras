package yg0r2.extras.core.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.core.items.CoreItems;

import java.util.Arrays;
import java.util.List;

final class BlockCottonFlowerCrop extends CoreBlockCrop {

    public BlockCottonFlowerCrop() {
        super("cottonFlowerCrop");
    }

    @Override
    protected List<ItemStack> getItemsOnActivate() {
        return Arrays.asList(
            new ItemStack(CoreItems.COTTON, 2, 0),
            new ItemStack(CoreItems.COTTON_FLOWER_SEED, 1, 0)
        );
    }

    @Override
    protected Item getHarvestedItem() {
        return CoreItems.COTTON;
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return CoreItems.COTTON_FLOWER_SEED;
    }

}
