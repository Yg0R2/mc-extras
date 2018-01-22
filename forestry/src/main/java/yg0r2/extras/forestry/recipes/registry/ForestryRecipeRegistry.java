package yg0r2.extras.forestry.recipes.registry;

import forestry.api.apiculture.FlowerManager;
import forestry.api.farming.Farmables;
import forestry.farming.logic.FarmableGenericCrop;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.Colors;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItems;
import yg0r2.extras.api.recipes.registry.RecipeRegistry;

public class ForestryRecipeRegistry extends RecipeRegistry {

    @Override
    public void registerRecipes() {
        registerFlower(McExtrasBlocks.COTTON_FLOWER, FlowerManager.FlowerTypeVanilla);
        registerFarmable(McExtrasItems.COTTON_FLOWER_SEED, McExtrasBlocks.COTTON_FLOWER_CROP);

        registerFlower(McExtrasBlocks.GLOW_FLOWER, FlowerManager.FlowerTypeNether);
        registerFarmable(McExtrasItems.GLOW_FLOWER_SEED, McExtrasBlocks.GLOW_FLOWER_CROP);

        for (Colors colors : Colors.values()) {
            if ((colors.getFlowerBlock() == null) || (colors.getSeedItem() == null) || (colors.getCropBlock() == null)) {
                continue;
            }

            registerFlower(colors.getFlowerBlock(), FlowerManager.FlowerTypeVanilla);
            registerFarmable(colors.getSeedItem(), colors.getCropBlock());
        }
    }

    private void registerFarmable(Item seedItem, Block cropBlock) {
        Farmables.farmables.get("farmWheat").add(new FarmableGenericCrop(new ItemStack(seedItem), cropBlock, 7));
    }

    private void registerFlower(Block flowerBlock, String... flowerTypes) {
        FlowerManager.flowerRegistry.registerAcceptableFlower(flowerBlock, flowerTypes);
        FlowerManager.flowerRegistry.registerPlantableFlower(flowerBlock, 0, 1.0, flowerTypes);
    }

}
