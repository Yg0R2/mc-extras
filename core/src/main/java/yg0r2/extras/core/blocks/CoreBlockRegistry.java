package yg0r2.extras.core.blocks;

public final class CoreBlockRegistry extends BlockRegistry {

    @Override
    public void registerBlocks() {
        CoreBlocks.GLOW_FLOWER = registerBlock(new BlockGlowFlower());

        CoreBlocks.GLOW_FLOWER_CROP = registerBlock(new BlockGlowFlowerCrop());
    }

}
