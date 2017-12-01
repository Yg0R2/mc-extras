package yg0r2.extras.core.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import yg0r2.extras.core.ColoredContext;

public class ColoredDyeRecipe implements Recipe {

    private ColoredContext coloredContext;

    public ColoredDyeRecipe(ColoredContext coloredContext) {
        this.coloredContext = coloredContext;
    }

    @Override
    public ItemStack getOutput() {
        return new ItemStack(coloredContext.getDye(), 8, 0);
    }

    @Override
    public Object[] getParams() {
        return new Object[] {
            new ItemStack(coloredContext.getFlower(), 1, 0),
            new ItemStack(Items.redstone, 1, 0),
            new ItemStack(Items.potionitem, 1, 0)
        };
    }

}
