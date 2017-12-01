package yg0r2.extras.core.recipes;

import yg0r2.extras.core.blocks.CoreBlocks;
import yg0r2.extras.core.items.CoreItems;

public final class CoreRecipeRegistry extends RecipeRegistry {

    @Override
    public void registerRecipes() {
        registerShapelessRecipe(new GlowStoneDustRecipe());
        registerShapelessRecipe(new GlowStoneFlowerSeedRecipe());

        registerShapelessRecipe(new ColoredDyeRecipe(CoreBlocks.ORANGE_FLOWER, CoreItems.ORANGE_DYE));
        registerShapelessRecipe(new ColoredFlowerSeedRecipe(CoreBlocks.ORANGE_FLOWER, CoreItems.ORANGE_FLOWER_SEED));

        registerShapelessRecipe(new ColoredDyeRecipe(CoreBlocks.RED_FLOWER, CoreItems.RED_DYE));
        registerShapelessRecipe(new ColoredFlowerSeedRecipe(CoreBlocks.RED_FLOWER, CoreItems.RED_FLOWER_SEED));

        registerShapelessRecipe(new ColoredDyeRecipe(CoreBlocks.YELLOW_FLOWER, CoreItems.YELLOW_DYE));
        registerShapelessRecipe(new ColoredFlowerSeedRecipe(CoreBlocks.YELLOW_FLOWER, CoreItems.YELLOW_FLOWER_SEED));
    }

}
