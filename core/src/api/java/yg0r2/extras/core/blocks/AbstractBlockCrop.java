package yg0r2.extras.core.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import yg0r2.extras.core.McExtrasCreativeTabs;

import java.util.List;
import java.util.Random;

public abstract class AbstractBlockCrop extends BlockCrops implements IPlantable {

    public AbstractBlockCrop(String blockName, String textureName) {
        super();

        setBlockName(blockName);
        setBlockTextureName(textureName);

        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);
    }

    @Override
    protected Item func_149865_P() {
        return getHarvestedItem();
    }

    @Override
    protected Item func_149866_i() {
        return getHarvestedSeedItem();
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Crop;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        int blockMetadata = world.getBlockMetadata(x, y, z);

        if (blockMetadata == 7) {
            dropItems(world, x, y, z);
            world.setBlock(x, y, z, this, 0, 2);
        }

        return false;
    }

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(2);
    }

    protected abstract List<ItemStack> dropOnActivated();

    protected abstract Item getHarvestedItem();

    protected abstract Item getHarvestedSeedItem();

    private void dropItems(World world, int x, int y, int z) {
        for (ItemStack itemStackDrop : dropOnActivated()) {
            dropItem(world, x, y, z, itemStackDrop);
        }
    }

    private void dropItem(World world, int x, int y, int z, ItemStack itemStack) {
        int count = quantityDropped(world.rand);

        for (int i = 0; i <= count; i++) {
            dropBlockAsItem(world, x, y, z, itemStack);
        }
    }

}
