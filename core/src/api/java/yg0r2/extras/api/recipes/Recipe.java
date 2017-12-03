package yg0r2.extras.api.recipes;

import net.minecraft.item.ItemStack;

public interface Recipe {

    ItemStack getOutput();

    Object[] getParams();

}
