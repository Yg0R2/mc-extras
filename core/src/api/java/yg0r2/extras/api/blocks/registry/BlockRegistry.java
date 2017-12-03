package yg0r2.extras.api.blocks.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public abstract class BlockRegistry {

    public abstract void registerBlocks();

    protected final Block registerBlock(Block block) {
        assert block != null;
        assert block.getUnlocalizedName() != null;

        return GameRegistry.registerBlock(block, block.getUnlocalizedName());
    }

}
