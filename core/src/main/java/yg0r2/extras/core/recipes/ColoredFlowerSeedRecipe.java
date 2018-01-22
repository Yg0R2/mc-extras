package yg0r2.extras.core.recipes;

import net.minecraft.item.ItemStack;
import yg0r2.extras.api.recipes.Recipe;
import yg0r2.extras.api.Colors;

public class ColoredFlowerSeedRecipe implements Recipe {

    private final Colors colors;

    public ColoredFlowerSeedRecipe(Colors colors) {
        this.colors = colors;
    }

    @Override
    public ItemStack getOutput() {
        return new ItemStack(colors.getSeedItem(), 2, 0);
    }

    @Override
    public Object[] getParams() {
        return new Object[] {
            new ItemStack(colors.getFlowerBlock(), 1, 0),
            new ItemStack(colors.getFlowerBlock(), 1, 0)
        };
    }

}
