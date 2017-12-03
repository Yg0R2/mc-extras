package yg0r2.extras.core.recipes.registry;

import yg0r2.extras.api.recipes.registry.RecipeRegistry;
import yg0r2.extras.core.recipes.GlowStoneDustRecipe;
import yg0r2.extras.core.recipes.GlowStoneFlowerSeedRecipe;

public final class CoreRecipeRegistry extends RecipeRegistry {

    @Override
    public void registerRecipes() {
        registerShapelessRecipe(new GlowStoneDustRecipe());
        registerShapelessRecipe(new GlowStoneFlowerSeedRecipe());
    }

}
