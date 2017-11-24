package yg0r2.extras.core.world;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import yg0r2.extras.core.blocks.CoreBlocks;

import java.util.Random;

public class CoreWorldGenerator extends WorldGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int x, int z, World world, IChunkProvider iChunkProvider, IChunkProvider iChunkProvider1) {
        if (!(world.provider instanceof WorldProviderHell)) {
            return;
        }

        generate(world, random, x * 16, z * 16);
    }

    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {
        for (int l = 0; l < 8; l++) {
            int x1 = x + random.nextInt(8) - random.nextInt(8);
            int y1 = y + random.nextInt(4) - random.nextInt(4);
            int z1 = z + random.nextInt(8) - random.nextInt(8);

            if ((world.isAirBlock(x1, y1, z1)) && (CoreBlocks.GLOW_FLOWER.canPlaceBlockAt(world, x1, y1, z1))) {
                world.setBlock(x1, y1, z1, CoreBlocks.GLOW_FLOWER, 0, 2);
            }
        }

        return true;
    }

    private void generate(World world, Random random, int x, int z) {
        for (int i = 0; i < 5; i++) {
            int randPosX = x + random.nextInt(16) + 8;
            int randPosY = random.nextInt(128);
            int randPosZ = z + random.nextInt(16) + 8;

            generate(world, random, randPosX, randPosY, randPosZ);
        }
    }

}
