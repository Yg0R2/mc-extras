package yg0r2.extras.core.recipes.registry;

import yg0r2.extras.api.recipes.registry.RecipeRegistry;
import yg0r2.extras.core.Colors;
import yg0r2.extras.core.recipes.*;

public final class CoreRecipeRegistry extends RecipeRegistry {

    @Override
    public void registerRecipes() {
        registerShapelessRecipe(new GlowStoneDustRecipe());
        registerShapelessRecipe(new GlowStoneFlowerSeedRecipe());

        registerShapelessRecipe(new ColoredDyeRecipe(Colors.ORANGE));
        registerShapelessRecipe(new ColoredFlowerSeedRecipe(Colors.ORANGE));

        registerShapelessRecipe(new ColoredDyeRecipe(Colors.RED));
        registerShapelessRecipe(new ColoredFlowerSeedRecipe(Colors.RED));

        registerShapelessRecipe(new ColoredDyeRecipe(Colors.YELLOW));
        registerShapelessRecipe(new ColoredFlowerSeedRecipe(Colors.YELLOW));
    }

}
