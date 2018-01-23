package yg0r2.extras.core.blocks.registry;

import static yg0r2.extras.api.blocks.McExtrasBlocks.*;

import yg0r2.extras.api.blocks.registry.BlockRegistry;
import yg0r2.extras.api.Colors;
import yg0r2.extras.core.blocks.*;

public final class CoreBlockRegistry extends BlockRegistry {

    @Override
    public void register() {
        COTTON_FLOWER = registerBlock(new BlockCottonFlower());
        COTTON_FLOWER_CROP = registerBlock(new BlockCottonFlowerCrop());

        CYAN_FLOWER = registerBlock(new BlockColoredFlower(Colors.CYAN));
        CYAN_FLOWER_CROP = registerBlock(new BlockColoredFlowerCrop(Colors.CYAN));

        GLOW_FLOWER = registerBlock(new BlockGlowFlower());
        GLOW_FLOWER_CROP = registerBlock(new BlockGlowFlowerCrop());

        MAGENTA_FLOWER = registerBlock(new BlockColoredFlower(Colors.MAGENTA));
        MAGENTA_FLOWER_CROP = registerBlock(new BlockColoredFlowerCrop(Colors.MAGENTA));

        ORANGE_FLOWER = registerBlock(new BlockColoredFlower(Colors.ORANGE));
        ORANGE_FLOWER_CROP = registerBlock(new BlockColoredFlowerCrop(Colors.ORANGE));

        PURPLE_FLOWER = registerBlock(new BlockColoredFlower(Colors.PURPLE));
        PURPLE_FLOWER_CROP = registerBlock(new BlockColoredFlowerCrop(Colors.PURPLE));

        RED_FLOWER_CROP = registerBlock(new BlockColoredFlowerCrop(Colors.RED));

        WHITE_FLOWER = registerBlock(new BlockColoredFlower(Colors.WHITE));
        WHITE_FLOWER_CROP = registerBlock(new BlockColoredFlowerCrop(Colors.WHITE));

        YELLOW_FLOWER_CROP = registerBlock(new BlockColoredFlowerCrop(Colors.YELLOW));
    }

}
