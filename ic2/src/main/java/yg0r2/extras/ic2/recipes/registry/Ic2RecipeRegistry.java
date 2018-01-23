package yg0r2.extras.ic2.recipes.registry;

import ic2.core.uu.UuIndex;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.recipes.registry.RecipeRegistry;

public final class Ic2RecipeRegistry extends RecipeRegistry {

    private static final UuIndex UU_INDEX_INSTANCE = UuIndex.instance;

    @Override
    public void register() {
        UU_INDEX_INSTANCE.add(new ItemStack(Items.nether_star), 102400); // 1.024 B
        UU_INDEX_INSTANCE.add(new ItemStack(Items.skull, 1, 1), 10240); // 102.4 mB
        UU_INDEX_INSTANCE.add(new ItemStack(Blocks.soul_sand), 1024); // 10.24 mB
    }

}
