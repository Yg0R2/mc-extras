package yg0r2.extras.core.blocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import yg0r2.extras.api.blocks.McExtrasBlockCrop;
import yg0r2.extras.api.items.McExtrasItems;

public final class BlockYellowFlowerCrop extends McExtrasBlockCrop {

    public BlockYellowFlowerCrop() {
        super("yellowFlowerCrop", "core:yellowFlowerCrop");
    }

    @Override
    protected Item getHarvestedItem() {
        return Item.getItemFromBlock(Blocks.yellow_flower);
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return McExtrasItems.YELLOW_FLOWER_SEED;
    }

}
