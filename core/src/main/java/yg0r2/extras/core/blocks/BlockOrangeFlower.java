package yg0r2.extras.core.blocks;

import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlockFlower;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItems;

import java.util.Arrays;
import java.util.List;

public final class BlockOrangeFlower extends McExtrasBlockFlower {

    public BlockOrangeFlower() {
        super("orangeFlower", "core:orangeFlower");
    }

    @Override
    public List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(McExtrasBlocks.ORANGE_FLOWER, 2, 0),
            new ItemStack(McExtrasItems.ORANGE_FLOWER_SEED, 1, 0)
        );
    }

}
