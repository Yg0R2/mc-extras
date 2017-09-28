package yg0r2.extras.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import yg0r2.extras.core.blocks.BlockRegistry;

@Mod(name = McExtrasCoreMod.MOD_NAME, modid = McExtrasCoreMod.MOD_ID, version = McExtrasCoreMod.MOD_VERSION, acceptedMinecraftVersions = "[1.7.10,)", dependencies = "required-after:Forge@[10.13.4.1614,)")
public class McExtrasCoreMod {

    public static final String MOD_ID = "mc-extras-core";
    public static final String MOD_NAME = "MC Extras Core";
    public static final String MOD_VERSION = "@VERSION@";

    @Mod.Instance(MOD_ID)
    public static McExtrasCoreMod instance;

    private BlockRegistry blockRegistry;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        if (blockRegistry != null) {
            blockRegistry.registerBlocks();
        }
    }

    protected void setBlockRegistry(BlockRegistry blockRegistry) {
        this.blockRegistry = blockRegistry;
    }

}
