package yg0r2.extras.core.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.recipes.Recipe;

public class OrangeDyeRecipe implements Recipe {

    @Override
    public ItemStack getOutput() {
        return new ItemStack(Items.dye, 8, 14);
    }

    @Override
    public Object[] getParams() {
        return new Object[] {
            new ItemStack(McExtrasBlocks.ORANGE_FLOWER, 1, 0),
            new ItemStack(Items.redstone, 1, 0),
            new ItemStack(Items.potionitem, 1, 0)
        };
    }

}
