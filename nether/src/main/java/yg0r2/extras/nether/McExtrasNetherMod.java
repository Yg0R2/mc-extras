package yg0r2.extras.nether;

import cpw.mods.fml.common.Mod;
import yg0r2.extras.core.McExtrasCoreMod;

@Mod(name = McExtrasNetherMod.MOD_NAME, modid = McExtrasNetherMod.MOD_ID, version = McExtrasNetherMod.MOD_VERSION, dependencies = McExtrasNetherMod.DEPENDENCIES)
public final class McExtrasNetherMod extends McExtrasCoreMod {

    public static final String MOD_ID = "mc-extras-nether";
    public static final String MOD_NAME = "MC Extras Nether";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:BuildCraft|Core@" + MOD_VERSION;

    @Mod.Instance(MOD_ID)
    public static McExtrasNetherMod instance;

}
