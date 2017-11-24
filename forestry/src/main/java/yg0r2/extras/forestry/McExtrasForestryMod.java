package yg0r2.extras.forestry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import yg0r2.extras.ModKeyValues;

@Mod(
    name = ModKeyValues.FORESTRY_MOD_NAME,
    modid = ModKeyValues.FORESTRY_MOD_ID,
    version = ModKeyValues.MOD_VERSION,
    dependencies = ModKeyValues.FORESTRY_MOD_DEPENDENCIES
)
public final class McExtrasForestryMod {

    @Mod.Instance(ModKeyValues.FORESTRY_MOD_ID)
    public static McExtrasForestryMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
