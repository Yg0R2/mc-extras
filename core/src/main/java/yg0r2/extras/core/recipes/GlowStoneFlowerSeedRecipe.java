package yg0r2.extras.core.recipes;

import net.minecraft.item.ItemStack;
import yg0r2.extras.core.blocks.CoreBlocks;
import yg0r2.extras.core.items.CoreItems;

final class GlowStoneFlowerSeedRecipe implements Recipe {

    @Override
    public ItemStack getOutput() {
        return new ItemStack(CoreItems.GLOW_FLOWER_SEED, 2, 0);
    }

    @Override
    public Object[] getParams() {
        return  new Object[] {
            new ItemStack(CoreBlocks.GLOW_FLOWER, 1, 0),
            new ItemStack(CoreBlocks.GLOW_FLOWER, 1, 0)
        };
    }

}
