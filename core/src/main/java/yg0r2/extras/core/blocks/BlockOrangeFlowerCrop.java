package yg0r2.extras.core.blocks;

import net.minecraft.item.Item;
import yg0r2.extras.api.blocks.McExtrasBlockCrop;
import yg0r2.extras.api.blocks.McExtrasBlocks;
import yg0r2.extras.api.items.McExtrasItems;

public final class BlockOrangeFlowerCrop extends McExtrasBlockCrop {

    public BlockOrangeFlowerCrop() {
        super("orangeFlowerCrop", "core:orangeFlowerCrop");
    }

    @Override
    protected Item getHarvestedItem() {
        return Item.getItemFromBlock(McExtrasBlocks.ORANGE_FLOWER);
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return McExtrasItems.ORANGE_FLOWER_SEED;
    }

}
