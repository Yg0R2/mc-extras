package yg0r2.extras.api.blocks;

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
import yg0r2.extras.api.McExtrasCreativeTabs;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class McExtrasBlockFlower extends BlockFlower implements IPlantable {

    private IIcon icon;

    public McExtrasBlockFlower(String blockName, String textureName) {
        super(0);

        setBlockName(blockName);
        setBlockTextureName(textureName);

        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);

        setTickRandomly(true);
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
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        int blockMetadata = world.getBlockMetadata(x, y, z);

        if (blockMetadata == 0) {
            dropItems(world, x, y, z);
            world.setBlockToAir(x, y, z);
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

    protected List<ItemStack> dropOnActivated() {
        return Arrays.asList(new ItemStack(this, 1, 0));
    }

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
