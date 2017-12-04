package yg0r2.extras.ic2;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import yg0r2.extras.api.ModKeyValues;
import yg0r2.extras.ic2.items.registry.Ic2ItemRegistry;
import yg0r2.extras.ic2.recipes.registry.Ic2RecipeRegistry;

@Mod(
    name = ModKeyValues.IC2_MOD_NAME,
    modid = ModKeyValues.IC2_MOD_ID,
    version = ModKeyValues.MOD_VERSION,
    dependencies = ModKeyValues.IC2_MOD_DEPENDENCIES
)
public final class McExtrasIc2Mod {

    @Mod.Instance(ModKeyValues.IC2_MOD_ID)
    public static McExtrasIc2Mod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        (new Ic2ItemRegistry()).registerItems();
        (new Ic2RecipeRegistry()).registerRecipes();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
