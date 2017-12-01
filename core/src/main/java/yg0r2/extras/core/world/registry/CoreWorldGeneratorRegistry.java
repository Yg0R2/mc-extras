package yg0r2.extras.core.world.registry;

import net.minecraftforge.common.EnumPlantType;
import yg0r2.extras.api.world.NetherWorldGenerator;
import yg0r2.extras.api.world.OverworldrWorldGenerator;
import yg0r2.extras.api.world.registry.WorldGeneratorRegistry;

public class CoreWorldGeneratorRegistry extends WorldGeneratorRegistry {

    private static final int NETHER_BLOCK_COUNT = 10;
    private static final int OVERWORLD_BLOCK_COUNT = 15;

    @Override
    public void registerWorldGenerators() {
        registerWorldGenerator(new NetherWorldGenerator(getBlocks(EnumPlantType.Nether), NETHER_BLOCK_COUNT));

        registerWorldGenerator(new OverworldrWorldGenerator(getBlocks(EnumPlantType.Plains), OVERWORLD_BLOCK_COUNT));
    }

}
