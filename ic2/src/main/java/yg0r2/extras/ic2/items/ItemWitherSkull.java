package yg0r2.extras.ic2.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * This is only a wrapper for Wither Skull Item.
 */
public final class ItemWitherSkull {

    public static ItemStack getItemStack() {
        int witherSkullDamage = getDamage();

        List<ItemStack> skullSubItemStacks = getSkullSubItemStacks();

        for (int i = 0; i < skullSubItemStacks.size(); i++) {
            ItemStack subItemStack = skullSubItemStacks.get(i);

            if (subItemStack.getItemDamage() == witherSkullDamage) {
                return subItemStack;
            }
        }

        return new ItemStack(Items.skull);
    }

    private static int getDamage() {
        for (int i = 0; i < ItemSkull.field_94587_a.length; i++) {
            if ("wither".equals(ItemSkull.field_94587_a[i])) {
                return i;
            }
        }

        return 0;
    }

    private static List<ItemStack> getSkullSubItemStacks() {
        ItemSkull skull = (ItemSkull) Items.skull;

        List<ItemStack> subItemStacks = new ArrayList<>();
        skull.getSubItems(Items.skull, skull.getCreativeTab(), subItemStacks);

        return subItemStacks;
    }

    ItemWitherSkull() {
    }

}
