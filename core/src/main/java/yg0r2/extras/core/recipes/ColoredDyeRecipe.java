package yg0r2.extras.core.recipes;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

public class ColoredDyeRecipe implements Recipe {

    private ItemDye dye;
    private Block flower;

    public ColoredDyeRecipe(Block flower, ItemDye dye) {
        this.dye = dye;
        this.flower = flower;
    }

    @Override
    public ItemStack getOutput() {
        return new ItemStack(dye, 8, 0);
    }

    @Override
    public Object[] getParams() {
        return new Object[] {
            new ItemStack(flower, 1, 0),
            new ItemStack(Items.redstone, 1, 0),
            new ItemStack(Items.potionitem, 1, 0)
        };
    }

}
