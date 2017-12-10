package yg0r2.extras.core.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlockCrop;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItems;

import java.util.Arrays;
import java.util.List;

public final class BlockOrangeFlowerCrop extends McExtrasBlockCrop {

    public BlockOrangeFlowerCrop() {
        super("orangeFlowerCrop", "core:orangeFlowerCrop");
    }

    @Override
    protected List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(McExtrasBlocks.ORANGE_FLOWER, 2, 0),
            new ItemStack(McExtrasItems.ORANGE_FLOWER_SEED, 1, 0)
        );
    }

    @Override
    protected Item getHarvestedItem() {
        return Item.getItemFromBlock(McExtrasBlocks.ORANGE_FLOWER);
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return McExtrasItems.ORANGE_FLOWER_SEED;
    }

}
