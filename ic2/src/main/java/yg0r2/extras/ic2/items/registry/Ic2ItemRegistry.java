package yg0r2.extras.ic2.items.registry;

import yg0r2.extras.api.items.registry.ItemRegistry;
import yg0r2.extras.ic2.items.Ic2Items;
import yg0r2.extras.ic2.items.ItemWitherSkull;

public class Ic2ItemRegistry extends ItemRegistry {

    @Override
    public void registerItems() {
        Ic2Items.WITHER_SKULL = new ItemWitherSkull();
    }

}
