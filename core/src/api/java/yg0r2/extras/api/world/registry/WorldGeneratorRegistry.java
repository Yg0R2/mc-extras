package yg0r2.extras.api.world.registry;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import org.apache.logging.log4j.Level;
import yg0r2.extras.api.blocks.McExtrasBlocks;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class WorldGeneratorRegistry {

    public abstract void registerWorldGenerators();

    protected final List<Block> getBlocks(EnumPlantType plantType) {
        List<Block> blocks = new ArrayList<>();

        Field[] fields = McExtrasBlocks.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                Object block = field.get(null);

                if (!(block instanceof IPlantable)) {
                    continue;
                }

                IPlantable plantable = (IPlantable) block;
                if (plantType == plantable.getPlantType(null, 0, 0, 0)) {
                    blocks.add((Block) plantable);
                }
            }
            catch (IllegalAccessException e) {
                FMLLog.log(Level.ERROR, "[McExtras] Unable to get block: " + field.getName());
            }
        }

        return blocks;
    }

    protected final void registerWorldGenerator(IWorldGenerator worldGenerator) {
        GameRegistry.registerWorldGenerator(worldGenerator, 0);
    }

}
