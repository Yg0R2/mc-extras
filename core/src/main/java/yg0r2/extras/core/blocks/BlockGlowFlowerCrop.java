package yg0r2.extras.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import yg0r2.extras.api.blocks.McExtrasBlockCrop;
import yg0r2.extras.api.items.McExtrasItems;

import java.util.Arrays;
import java.util.List;

public final class BlockGlowFlowerCrop extends McExtrasBlockCrop {

    public BlockGlowFlowerCrop() {
        super("glowFlowerCrop", "core:glowFlowerCrop");

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
    protected List<ItemStack> dropOnActivated() {
        return Arrays.asList(
            new ItemStack(McExtrasItems.GLOW_FLOWER_SEED, 1, 0),
            new ItemStack(Items.glowstone_dust, 1, 0)
        );
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
