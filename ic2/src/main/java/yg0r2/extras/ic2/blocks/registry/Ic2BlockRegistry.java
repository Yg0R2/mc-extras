package yg0r2.extras.ic2.blocks.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import yg0r2.extras.api.registry.Registry;
import yg0r2.extras.ic2.blocks.Ic2Blocks;
import yg0r2.extras.ic2.blocks.TileEntityMuffledMassFabricator;

public class Ic2BlockRegistry implements Registry {

    @Override
    public void register() {
        Ic2Blocks.MUFFLED_MASS_FABRICATOR = new ItemStack(new BlockMuffledMassFabricator(), 1, 16);
        GameRegistry.registerTileEntity(TileEntityMuffledMassFabricator.class, "Muffled Mass Fabricator");
    }

}
