package yg0r2.extras.core.world;

public class CoreWorldGeneratorRegistry extends WorldGeneratorRegistry {

    @Override
    public void registerWorldGenerators() {
        registerWorldGenerator(new CoreWorldGenerator());
    }

}
