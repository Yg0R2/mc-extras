package yg0r2.extras.nether.recipes;

import net.minecraft.item.ItemStack;
import yg0r2.extras.core.recipes.RecipeRegistry;
import yg0r2.extras.nether.blocks.NetherBlocks;
import yg0r2.extras.nether.items.NetherItems;

public final class NetherRecipeRegistry extends RecipeRegistry {

    @Override
    public void registerRecipes() {
        registerShapelessRecipe(getGlowFlowerSeedItemStack(), getGlowFlowerSeedParams());
        registerShapelessRecipe(getGlowStoneItemStack(), getGlowStoneParams());
    }

    private ItemStack getGlowFlowerSeedItemStack() {
        return new ItemStack(NetherItems.GLOW_FLOWER_SEED, 2, 0);
    }

    private Object[] getGlowFlowerSeedParams() {
        return  new Object[] {
            new ItemStack(NetherBlocks.GLOW_FLOWER, 1, 0),
            new ItemStack(NetherBlocks.GLOW_FLOWER, 1, 0)
        };
    }

    private ItemStack getGlowStoneItemStack() {
        return new ItemStack(net.minecraft.init.Items.glowstone_dust, 2, 0);
    }

    private Object[] getGlowStoneParams() {
        return new Object[] {
            new ItemStack(NetherBlocks.GLOW_FLOWER, 1, 0),
            new ItemStack(NetherBlocks.GLOW_FLOWER, 1, 0),
            new ItemStack(NetherBlocks.GLOW_FLOWER, 1, 0)
        };
    }

}
