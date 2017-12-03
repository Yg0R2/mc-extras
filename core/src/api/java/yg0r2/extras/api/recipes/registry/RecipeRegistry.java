package yg0r2.extras.api.recipes.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.crafting.IRecipe;
import yg0r2.extras.api.recipes.Recipe;

public abstract class RecipeRegistry {

    public abstract void registerRecipes();

    protected final IRecipe registerShapedRecipe(Recipe recipe) {
        return GameRegistry.addShapedRecipe(recipe.getOutput(), recipe.getParams());
    }

    protected final void registerShapelessRecipe(Recipe recipe) {
        GameRegistry.addShapelessRecipe(recipe.getOutput(), recipe.getParams());
    }

}
