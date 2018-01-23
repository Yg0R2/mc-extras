package yg0r2.extras.api.items.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import yg0r2.extras.api.registry.Registry;

public abstract class ItemRegistry implements Registry {

    protected final Item registerItem(Item item) {
        assert item != null;
        assert item.getUnlocalizedName() != null;

        return GameRegistry.registerItem(item, item.getUnlocalizedName(), null);
    }

}
