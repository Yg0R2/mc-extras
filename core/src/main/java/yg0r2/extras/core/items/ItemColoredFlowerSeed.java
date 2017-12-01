package yg0r2.extras.core.items;

import net.minecraft.init.Blocks;
import yg0r2.extras.core.ColoredContext;

final class ItemColoredFlowerSeed extends CoreItemSeed {

    public ItemColoredFlowerSeed(ColoredContext coloredContext) {
        super(coloredContext.getCrop(), Blocks.farmland, coloredContext.getSeedName());
    }

}
