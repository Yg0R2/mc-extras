package yg0r2.extras.core.blocks;

import net.minecraft.item.Item;
import yg0r2.extras.api.blocks.McExtrasBlockCrop;
import yg0r2.extras.core.Colors;

public class BlockColoredFLowerCrop extends McExtrasBlockCrop {

    private final Colors colors;

    public BlockColoredFLowerCrop(Colors colors) {
        super(colors.getCropBlockName(), colors.getCropBlockTextureName());

        this.colors = colors;
    }

    @Override
    protected Item getHarvestedItem() {
        return Item.getItemFromBlock(colors.getFlowerBlock());
    }

    @Override
    protected Item getHarvestedSeedItem() {
        return colors.getSeedItem();
    }

}
