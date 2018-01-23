package yg0r2.extras.api.blocks.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import yg0r2.extras.api.registry.Registry;

public abstract class BlockRegistry implements Registry {

    protected final Block registerBlock(Block block) {
        assert block != null;
        assert block.getUnlocalizedName() != null;

        return GameRegistry.registerBlock(block, block.getUnlocalizedName());
    }

}
