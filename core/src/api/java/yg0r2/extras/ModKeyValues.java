package yg0r2.extras;

public final class ModKeyValues {

    public static final String ACCEPTABLE_MINECRAFT_VERSIONS = "[1.7.10,)";
    public static final String MOD_VERSION = "@VERSION@";

    public static final String CORE_MOD_ID = "mc-extras-core";
    public static final String CORE_MOD_DEPENDENCIES = "required-after:Forge@[10.13.4.1614,)";
    public static final String CORE_MOD_NAME = "MC Extras Core";

    public static final String CORE_MOD_AS_DEPENDENCY = "required-after:" + CORE_MOD_ID + "@[" + MOD_VERSION + "]";

    public static final String FORESTRY_MOD_ID = "mc-extras-forestry";
    public static final String FORESTRY_MOD_DEPENDENCIES = CORE_MOD_AS_DEPENDENCY + ";after:Forestry@[4.2.16.64,)";
    public static final String FORESTRY_MOD_NAME = "MC Extras Forestry";

    public static final String IC2_MOD_ID = "mc-extras-ic2";
    public static final String IC2_MOD_DEPENDENCIES = CORE_MOD_AS_DEPENDENCY + ";after:IC2@[2.2.827-experimental,)";
    public static final String IC2_MOD_NAME = "MC Extras IC2";

}
