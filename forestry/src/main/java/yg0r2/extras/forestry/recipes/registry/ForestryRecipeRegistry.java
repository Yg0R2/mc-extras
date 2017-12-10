package yg0r2.extras.forestry.recipes.registry;

import forestry.api.apiculture.FlowerManager;
import forestry.api.farming.Farmables;
import forestry.farming.logic.FarmableGenericCrop;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItem;
import yg0r2.extras.api.items.McExtrasItems;
import yg0r2.extras.api.recipes.registry.RecipeRegistry;

public class ForestryRecipeRegistry extends RecipeRegistry {

    @Override
    public void registerRecipes() {
        registerFlower(McExtrasBlocks.COTTON_FLOWER, FlowerManager.FlowerTypeVanilla);
        registerFarmable(McExtrasItems.COTTON_FLOWER_SEED, McExtrasBlocks.COTTON_FLOWER_CROP);

        registerFlower(McExtrasBlocks.GLOW_FLOWER, FlowerManager.FlowerTypeNether);
        registerFarmable(McExtrasItems.GLOW_FLOWER_SEED, McExtrasBlocks.GLOW_FLOWER_CROP);

        registerFlower(McExtrasBlocks.ORANGE_FLOWER, FlowerManager.FlowerTypeVanilla);
        registerFarmable(McExtrasItems.ORANGE_FLOWER_SEED, McExtrasBlocks.ORANGE_FLOWER_CROP);

        registerFlower(Blocks.red_flower, FlowerManager.FlowerTypeVanilla);
        registerFarmable(McExtrasItems.RED_FLOWER_SEED, Blocks.red_flower);

        registerFlower(Blocks.yellow_flower, FlowerManager.FlowerTypeVanilla);
        registerFarmable(McExtrasItems.YELLOW_FLOWER_SEED, Blocks.yellow_flower);
    }

    private void registerFarmable(Item seedItem, Block cropBlock) {
        Farmables.farmables.get("farmWheat").add(new FarmableGenericCrop(new ItemStack(seedItem), cropBlock, 7));
    }

    private void registerFlower(Block flowerBlock, String... flowerTypes) {
        FlowerManager.flowerRegistry.registerAcceptableFlower(flowerBlock, flowerTypes);
        FlowerManager.flowerRegistry.registerPlantableFlower(flowerBlock, 0, 1.0, flowerTypes);
    }

}
