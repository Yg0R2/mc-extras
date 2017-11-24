package yg0r2.extras.core.recipies;

import net.minecraft.item.ItemStack;
import yg0r2.extras.core.blocks.CoreBlocks;
import yg0r2.extras.core.items.CoreItems;
import yg0r2.extras.core.recipes.RecipeRegistry;

public final class CoreRecipeRegistry extends RecipeRegistry {

    @Override
    public void registerRecipes() {
        registerShapelessRecipe(getGlowFlowerSeedItemStack(), getGlowFlowerSeedParams());
        registerShapelessRecipe(getGlowStoneItemStack(), getGlowStoneParams());
    }

    private ItemStack getGlowFlowerSeedItemStack() {
        return new ItemStack(CoreItems.GLOW_FLOWER_SEED, 2, 0);
    }

    private Object[] getGlowFlowerSeedParams() {
        return  new Object[] {
            new ItemStack(CoreBlocks.GLOW_FLOWER, 1, 0),
            new ItemStack(CoreBlocks.GLOW_FLOWER, 1, 0)
        };
    }

    private ItemStack getGlowStoneItemStack() {
        return new ItemStack(net.minecraft.init.Items.glowstone_dust, 2, 0);
    }

    private Object[] getGlowStoneParams() {
        return new Object[] {
            new ItemStack(CoreBlocks.GLOW_FLOWER, 1, 0),
            new ItemStack(CoreBlocks.GLOW_FLOWER, 1, 0),
            new ItemStack(CoreBlocks.GLOW_FLOWER, 1, 0)
        };
    }

}
