package yg0r2.extras.core.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import yg0r2.extras.core.McExtrasCreativeTabs;

final class ItemColoredDye extends ItemDye {

    private int damage;
    private IIcon icon;

    public ItemColoredDye(String dyeName) {
        super();

        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);

        damage = getDamageFromName(dyeName);
    }

    @Override
    public int getDamage(ItemStack stack) {
        return damage;
    }

    @Override
    public IIcon getIconFromDamage(int p_77617_1_) {
        return icon;
    }

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        icon = iconRegister.registerIcon(getIconString());
    }

    private int getDamageFromName(String dyeName) {
        for (int i = 0; i < net.minecraft.item.ItemDye.field_150923_a.length; i++) {
            if (net.minecraft.item.ItemDye.field_150923_a[i].equals(dyeName)) {
                return i;
            }
        }

        return 0;
    }

}
