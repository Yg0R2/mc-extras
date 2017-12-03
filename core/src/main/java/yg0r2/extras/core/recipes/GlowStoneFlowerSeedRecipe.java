package yg0r2.extras.core.recipes;

import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItems;
import yg0r2.extras.api.recipes.Recipe;

public final class GlowStoneFlowerSeedRecipe implements Recipe {

    @Override
    public ItemStack getOutput() {
        return new ItemStack(McExtrasItems.GLOW_FLOWER_SEED, 2, 0);
    }

    @Override
    public Object[] getParams() {
        return  new Object[] {
            new ItemStack(McExtrasBlocks.GLOW_FLOWER, 1, 0),
            new ItemStack(McExtrasBlocks.GLOW_FLOWER, 1, 0)
        };
    }

}
