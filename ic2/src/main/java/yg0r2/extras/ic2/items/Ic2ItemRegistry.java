package yg0r2.extras.ic2.items;

import yg0r2.extras.core.items.ItemRegistry;

public class Ic2ItemRegistry extends ItemRegistry {

    @Override
    public void registerItems() {
        Ic2Items.WITHER_SKULL = new ItemWitherSkull();
    }

}
