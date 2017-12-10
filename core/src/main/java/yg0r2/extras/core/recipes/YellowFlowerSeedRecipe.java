package yg0r2.extras.core.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.items.McExtrasItems;
import yg0r2.extras.api.recipes.Recipe;

public class YellowFlowerSeedRecipe implements Recipe {

    @Override
    public ItemStack getOutput() {
        return new ItemStack(McExtrasItems.YELLOW_FLOWER_SEED, 2, 0);
    }

    @Override
    public Object[] getParams() {
        return new Object[] {
            new ItemStack(Blocks.yellow_flower, 1, 0),
            new ItemStack(Blocks.yellow_flower, 1, 0)
        };
    }

}
