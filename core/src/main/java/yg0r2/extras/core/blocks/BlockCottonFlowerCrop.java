package yg0r2.extras.core.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlockCrop;
import yg0r2.extras.api.items.McExtrasItems;

import java.util.Arrays;
import java.util.List;

public final class BlockCottonFlowerCrop extends McExtrasBlockCrop {

    public BlockCottonFlowerCrop() {
        super("cottonFlowerCrop", "core:cottonFlowerCrop");
    }

    @Override
    protected List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(McExtrasItems.COTTON, 2, 0),
            new ItemStack(McExtrasItems.COTTON_FLOWER_SEED, 1, 0)
        );
    }

    @Override
    protected Item getHarvestedItem() {
        return McExtrasItems.COTTON;
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return McExtrasItems.COTTON_FLOWER_SEED;
    }

}
