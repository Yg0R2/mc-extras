package yg0r2.extras.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import yg0r2.extras.api.blocks.McExtrasBlockFlower;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.domain.ItemDrop;

import java.util.Arrays;
import java.util.List;

public final class BlockGlowFlower extends McExtrasBlockFlower {

    public BlockGlowFlower() {
        super("glowFlower", "core:glowFlower");

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
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Nether;
    }

    @Override
    protected List<ItemDrop> getDestroyedItemDrops() {
        return Arrays.asList(
            new ItemDrop(1, 1, new ItemStack(McExtrasBlocks.GLOW_FLOWER))
        );
    }

}
