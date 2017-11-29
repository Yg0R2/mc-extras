package yg0r2.extras.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

final class BlockGlowFlower extends CoreBlockFlower {

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
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Nether;
    }

}
