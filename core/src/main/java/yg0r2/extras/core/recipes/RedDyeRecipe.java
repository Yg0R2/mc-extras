package yg0r2.extras.core.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.recipes.Recipe;

public class RedDyeRecipe implements Recipe {

    @Override
    public ItemStack getOutput() {
        return new ItemStack(Items.dye, 8, 1);
    }

    @Override
    public Object[] getParams() {
        return new Object[] {
            new ItemStack(Blocks.red_flower, 1, 0),
            new ItemStack(Items.redstone, 1, 0),
            new ItemStack(Items.potionitem, 1, 0)
        };
    }

}
