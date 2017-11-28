package yg0r2.extras.core.items;

abstract class CoreItem extends AbstractItem {

    public CoreItem(String blockName) {
        super(blockName, "core:" + blockName);
    }

    public CoreItem(String blockName, String textureName) {
        super(blockName, textureName);
    }

}
