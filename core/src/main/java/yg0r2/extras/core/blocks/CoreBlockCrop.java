package yg0r2.extras.core.blocks;

abstract class CoreBlockCrop extends AbstractBlockCrop {

    public CoreBlockCrop(String blockName) {
        this(blockName, "core:" + blockName);
    }

    public CoreBlockCrop(String blockName, String textureName) {
        super(blockName, textureName);
    }

}
