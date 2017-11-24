package yg0r2.extras.core.items;

public final class CoreItemRegistry extends ItemRegistry {

    @Override
    public void registerItems() {
        CoreItems.COTTON = registerItem(new ItemCotton());
        CoreItems.COTTON_FLOWER_SEED = registerItem(new ItemCottonSeeds());

        CoreItems.GLOW_FLOWER_SEED = registerItem(new ItemGlowFlowerSeeds());
    }

}
