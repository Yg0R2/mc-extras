package yg0r2.extras.ic2;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import yg0r2.extras.core.McExtrasCoreMod;
import yg0r2.extras.ic2.recipes.Ic2RecipeRegistry;

@Mod(name = McExtrasIc2Mod.MOD_NAME, modid = McExtrasIc2Mod.MOD_ID, version = McExtrasIc2Mod.MOD_VERSION, dependencies = McExtrasIc2Mod.DEPENDENCIES)
public class McExtrasIc2Mod {

    public static final String MOD_ID = "mc-extras-ic2";
    public static final String MOD_NAME = "MC Extras IC2";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:" + McExtrasCoreMod.MOD_ID + "@" + MOD_VERSION;

    @Mod.Instance(MOD_ID)
    public static McExtrasIc2Mod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        (new Ic2RecipeRegistry()).registerRecipes();
    }

}
