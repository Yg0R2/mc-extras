package yg0r2.extras.core.blocks;

public final class CoreBlockRegistry extends BlockRegistry {

    @Override
    public void registerBlocks() {
        CoreBlocks.COTTON_FLOWER = registerBlock(new BlockCottonFlower());
        CoreBlocks.COTTON_FLOWER_CROP = registerBlock(new BlockCottonFlowerCrop());

        CoreBlocks.GLOW_FLOWER = registerBlock(new BlockGlowFlower());
        CoreBlocks.GLOW_FLOWER_CROP = registerBlock(new BlockGlowFlowerCrop());
    }

}
