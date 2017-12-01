package yg0r2.extras.core.blocks;

import net.minecraft.item.ItemStack;
import yg0r2.extras.core.ColoredContext;

import java.util.Arrays;
import java.util.List;

final class BlockColoredFlower extends CoreBlockFlower {

    private ColoredContext coloredContext;

    public BlockColoredFlower(ColoredContext coloredContext) {
        super(coloredContext.getFlowerBlockName(), coloredContext.getFlowerBlockTextureName());

        this.coloredContext = coloredContext;
    }

    @Override
    public List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(this, 2, 0),
            new ItemStack(coloredContext.getSeed(), 1, 0)
        );
    }

}
