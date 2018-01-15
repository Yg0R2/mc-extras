package yg0r2.extras.api.domain;

import net.minecraft.item.ItemStack;

import java.util.Random;

public class ItemDrop {

    private int maxAmount;
    private int minAmount;
    private ItemStack itemStack;

    public ItemDrop(int minAmount, int maxAmount, ItemStack itemStack) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.itemStack = itemStack;
    }

    public int getAmount(Random rnd) {
        return rnd.nextInt(maxAmount) + minAmount;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

}
