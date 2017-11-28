package yg0r2.extras.core.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import yg0r2.extras.core.McExtrasCreativeTabs;

import java.util.Random;

public abstract class AbstractBlockCrop extends BlockCrops implements IPlantable {

    public AbstractBlockCrop(String blockName, String textureName) {
        super();

        setBlockName(blockName);
        setBlockTextureName(textureName);

        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);
    }

    protected abstract Item dropItem();

    protected abstract Item dropSeedItem();

    @Override
    protected Item func_149865_P() {
        return dropItem();
    }

    @Override
    protected Item func_149866_i() {
        return dropSeedItem();
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Crop;
    }

    @Override
    public boolean onBlockActivated(World world, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        int blockMetadata = world.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_);

        if (blockMetadata == 7) {
            dropBlockAsItem(world, p_149727_2_, p_149727_3_, p_149727_4_, blockMetadata, 0);
            world.setBlock(p_149727_2_, p_149727_3_, p_149727_4_, this, 0, 2);
        }

        return false;
    }

    /**
     * Do not drop item.
     *
     * @param random
     * @return
     */
    @Override
    public int quantityDropped(Random random) {
        return 0;
    }

}
