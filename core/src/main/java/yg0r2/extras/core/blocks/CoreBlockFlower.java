package yg0r2.extras.core.blocks;

abstract class CoreBlockFlower extends AbstractBlockFlower {

    public CoreBlockFlower(String blockName) {
        this(blockName, "core:" + blockName);
    }

    public CoreBlockFlower(String blockName, String textureName) {
        super(blockName, textureName);
    }
}
