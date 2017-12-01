package yg0r2.extras.core.recipes;

import yg0r2.extras.core.ColoredContext;

public final class CoreRecipeRegistry extends RecipeRegistry {

    @Override
    public void registerRecipes() {
        registerShapelessRecipe(new GlowStoneDustRecipe());
        registerShapelessRecipe(new GlowStoneFlowerSeedRecipe());

        registerShapelessRecipe(new ColoredDyeRecipe(ColoredContext.ORANGE_COLOR));
        registerShapelessRecipe(new ColoredFlowerSeedRecipe(ColoredContext.ORANGE_COLOR));

        registerShapelessRecipe(new ColoredDyeRecipe(ColoredContext.RED_COLOR));
        registerShapelessRecipe(new ColoredFlowerSeedRecipe(ColoredContext.RED_COLOR));

        registerShapelessRecipe(new ColoredDyeRecipe(ColoredContext.YELLOW_COLOR));
        registerShapelessRecipe(new ColoredFlowerSeedRecipe(ColoredContext.YELLOW_COLOR));
    }

}
