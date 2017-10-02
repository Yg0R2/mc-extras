package yg0r2.extras.core.utils;

import cpw.mods.fml.common.FMLCommonHandler;

public class SideUtils {

    public static boolean isClient() {
        return FMLCommonHandler.instance().getEffectiveSide().isClient();
    }

    public static boolean isServer() {
        return FMLCommonHandler.instance().getEffectiveSide().isServer();
    }

}
