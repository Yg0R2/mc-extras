package yg0r2.extras.core.blocks;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import yg0r2.extras.core.McExtrasCreativeTabs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractBlockFlower extends BlockFlower implements IPlantable {

    private IIcon icon;

    public AbstractBlockFlower(String blockName, String textureName) {
        super(0);

        setBlockName(blockName);
        setBlockTextureName(textureName);

        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);

        setTickRandomly(true);
    }

    protected abstract List<ItemStack> dropOnActivated();

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        return (ArrayList) dropOnActivated();
    }

    @Override
    public IIcon getIcon(int p_getIcon_1_, int p_getIcon_2_) {
        return icon;
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Plains;
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List subBlocks) {
        subBlocks.add(new ItemStack(item, 1, 0));
    }

    @Override
    public boolean onBlockActivated(World world, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        int blockMetadata = world.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_);

        if (blockMetadata == 0) {
            for (ItemStack itemStackDrop : dropOnActivated()) {
                dropBlockAsItem(world, p_149727_2_, p_149727_3_, p_149727_4_, itemStackDrop);
            }

            world.setBlockToAir(p_149727_2_, p_149727_3_, p_149727_4_);
        }

        return false;
    }

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(2) + 1;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        icon = iconRegister.registerIcon(getTextureName());
    }

}
