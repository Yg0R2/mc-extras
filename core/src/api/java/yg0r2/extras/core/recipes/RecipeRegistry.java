package yg0r2.extras.core.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public abstract class RecipeRegistry {

    public abstract void registerRecipes();

    protected final IRecipe registerShapedRecipe(ItemStack output, Object... params) {
        return GameRegistry.addShapedRecipe(output, params);
    }

    protected final void registerShapelessRecipe(ItemStack output, Object... params) {
        GameRegistry.addShapelessRecipe(output, params);
    }

}
