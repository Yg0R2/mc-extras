package yg0r2.extras.core.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.items.McExtrasItems;
import yg0r2.extras.api.recipes.Recipe;

public class RedFlowerSeedRecipe implements Recipe {

    @Override
    public ItemStack getOutput() {
        return new ItemStack(McExtrasItems.RED_FLOWER_SEED, 2, 0);
    }

    @Override
    public Object[] getParams() {
        return new Object[] {
            new ItemStack(Blocks.red_flower, 1, 0),
            new ItemStack(Blocks.red_flower, 1, 0)
        };
    }

}
