package yg0r2.extras.core.items;

public final class CoreItemRegistry extends ItemRegistry {

    @Override
    public void registerItems() {
        CoreItems.COTTON = registerItem(new ItemCotton());
        CoreItems.COTTON_FLOWER_SEED = registerItem(new ItemCottonSeeds());

        CoreItems.GLOW_FLOWER_SEED = registerItem(new ItemGlowFlowerSeeds());

        CoreItems.ORANGE_DYE = registerItem(new ItemColoredDye("orange"));
        CoreItems.ORANGE_FLOWER_SEED = registerItem(new ItemOrangeFlowerSeed());

        CoreItems.RED_DYE = registerItem(new ItemColoredDye("red"));
        CoreItems.RED_FLOWER_SEED = registerItem(new ItemRedFlowerSeed());

        CoreItems.YELLOW_DYE = registerItem(new ItemColoredDye("yellow"));
        CoreItems.YELLOW_FLOWER_SEED = registerItem(new ItemYellowFlowerSeed());
    }

}
