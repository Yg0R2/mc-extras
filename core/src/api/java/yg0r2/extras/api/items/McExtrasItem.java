package yg0r2.extras.api.items;

import net.minecraft.item.Item;
import yg0r2.extras.api.McExtrasCreativeTabs;

public abstract class McExtrasItem extends Item {

    public McExtrasItem(String blockName, String textureName) {
        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);

        setTextureName(textureName);
        setUnlocalizedName(blockName);
    }

}
