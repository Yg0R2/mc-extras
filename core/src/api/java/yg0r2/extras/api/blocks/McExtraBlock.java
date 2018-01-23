package yg0r2.extras.api.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import yg0r2.extras.api.McExtrasCreativeTabs;

public abstract class McExtraBlock extends Block {

    protected McExtraBlock(String blockName, String textureName) {
        super(Material.rock);

        setBlockName(blockName);
        setBlockTextureName(textureName);

        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);
    }

}
