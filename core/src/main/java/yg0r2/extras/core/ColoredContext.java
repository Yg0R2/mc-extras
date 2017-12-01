package yg0r2.extras.core;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import yg0r2.extras.core.blocks.CoreBlocks;
import yg0r2.extras.core.items.CoreItems;

public enum ColoredContext {

    ORANGE_COLOR(CoreBlocks.ORANGE_FLOWER, "orangeFlower", "core:orangeFlower", CoreItems.ORANGE_FLOWER_SEED, "orangeFlowerSeed", CoreBlocks.ORANGE_FLOWER_CROP, "orangeFlowerCrop", CoreItems.ORANGE_DYE, "orange"),
    RED_COLOR(CoreBlocks.RED_FLOWER, "redFlower", "flower_rose", CoreItems.RED_FLOWER_SEED, "redFlowerSeed", CoreBlocks.RED_FLOWER_CROP, "redFlowerCrop", CoreItems.RED_DYE, "red"),
    YELLOW_COLOR(CoreBlocks.YELLOW_FLOWER, "yellowFlower", "flower_dandelion", CoreItems.YELLOW_FLOWER_SEED, "yellowFlowerSeed", CoreBlocks.YELLOW_FLOWER_CROP, "yellowFlowerCrop", CoreItems.YELLOW_DYE, "yellow");

    private Block crop;
    private String cropName;
    private ItemDye dye;
    private String dyeName;
    private Block flower;
    private String flowerBlockName;
    private String flowerBlockTextureName;
    private Item seed;
    private String seedName;

    ColoredContext(Block flower, String flowerBlockName, String flowerBlockTextureName, Item seed, String seedName,
           Block crop, String cropName, ItemDye dye, String dyeName) {

        this.flower = flower;
        this.flowerBlockName = flowerBlockName;
        this.flowerBlockTextureName = flowerBlockTextureName;
        this.seed = seed;
        this.seedName = seedName;
        this.crop = crop;
        this.cropName = cropName;
        this.dye = dye;
        this.dyeName = dyeName;
    }

    public Block getCrop() {
        return crop;
    }

    public String getCropName() {
        return cropName;
    }

    public ItemDye getDye() {
        return dye;
    }

    public String getDyeName() {
        return dyeName;
    }

    public Block getFlower() {
        return flower;
    }

    public String getFlowerBlockName() {
        return flowerBlockName;
    }

    public String getFlowerBlockTextureName() {
        return flowerBlockTextureName;
    }

    public Item getSeed() {
        return seed;
    }

    public String getSeedName() {
        return seedName;
    }

}
