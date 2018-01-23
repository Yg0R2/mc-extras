package yg0r2.extras.core.recipes.registry;

import yg0r2.extras.api.recipes.registry.RecipeRegistry;
import yg0r2.extras.api.Colors;
import yg0r2.extras.core.recipes.*;

public final class CoreRecipeRegistry extends RecipeRegistry {

    @Override
    public void register() {
        registerShapelessRecipe(new GlowStoneDustRecipe());
        registerShapelessRecipe(new GlowStoneFlowerSeedRecipe());

        for (Colors color : Colors.values()) {
            registerShapelessRecipe(new ColoredDyeRecipe(color));
            registerShapelessRecipe(new ColoredFlowerSeedRecipe(color));
        }
    }

}
