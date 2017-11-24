package yg0r2.extras.forestry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import yg0r2.extras.core.McExtrasCoreMod;

@Mod(
    name = McExtrasForestryMod.MOD_NAME,
    modid = McExtrasForestryMod.MOD_ID,
    version = McExtrasForestryMod.MOD_VERSION,
    dependencies = McExtrasForestryMod.DEPENDENCIES
)
public final class McExtrasForestryMod {

    public static final String MOD_ID = "mc-extras-forestry";
    public static final String MOD_NAME = "MC Extras Forestry";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:" + McExtrasCoreMod.MOD_ID + "@[" + MOD_VERSION + "]" +
        ";after:Forestry@[4.2.16.64,)";

    @Mod.Instance(MOD_ID)
    public static McExtrasForestryMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

}
