package yg0r2.extras.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import yg0r2.extras.core.blocks.BlockRegistry;
import yg0r2.extras.core.items.ItemRegistry;
import yg0r2.extras.core.recipes.RecipeRegistry;
import yg0r2.extras.core.world.WorldGeneratorRegistry;

@Mod(name = McExtrasCoreMod.MOD_NAME, modid = McExtrasCoreMod.MOD_ID, version = McExtrasCoreMod.MOD_VERSION, acceptedMinecraftVersions = "[1.7.10,)", dependencies = "required-after:Forge@[10.13.4.1614,)")
public class McExtrasCoreMod {

    public static final String MOD_ID = "mc-extras-core";
    public static final String MOD_NAME = "MC Extras Core";
    public static final String MOD_VERSION = "@VERSION@";

    @Mod.Instance(MOD_ID)
    public static McExtrasCoreMod instance;

    private BlockRegistry blockRegistry;
    private ItemRegistry itemRegistry;
    private RecipeRegistry recipeRegistry;
    private WorldGeneratorRegistry worldGeneratorRegistry;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        if (blockRegistry != null) {
            blockRegistry.registerBlocks();
        }

        if (itemRegistry != null) {
            itemRegistry.registerItems();
        }

        if (recipeRegistry != null) {
            recipeRegistry.registerRecipes();
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if (worldGeneratorRegistry != null) {
            worldGeneratorRegistry.registerWorldGenerators();
        }
    }

    protected void setBlockRegistry(BlockRegistry blockRegistry) {
        this.blockRegistry = blockRegistry;
    }

    protected void setItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = itemRegistry;
    }

    protected void setRecipeRegistry(RecipeRegistry recipeRegistry) {
        this.recipeRegistry = recipeRegistry;
    }

    protected void setWorldGeneratorRegistry(WorldGeneratorRegistry worldGeneratorRegistry) {
        this.worldGeneratorRegistry = worldGeneratorRegistry;
    }

}
