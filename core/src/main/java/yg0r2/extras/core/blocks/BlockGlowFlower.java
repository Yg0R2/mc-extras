package yg0r2.extras.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import yg0r2.extras.core.items.CoreItems;

import java.util.Arrays;
import java.util.List;

public final class BlockGlowFlower extends CoreBlockFlower {

    public BlockGlowFlower() {
        super("glowFlower");

        float delta = 0.2F;
        setBlockBounds(0.5F - delta, 0.0F, 0.5F - delta, 0.5F + delta, delta * 3.0F, 0.5F + delta);
        setStepSound(Block.soundTypeGrass);

        setLightLevel(1.0F);
    }

    @Override
    protected boolean canPlaceBlockOn(Block block) {
        return (block == Blocks.soul_sand) || (block == Blocks.netherrack);
    }

    @Override
    protected List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(CoreItems.GLOW_FLOWER_SEED, 1, 0),
            new ItemStack(Items.glowstone_dust, 1, 0)
        );
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Nether;
    }

}
