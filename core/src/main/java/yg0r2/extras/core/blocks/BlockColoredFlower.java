package yg0r2.extras.core.blocks;

import net.minecraft.item.ItemStack;
import yg0r2.extras.api.blocks.McExtrasBlockFlower;
import yg0r2.extras.api.domain.ItemDrop;
import yg0r2.extras.core.Colors;

import java.util.Arrays;
import java.util.List;

public class BlockColoredFlower extends McExtrasBlockFlower {

    private Colors colors;

    public BlockColoredFlower(Colors colors) {
        super(colors.getFlowerBlockName(), colors.getFlowerBlockTextureName());

        this.colors = colors;
    }

    @Override
    protected List<ItemDrop> getDestroyedItemDrops() {
        return Arrays.asList(
            new ItemDrop(0, 2, new ItemStack(colors.getFlowerBlock(), 2, 0)),
            new ItemDrop(1, 1, new ItemStack(colors.getSeedItem(), 1, 0))
        );
    }
}
