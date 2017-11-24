package yg0r2.extras.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import yg0r2.extras.core.blocks.CoreBlockRegistry;
import yg0r2.extras.core.items.CoreItemRegistry;
import yg0r2.extras.core.recipies.CoreRecipeRegistry;
import yg0r2.extras.core.world.CoreWorldGeneratorRegistry;

@Mod(
    name = McExtrasCoreMod.MOD_NAME,
    modid = McExtrasCoreMod.MOD_ID,
    version = McExtrasCoreMod.MOD_VERSION,
    acceptedMinecraftVersions = "[1.7.10,)",
    dependencies = "required-after:Forge@[10.13.4.1614,)"
)
public class McExtrasCoreMod {

    public static final String MOD_ID = "mc-extras-core";
    public static final String MOD_NAME = "MC Extras Core";
    public static final String MOD_VERSION = "@VERSION@";

    @Mod.Instance(MOD_ID)
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
