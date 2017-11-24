package yg0r2.extras.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import yg0r2.extras.core.McExtrasCreativeTabs;

import java.util.List;
import java.util.Random;

public final class BlockGlowFlower extends BlockFlower implements IPlantable {

    private IIcon icon;

    public BlockGlowFlower() {
        super(0);

        setBlockName("glowFlower");
        setBlockTextureName("core:glowFlower");
        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);

        float delta = 0.2F;
        setBlockBounds(0.5F - delta, 0.0F, 0.5F - delta, 0.5F + delta, delta * 3.0F, 0.5F + delta);
        setStepSound(Block.soundTypeGrass);

        setLightLevel(1.0F);
        setTickRandomly(true);
    }

    @Override
    protected boolean canPlaceBlockOn(Block block) {
        return (block == Blocks.soul_sand) || (block == Blocks.netherrack);
    }

    @Override
    public IIcon getIcon(int p_getIcon_1_, int p_getIcon_2_) {
        return icon;
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Nether;
    }

    @Override
    protected String getTextureName() {
        return super.getTextureName();
    }

    @Override
    public boolean onBlockActivated(World world, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        int blockMetadata = world.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_);

        if (blockMetadata == 0) {
            dropBlockAsItem(world, p_149727_2_, p_149727_3_, p_149727_4_, new ItemStack(this, 1, 0));
            world.setBlockToAir(p_149727_2_, p_149727_3_, p_149727_4_);
        }

        return false;
    }

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(1) + 1;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        icon = iconRegister.registerIcon(getTextureName());
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List subBlocks) {
        subBlocks.add(new ItemStack(item, 1, 0));
    }

}
