package yg0r2.extras.api.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import yg0r2.extras.api.McExtrasCreativeTabs;

public abstract class McExtrasItemSeed extends ItemSeeds implements IPlantable {

    public McExtrasItemSeed(Block flowerCropBlock, Block soilBlock, String blockName, String textureName) {
        super(flowerCropBlock, soilBlock);

        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);

        setTextureName(textureName);
        setUnlocalizedName(blockName);
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Crop;
    }

}
