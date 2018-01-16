package yg0r2.extras.core;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItems;

public enum Colors {

    ORANGE("orange", McExtrasBlocks.ORANGE_FLOWER, McExtrasItems.ORANGE_FLOWER_SEED, McExtrasBlocks.ORANGE_FLOWER_CROP, Blocks.farmland, new ItemStack(Items.dye, 8, 14)),
    RED("red", Blocks.red_flower, McExtrasItems.RED_FLOWER_SEED, McExtrasBlocks.RED_FLOWER_CROP, Blocks.farmland, new ItemStack(Items.dye, 8, 1)),
    YELLOW("yellow", Blocks.yellow_flower, McExtrasItems.YELLOW_FLOWER_SEED, McExtrasBlocks.YELLOW_FLOWER_CROP, Blocks.farmland, new ItemStack(Items.dye, 8, 11));

    private Block cropBlock;
    private ItemStack dye;
    private Block flowerBlock;
    private String name;
    private Item seedItem;
    private Block soilBlock;

    Colors(String name, Block flowerBlock, Item seedItem, Block cropBlock, Block soilBlock, ItemStack dye) {
        this.name = name;
        this.flowerBlock = flowerBlock;
        this.seedItem = seedItem;
        this.cropBlock = cropBlock;
        this.soilBlock = soilBlock;
        this.dye = dye;
    }

    public Block getCropBlock() {
        return cropBlock;
    }

    public String getCropBlockName() {
        return name + "FlowerCrop";
    }

    public String getCropBlockTextureName() {
        return "core:" + name + "FlowerCrop";
    }

    public ItemStack getDye() {
        return dye;
    }

    public Block getFlowerBlock() {
        return flowerBlock;
    }

    public String getFlowerBlockName() {
        return name + "Flower";
    }

    public String getFlowerBlockTextureName() {
        return "core:" + name + "Flower";
    }

    public String getSeedItemName() {
        return name + "FlowerSeed";
    }

    public String getSeedItemTextureName() {
        return "core:" + name + "FlowerSeed";
    }

    public Item getSeedItem() {
        return seedItem;
    }

    public Block getSoilBlock() {
        return soilBlock;
    }
}
