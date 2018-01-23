package yg0r2.extras.ic2.blocks.registry;

import ic2.core.block.TileEntityBlock;
import ic2.core.block.machine.BlockMachine;
import ic2.core.init.InternalName;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import org.apache.commons.lang3.mutable.MutableObject;
import yg0r2.extras.api.McExtrasCreativeTabs;
import yg0r2.extras.ic2.blocks.TileEntityMuffledMassFabricator;

public class BlockMuffledMassFabricator extends BlockMachine {

    public BlockMuffledMassFabricator() {
        super(InternalName.blockMachine);

        setBlockName("muffledMassFabricator");
        setBlockTextureName("ic2:muffledMassFabricator");

        setCreativeTab(McExtrasCreativeTabs.MC_EXTRAS_CREATIVE_TAB);
    }

    @Override
    public int damageDropped(int meta) {
        return super.damageDropped(14);
    }

    @Override
    public int getComparatorInputOverride(World world, int x, int y, int z, int side) {
        TileEntityBlock tileEntityBlock = (TileEntityBlock) this.getOwnTe(world, x, y, z);

        return (int) Math.floor(((TileEntityMuffledMassFabricator)tileEntityBlock).energy / 1000000.0D * 15.0D);
    }

    @Override
    public Class<? extends TileEntity> getTeClass(int meta, MutableObject<Class<?>[]> ctorArgTypes, MutableObject<Object[]> ctorArgs) {
        return TileEntityMuffledMassFabricator.class;
    }
}
