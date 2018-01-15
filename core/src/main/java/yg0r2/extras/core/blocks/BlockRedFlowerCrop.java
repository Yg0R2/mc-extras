package yg0r2.extras.core.blocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import yg0r2.extras.api.blocks.McExtrasBlockCrop;
import yg0r2.extras.api.items.McExtrasItems;

public final class BlockRedFlowerCrop extends McExtrasBlockCrop {

    public BlockRedFlowerCrop() {
        super("redFlowerCrop", "core:redFlowerCrop");
    }

    @Override
    protected Item getHarvestedItem() {
        return Item.getItemFromBlock(Blocks.red_flower);
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return McExtrasItems.RED_FLOWER_SEED;
    }

}
