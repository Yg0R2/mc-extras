package yg0r2.extras.core.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.recipes.Recipe;
import yg0r2.extras.core.Colors;

public class ColoredDyeRecipe implements Recipe {

    private final Colors colors;

    public ColoredDyeRecipe(Colors colors) {
        this.colors = colors;
    }

    @Override
    public ItemStack getOutput() {
        return colors.getDye();
    }

    @Override
    public Object[] getParams() {
        return new Object[] {
            new ItemStack(colors.getFlowerBlock(), 1, 0),
            new ItemStack(Items.redstone, 1, 0),
            new ItemStack(Items.potionitem, 1, 0)
        };
    }
}
