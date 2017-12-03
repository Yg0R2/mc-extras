package yg0r2.extras.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import yg0r2.extras.api.ModKeyValues;
import yg0r2.extras.core.blocks.registry.CoreBlockRegistry;
import yg0r2.extras.core.items.registry.CoreItemRegistry;
import yg0r2.extras.core.recipes.registry.CoreRecipeRegistry;
import yg0r2.extras.core.world.registry.CoreWorldGeneratorRegistry;

@Mod(
    name = ModKeyValues.CORE_MOD_NAME,
    modid = ModKeyValues.CORE_MOD_ID,
    version = ModKeyValues.MOD_VERSION,
    acceptedMinecraftVersions = ModKeyValues.ACCEPTABLE_MINECRAFT_VERSIONS,
    dependencies = ModKeyValues.CORE_MOD_DEPENDENCIES
)
public class McExtrasCoreMod {

    @Mod.Instance(ModKeyValues.CORE_MOD_ID)
    public static McExtrasCoreMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        new CoreBlockRegistry().registerBlocks();
        new CoreItemRegistry().registerItems();
        new CoreRecipeRegistry().registerRecipes();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        new CoreWorldGeneratorRegistry().registerWorldGenerators();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
