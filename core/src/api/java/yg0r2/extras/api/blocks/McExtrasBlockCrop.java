package yg0r2.extras.api.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import yg0r2.extras.api.McExtrasCreativeTabs;
import yg0r2.extras.api.domain.ItemDrop;

import java.util.Arrays;
import java.util.List;

public abstract class McExtrasBlockCrop extends BlockCrops implements IPlantable {

    public McExtrasBlockCrop(String blockName, String textureName) {
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
            for (ItemDrop itemDrop : getActivatedItemDrops()) {
                dropItems(world, x, y, z, itemDrop);
            }

            return world.setBlock(x, y, z, this, 0, 2);
        }

        return false;
    }

    @Override
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int p_149664_5_) {
        int blockMetadata = world.getBlockMetadata(x, y, z);

        if (blockMetadata == 7) {
            dropBlockAsItem(world, x, y, z, new ItemStack(getHarvestedSeedItem(), 1));
        }

        world.setBlockToAir(x, y, z);
    }

    protected List<ItemDrop> getActivatedItemDrops() {
        return Arrays.asList(
            new ItemDrop(1, 2, new ItemStack(getHarvestedItem())),
            new ItemDrop(1, 1, new ItemStack(getHarvestedSeedItem()))
        );
    }

    protected abstract Item getHarvestedItem();

    protected abstract Item getHarvestedSeedItem();

    private void dropItems(World world, int x, int y, int z, ItemDrop itemDrop) {
        int count = itemDrop.getAmount(world.rand);

        for (int i = 0; i <= count; i++) {
            dropBlockAsItem(world, x, y, z, itemDrop.getItemStack());
        }
    }

}
