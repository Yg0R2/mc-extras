package yg0r2.extras.core.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import yg0r2.extras.core.McExtrasCreativeTabs;
import yg0r2.extras.core.blocks.CoreBlocks;

final class ItemCottonSeeds extends CoreItemSeed {

    public ItemCottonSeeds() {
        super(CoreBlocks.COTTON_FLOWER_CROP, Blocks.farmland, "cottonFlowerSeed");
    }

}
