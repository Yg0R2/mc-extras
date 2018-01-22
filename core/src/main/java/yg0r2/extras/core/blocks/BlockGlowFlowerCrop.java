package yg0r2.extras.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import yg0r2.extras.api.blocks.McExtrasBlockCrop;
import yg0r2.extras.api.items.McExtrasItems;

public final class BlockGlowFlowerCrop extends McExtrasBlockCrop {

    public BlockGlowFlowerCrop() {
        super("glowFlowerCrop", "core:glowFlowerCrop/glowFlowerCrop");

        setLightLevel(1.0F);
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Nether;
    }

    @Override
    protected boolean canPlaceBlockOn(Block block) {
        return (block == Blocks.soul_sand) || (block == Blocks.farmland);
    }

    @Override
    protected Item getHarvestedItem() {
        return Items.glowstone_dust;
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return McExtrasItems.GLOW_FLOWER_SEED;
    }

}
