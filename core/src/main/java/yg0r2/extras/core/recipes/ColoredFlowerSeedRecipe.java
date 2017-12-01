package yg0r2.extras.core.recipes;

import net.minecraft.item.ItemStack;
import yg0r2.extras.core.ColoredContext;

final class ColoredFlowerSeedRecipe implements Recipe {

    private ColoredContext coloredContext;

    public ColoredFlowerSeedRecipe(ColoredContext coloredContext) {
        this.coloredContext = coloredContext;
    }

    @Override
    public ItemStack getOutput() {
        return new ItemStack(coloredContext.getSeed(), 2, 0);
    }

    @Override
    public Object[] getParams() {
        return  new Object[] {
            new ItemStack(coloredContext.getFlower(), 1, 0),
            new ItemStack(coloredContext.getFlower(), 1, 0)
        };
    }

}
