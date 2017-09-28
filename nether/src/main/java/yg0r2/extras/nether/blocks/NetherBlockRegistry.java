package yg0r2.extras.nether.blocks;

import yg0r2.extras.core.blocks.BlockRegistry;

public final class NetherBlockRegistry extends BlockRegistry {

    @Override
    public void registerBlocks() {
        NetherBlocks.GLOW_FLOWER = registerBlock(new BlockGlowFlower());

        NetherBlocks.GLOW_FLOWER_CROP = registerBlock(new BlockGlowFlowerCrop());
    }

}
