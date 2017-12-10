package yg0r2.extras.core.blocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlockCrop;
import yg0r2.extras.api.items.McExtrasItems;

import java.util.Arrays;
import java.util.List;

public final class BlockYellowFlowerCrop extends McExtrasBlockCrop {

    public BlockYellowFlowerCrop() {
        super("yellowFlowerCrop", "core:yellowFlowerCrop");
    }

    @Override
    protected List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(Blocks.yellow_flower, 2, 0),
            new ItemStack(McExtrasItems.YELLOW_FLOWER_SEED, 1, 0)
        );
    }

    @Override
    protected Item getHarvestedItem() {
        return Item.getItemFromBlock(Blocks.yellow_flower);
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return McExtrasItems.YELLOW_FLOWER_SEED;
    }

}
