package yg0r2.extras.core.world.registry;

import yg0r2.extras.api.world.WorldGeneratorRegistry;
import yg0r2.extras.core.world.CoreWorldGenerator;

public class CoreWorldGeneratorRegistry extends WorldGeneratorRegistry {

    @Override
    public void registerWorldGenerators() {
        registerWorldGenerator(new CoreWorldGenerator());
    }

}
