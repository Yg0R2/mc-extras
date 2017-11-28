package yg0r2.extras.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import yg0r2.extras.core.items.CoreItems;

import java.util.Random;

public final class BlockGlowFlowerCrop extends CoreBlockCrop {

    public BlockGlowFlowerCrop() {
        super("glowFlowerCrop");

        setLightLevel(1.0F);
    }

    @Override
    protected boolean canPlaceBlockOn(Block block) {
        return (block == Blocks.soul_sand) || (block == Blocks.farmland);
    }

    @Override
    protected Item dropItem() {
        return Item.getItemFromBlock(CoreBlocks.GLOW_FLOWER);
    }

    @Override
    protected Item dropSeedItem() {
        return CoreItems.GLOW_FLOWER_SEED;
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Nether;
    }

}
