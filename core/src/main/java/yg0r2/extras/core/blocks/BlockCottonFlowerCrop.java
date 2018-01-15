package yg0r2.extras.core.blocks;

import net.minecraft.item.Item;
import yg0r2.extras.api.blocks.McExtrasBlockCrop;
import yg0r2.extras.api.items.McExtrasItems;

public final class BlockCottonFlowerCrop extends McExtrasBlockCrop {

    public BlockCottonFlowerCrop() {
        super("cottonFlowerCrop", "core:cottonFlowerCrop");
    }

    @Override
    protected Item getHarvestedItem() {
        return McExtrasItems.COTTON;
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return McExtrasItems.COTTON_FLOWER_SEED;
    }

}
