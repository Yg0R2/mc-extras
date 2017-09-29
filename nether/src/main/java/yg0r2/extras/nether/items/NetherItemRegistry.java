package yg0r2.extras.nether.items;

import yg0r2.extras.core.items.ItemRegistry;

public final class NetherItemRegistry extends ItemRegistry {

    @Override
    public void registerItems() {
        NetherItems.GLOW_FLOWER_SEED = registerItem(new ItemGlowFlowerSeeds());
    }

}
