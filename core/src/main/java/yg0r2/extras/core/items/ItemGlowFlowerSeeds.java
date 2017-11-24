package yg0r2.extras.core.items;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import yg0r2.extras.core.McExtrasCreativeTabs;
import yg0r2.extras.core.blocks.CoreBlocks;

public final class ItemGlowFlowerSeeds extends ItemSeeds implements IPlantable {

    public ItemGlowFlowerSeeds() {
        super(CoreBlocks.GLOW_FLOWER_CROP, net.minecraft.init.Blocks.farmland);

        setUnlocalizedName("glowFlowerSeed");
        setTextureName("core:glowFlowerSeed");
        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return super.getItemUseAction(p_77661_1_);
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Crop;
    }

}
