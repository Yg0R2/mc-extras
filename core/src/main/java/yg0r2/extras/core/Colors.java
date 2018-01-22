package yg0r2.extras.core;

import static yg0r2.extras.api.blocks.McExtrasBlocks.*;
import static yg0r2.extras.api.items.McExtrasItems.*;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public enum Colors {

    CYAN("cyan", CYAN_FLOWER, CYAN_FLOWER_SEED, CYAN_FLOWER_CROP, 6),
    GREEN("green", Blocks.cactus, null, null, 2), // Only register green dye
    MAGENTA("magenta", MAGENTA_FLOWER, MAGENTA_FLOWER_SEED, MAGENTA_FLOWER_CROP, 13),
    ORANGE("orange", ORANGE_FLOWER, ORANGE_FLOWER_SEED, ORANGE_FLOWER_CROP, 14),
    PURPLE("purple", PURPLE_FLOWER, PURPLE_FLOWER_SEED, PURPLE_FLOWER_CROP, 5),
    RED("red", Blocks.red_flower, RED_FLOWER_SEED, RED_FLOWER_CROP, 1),
    WHITE("white", WHITE_FLOWER, WHITE_FLOWER_SEED, WHITE_FLOWER_CROP, 15),
    YELLOW("yellow", Blocks.yellow_flower, YELLOW_FLOWER_SEED, YELLOW_FLOWER_CROP, 11);

    private Block cropBlock;
    private ItemStack dye;
    private Block flowerBlock;
    private String name;
    private Item seedItem;
    private Block soilBlock;

    Colors(String name, Block flowerBlock, Item seedItem, Block cropBlock, int dyeIndex) {
        this.name = name;
        this.flowerBlock = flowerBlock;
        this.seedItem = seedItem;
        this.cropBlock = cropBlock;
        this.soilBlock = Blocks.farmland;
        this.dye = new ItemStack(Items.dye, 8, dyeIndex);
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
