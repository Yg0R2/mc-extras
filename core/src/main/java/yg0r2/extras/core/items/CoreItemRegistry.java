package yg0r2.extras.core.items;

import net.minecraft.item.ItemDye;
import yg0r2.extras.core.ColoredContext;

public final class CoreItemRegistry extends ItemRegistry {

    @Override
    public void registerItems() {
        CoreItems.COTTON = registerItem(new ItemCotton());
        CoreItems.COTTON_FLOWER_SEED = registerItem(new ItemCottonSeeds());

        CoreItems.GLOW_FLOWER_SEED = registerItem(new ItemGlowFlowerSeeds());

        CoreItems.ORANGE_DYE = (ItemDye) registerItem(new ItemColoredDye(ColoredContext.ORANGE_COLOR));
        CoreItems.ORANGE_FLOWER_SEED = registerItem(new ItemColoredFlowerSeed(ColoredContext.ORANGE_COLOR));

        CoreItems.RED_DYE = (ItemDye) registerItem(new ItemColoredDye(ColoredContext.RED_COLOR));
        CoreItems.RED_FLOWER_SEED = registerItem(new ItemColoredFlowerSeed(ColoredContext.RED_COLOR));

        CoreItems.YELLOW_DYE = (ItemDye) registerItem(new ItemColoredDye(ColoredContext.YELLOW_COLOR));
        CoreItems.YELLOW_FLOWER_SEED = registerItem(new ItemColoredFlowerSeed(ColoredContext.YELLOW_COLOR));
    }

}
