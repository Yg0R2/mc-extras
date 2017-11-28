package yg0r2.extras.core.items;

import net.minecraft.block.Block;

abstract class CoreItemSeed extends AbstractItemSeed {

    public CoreItemSeed(Block flowerCropBlock, Block soilBlock, String blockName) {
        this(flowerCropBlock, soilBlock, blockName, "core:" + blockName);
    }

    public CoreItemSeed(Block flowerCropBlock, Block soilBlock, String blockName, String textureName) {
        super(flowerCropBlock, soilBlock, blockName, textureName);
    }

}
