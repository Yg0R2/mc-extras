package yg0r2.extras.nether.world;

import yg0r2.extras.core.world.WorldGeneratorRegistry;

public class NetherWorldGeneratorRegistry extends WorldGeneratorRegistry {

    @Override
    public void registerWorldGenerators() {
        registerWorldGenerator(new NetherWorldGenerator());
    }

}
