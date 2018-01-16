package yg0r2.extras.core.items;

import yg0r2.extras.api.items.McExtrasItemSeed;
import yg0r2.extras.core.Colors;

public class ItemColoredFlowerSeed extends McExtrasItemSeed {

    public ItemColoredFlowerSeed(Colors colors) {
        super(colors.getCropBlock(), colors.getSoilBlock(), colors.getSeedItemName(), colors.getSeedItemTextureName());
    }

}
