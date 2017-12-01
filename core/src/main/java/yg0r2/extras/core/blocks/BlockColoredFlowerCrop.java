package yg0r2.extras.core.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.core.ColoredContext;

import java.util.Arrays;
import java.util.List;

final class BlockColoredFlowerCrop extends CoreBlockCrop {

    private ColoredContext coloredContext;

    public BlockColoredFlowerCrop(ColoredContext coloredContext) {
        super(coloredContext.getCropName());

        this.coloredContext = coloredContext;
    }

    @Override
    protected List<ItemStack> getItemsOnActivate() {
        return Arrays.asList(
            new ItemStack(coloredContext.getFlower(), 2, 0),
            new ItemStack(coloredContext.getSeed(), 1, 0)
        );
    }

    @Override
    protected Item getHarvestedItem() {
        return Item.getItemFromBlock(coloredContext.getFlower());
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return coloredContext.getSeed();
    }
}
