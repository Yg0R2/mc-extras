package yg0r2.extras.core.blocks;

import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlockFlower;
import yg0r2.extras.api.domain.ItemDrop;
import yg0r2.extras.api.items.McExtrasItems;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class BlockCottonFlower extends McExtrasBlockFlower {

    public BlockCottonFlower() {
        super("cottonFlower", "core:cottonFlower");
    }

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(2) + 2;
    }

    @Override
    protected List<ItemDrop> getDestroyedItemDrops() {
        return Arrays.asList(
            new ItemDrop(1, 3, new ItemStack(McExtrasItems.COTTON, 2, 0)),
            new ItemDrop(1, 1, new ItemStack(McExtrasItems.COTTON_FLOWER_SEED, 1, 0))
        );
    }

}
