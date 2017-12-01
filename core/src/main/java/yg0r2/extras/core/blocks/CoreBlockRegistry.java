package yg0r2.extras.core.blocks;

import yg0r2.extras.core.ColoredContext;

public final class CoreBlockRegistry extends BlockRegistry {

    @Override
    public void registerBlocks() {
        CoreBlocks.COTTON_FLOWER = registerBlock(new BlockCottonFlower());
        CoreBlocks.COTTON_FLOWER_CROP = registerBlock(new BlockCottonFlowerCrop());

        CoreBlocks.GLOW_FLOWER = registerBlock(new BlockGlowFlower());
        CoreBlocks.GLOW_FLOWER_CROP = registerBlock(new BlockGlowFlowerCrop());

        CoreBlocks.ORANGE_FLOWER = registerBlock(new BlockColoredFlower(ColoredContext.ORANGE_COLOR));
        CoreBlocks.ORANGE_FLOWER_CROP = registerBlock(new BlockColoredFlowerCrop(ColoredContext.ORANGE_COLOR));

        CoreBlocks.RED_FLOWER = registerBlock(new BlockColoredFlower(ColoredContext.RED_COLOR));
        CoreBlocks.RED_FLOWER_CROP = registerBlock(new BlockColoredFlowerCrop(ColoredContext.RED_COLOR));

        CoreBlocks.YELLOW_FLOWER = registerBlock(new BlockColoredFlower(ColoredContext.YELLOW_COLOR));
        CoreBlocks.YELLOW_FLOWER_CROP = registerBlock(new BlockColoredFlowerCrop(ColoredContext.YELLOW_COLOR));
    }

}
