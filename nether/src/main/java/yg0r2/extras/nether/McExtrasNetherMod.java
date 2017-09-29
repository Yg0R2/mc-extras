package yg0r2.extras.nether;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import yg0r2.extras.core.McExtrasCoreMod;
import yg0r2.extras.nether.blocks.NetherBlockRegistry;
import yg0r2.extras.nether.items.NetherItemRegistry;
import yg0r2.extras.nether.recipes.NetherRecipeRegistry;
import yg0r2.extras.nether.world.NetherWorldGeneratorRegistry;

@Mod(name = McExtrasNetherMod.MOD_NAME, modid = McExtrasNetherMod.MOD_ID, version = McExtrasNetherMod.MOD_VERSION, dependencies = McExtrasNetherMod.DEPENDENCIES)
public final class McExtrasNetherMod {

    public static final String MOD_ID = "mc-extras-nether";
    public static final String MOD_NAME = "MC Extras Nether";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:" + McExtrasCoreMod.MOD_ID + "@" + MOD_VERSION;

    @Mod.Instance(MOD_ID)
    public static McExtrasNetherMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        (new NetherBlockRegistry()).registerBlocks();
        (new NetherItemRegistry()).registerItems();
        (new NetherRecipeRegistry()).registerRecipes();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        (new NetherWorldGeneratorRegistry()).registerWorldGenerators();
    }

}
