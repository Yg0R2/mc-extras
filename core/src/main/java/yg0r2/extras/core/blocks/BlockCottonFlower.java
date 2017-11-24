package yg0r2.extras.core.blocks;

import net.minecraft.item.ItemStack;
import yg0r2.extras.core.items.CoreItems;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BlockCottonFlower extends CoreBlockFlower {

    protected BlockCottonFlower() {
        super("cottonFlower");
    }

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(2) + 2;
    }

    @Override
    protected List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(CoreItems.COTTON, 2, 0),
            new ItemStack(CoreItems.COTTON_FLOWER_SEED, 1, 0)
        );
    }

}
