package yg0r2.extras.core.recipes.registry;

import yg0r2.extras.api.recipes.registry.RecipeRegistry;
import yg0r2.extras.core.recipes.*;

public final class CoreRecipeRegistry extends RecipeRegistry {

    @Override
    public void registerRecipes() {
        registerShapelessRecipe(new GlowStoneDustRecipe());
        registerShapelessRecipe(new GlowStoneFlowerSeedRecipe());

        registerShapelessRecipe(new OrangeDyeRecipe());
        registerShapelessRecipe(new OrangeFlowerSeedRecipe());

        registerShapelessRecipe(new RedDyeRecipe());
        registerShapelessRecipe(new RedFlowerSeedRecipe());

        registerShapelessRecipe(new YellowDyeRecipe());
        registerShapelessRecipe(new YellowFlowerSeedRecipe());
    }

}
