package yg0r2.extras.core.recipes;

import net.minecraft.item.ItemStack;

public interface Recipe {

    ItemStack getOutput();

    Object[] getParams();

}
