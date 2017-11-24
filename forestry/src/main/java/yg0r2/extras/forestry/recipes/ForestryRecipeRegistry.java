package yg0r2.extras.forestry.recipes;

import forestry.api.apiculture.FlowerManager;
import forestry.api.farming.Farmables;
import forestry.farming.logic.FarmableGenericCrop;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.core.blocks.CoreBlocks;
import yg0r2.extras.core.items.CoreItems;
import yg0r2.extras.core.recipes.RecipeRegistry;

public class ForestryRecipeRegistry extends RecipeRegistry {

    @Override
    public void registerRecipes() {
        registerFlower(CoreBlocks.COTTON_FLOWER, FlowerManager.FlowerTypeVanilla);
        registerFarmable(CoreItems.COTTON_FLOWER_SEED, CoreBlocks.COTTON_FLOWER_CROP);

        registerFlower(CoreBlocks.GLOW_FLOWER, FlowerManager.FlowerTypeNether);
        registerFarmable(CoreItems.GLOW_FLOWER_SEED, CoreBlocks.GLOW_FLOWER_CROP);
    }

    private void registerFarmable(Item seedItem, Block cropBlock) {
        Farmables.farmables.get("farmWheat").add(new FarmableGenericCrop(new ItemStack(seedItem), cropBlock, 7));
    }

    private void registerFlower(Block flowerBlock, String... flowerTypes) {
        FlowerManager.flowerRegistry.registerAcceptableFlower(flowerBlock, flowerTypes);
        FlowerManager.flowerRegistry.registerPlantableFlower(flowerBlock, 0, 1.0, flowerTypes);
    }

}
