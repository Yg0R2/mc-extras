package yg0r2.extras.core.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

final class ColoredFlowerSeedRecipe implements Recipe {

    private Block flower;
    private Item seed;

    public ColoredFlowerSeedRecipe(Block flower, Item seed) {
        this.flower = flower;
        this.seed = seed;
    }

    @Override
    public ItemStack getOutput() {
        return new ItemStack(seed, 2, 0);
    }

    @Override
    public Object[] getParams() {
        return  new Object[] {
            new ItemStack(flower, 1, 0),
            new ItemStack(flower, 1, 0)
        };
    }

}
