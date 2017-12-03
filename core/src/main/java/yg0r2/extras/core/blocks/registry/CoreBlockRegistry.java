package yg0r2.extras.core.blocks.registry;

import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.blocks.registry.BlockRegistry;
import yg0r2.extras.core.blocks.BlockCottonFlower;
import yg0r2.extras.core.blocks.BlockCottonFlowerCrop;
import yg0r2.extras.core.blocks.BlockGlowFlower;
import yg0r2.extras.core.blocks.BlockGlowFlowerCrop;

public final class CoreBlockRegistry extends BlockRegistry {

    @Override
    public void registerBlocks() {
        McExtrasBlocks.COTTON_FLOWER = registerBlock(new BlockCottonFlower());
        McExtrasBlocks.COTTON_FLOWER_CROP = registerBlock(new BlockCottonFlowerCrop());

        McExtrasBlocks.GLOW_FLOWER = registerBlock(new BlockGlowFlower());
        McExtrasBlocks.GLOW_FLOWER_CROP = registerBlock(new BlockGlowFlowerCrop());
    }

}
