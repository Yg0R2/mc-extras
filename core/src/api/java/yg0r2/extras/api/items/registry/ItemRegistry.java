package yg0r2.extras.api.items.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public abstract class ItemRegistry {

    public abstract void registerItems();

    protected final Item registerItem(Item item) {
        assert item != null;
        assert item.getUnlocalizedName() != null;

        return GameRegistry.registerItem(item, item.getUnlocalizedName(), null);
    }

}
