package yg0r2.extras.api;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class McExtrasCreativeTabs extends CreativeTabs {

    public static final CreativeTabs MC_EXTRAS_CREATIVE_TAB = new McExtrasCreativeTabs();

    private ItemStack tabIcon;

    public McExtrasCreativeTabs() {
        super("mcExtrasCreativeTab");

        tabIcon = new ItemStack(Items.skull, 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return tabIcon.getItem();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() {
        return tabIcon;
    }


}
