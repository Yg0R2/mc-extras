package yg0r2.extras.api.world;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

final class McExtrasWorldGenerator extends WorldGenerator {

    private final Block block;
    private final int numberOfBlocks;

    public McExtrasWorldGenerator(Block block, int numberOfBlocks) {
        this.block = block;
        this.numberOfBlocks = numberOfBlocks;
    }

    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {
        boolean generated = false;

        for (int i = 0; i <= numberOfBlocks; i++) {
            int targetX = x + random.nextInt(8) - random.nextInt(8);
            int targetY = y + random.nextInt(8) - random.nextInt(8);
            int targetZ = z + random.nextInt(8) - random.nextInt(8);

            if (isPlaceable(world, targetX, targetY, targetZ)) {
                world.setBlock(targetX, targetY, targetZ, block, 0, 2);
                generated = true;
            }
        }

        return generated;
    }

    private boolean isPlaceable(World world, int targetX, int targetY, int targetZ) {
        return world.isAirBlock(targetX, targetY, targetZ) && block.canPlaceBlockAt(world, targetX, targetY, targetZ);
    }

}
