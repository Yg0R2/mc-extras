package yg0r2.extras.core.blocks;

public final class CoreBlockRegistry extends BlockRegistry {

    @Override
    public void registerBlocks() {
        CoreBlocks.COTTON_FLOWER = registerBlock(new BlockCottonFlower());
        CoreBlocks.COTTON_FLOWER_CROP = registerBlock(new BlockCottonFlowerCrop());

        CoreBlocks.GLOW_FLOWER = registerBlock(new BlockGlowFlower());
        CoreBlocks.GLOW_FLOWER_CROP = registerBlock(new BlockGlowFlowerCrop());

        CoreBlocks.ORANGE_FLOWER = registerBlock(new BlockOrangeFlower());
        CoreBlocks.ORANGE_FLOWER_CROP = registerBlock(new BlockOrangeFlowerCrop());

        CoreBlocks.RED_FLOWER = registerBlock(new BlockRedFlower());
        CoreBlocks.RED_FLOWER_CROP = registerBlock(new BlockRedFlowerCrop());

        CoreBlocks.YELLOW_FLOWER = registerBlock(new BlockYellowFlower());
        CoreBlocks.YELLOW_FLOWER_CROP = registerBlock(new BlockYellowFlowerCrop());
    }

}
