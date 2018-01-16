package yg0r2.extras.api.blocks;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import yg0r2.extras.api.McExtrasCreativeTabs;
import yg0r2.extras.api.domain.ItemDrop;

import java.util.List;

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
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int p_149664_5_) {
        int blockMetadata = world.getBlockMetadata(x, y, z);

        if (blockMetadata == 0) {
            for (ItemDrop itemDrop : getDestroyedItemDrops()) {
                dropItems(world, x, y, z, itemDrop);
            }
        }

        world.setBlockToAir(x, y, z);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        icon = iconRegister.registerIcon(getTextureName());
    }

    protected abstract List<ItemDrop> getDestroyedItemDrops();

    private void dropItems(World world, int x, int y, int z, ItemDrop itemDrop) {
        int count = itemDrop.getAmount(world.rand);

        for (int i = 0; i <= count; i++) {
            dropBlockAsItem(world, x, y, z, itemDrop.getItemStack());
        }
    }

}
