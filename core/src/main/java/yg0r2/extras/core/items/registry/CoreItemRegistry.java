package yg0r2.extras.core.items.registry;

import static yg0r2.extras.api.items.McExtrasItems.*;

import yg0r2.extras.api.items.registry.ItemRegistry;
import yg0r2.extras.api.Colors;
import yg0r2.extras.core.items.*;

public final class CoreItemRegistry extends ItemRegistry {

    @Override
    public void registerItems() {
        COTTON = registerItem(new ItemCotton());
        COTTON_FLOWER_SEED = registerItem(new ItemCottonSeeds());

        CYAN_FLOWER_SEED = registerItem(new ItemColoredFlowerSeed(Colors.CYAN));

        GLOW_FLOWER_SEED = registerItem(new ItemGlowFlowerSeeds());

        MAGENTA_FLOWER_SEED = registerItem(new ItemColoredFlowerSeed(Colors.MAGENTA));

        ORANGE_FLOWER_SEED = registerItem(new ItemColoredFlowerSeed(Colors.ORANGE));

        PURPLE_FLOWER_SEED = registerItem(new ItemColoredFlowerSeed(Colors.PURPLE));

        RED_FLOWER_SEED = registerItem(new ItemColoredFlowerSeed(Colors.RED));

        WHITE_FLOWER_SEED = registerItem(new ItemColoredFlowerSeed(Colors.WHITE));

        YELLOW_FLOWER_SEED = registerItem(new ItemColoredFlowerSeed(Colors.YELLOW));
    }

}
