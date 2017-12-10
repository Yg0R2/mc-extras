package yg0r2.extras.core.items.registry;

import yg0r2.extras.api.items.McExtrasItems;
import yg0r2.extras.api.items.registry.ItemRegistry;
import yg0r2.extras.core.items.*;

public final class CoreItemRegistry extends ItemRegistry {

    @Override
    public void registerItems() {
        McExtrasItems.COTTON = registerItem(new ItemCotton());
        McExtrasItems.COTTON_FLOWER_SEED = registerItem(new ItemCottonSeeds());

        McExtrasItems.GLOW_FLOWER_SEED = registerItem(new ItemGlowFlowerSeeds());

        McExtrasItems.ORANGE_FLOWER_SEED = registerItem(new ItemOrangeFlowerSeed());

        McExtrasItems.RED_FLOWER_SEED = registerItem(new ItemRedFlowerSeed());

        McExtrasItems.YELLOW_FLOWER_SEED = registerItem(new ItemYellowFlowerSeed());
    }

}
