package yg0r2.extras.api.world.registry;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class WorldGeneratorRegistry {

    public abstract void registerWorldGenerators();

    protected final void registerWorldGenerator(IWorldGenerator worldGenerator) {
        GameRegistry.registerWorldGenerator(worldGenerator, 0);
    }

}
