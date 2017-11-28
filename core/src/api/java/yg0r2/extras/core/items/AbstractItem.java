package yg0r2.extras.core.items;

import net.minecraft.item.Item;
import yg0r2.extras.core.McExtrasCreativeTabs;

public abstract class AbstractItem extends Item {

    public AbstractItem(String blockName, String textureName) {
        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);

        setTextureName(textureName);
        setUnlocalizedName(blockName);
    }

}
