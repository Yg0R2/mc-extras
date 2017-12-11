package yg0r2.extras.api.world;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.MinecraftForge;

import java.util.List;
import java.util.Random;

abstract class WorldGenerator implements IWorldGenerator {

    private final List<Block> blocks;
    private final int numberOfBlocks;

    public WorldGenerator(List<Block> blocks, int numberOfBlocks) {
        MinecraftForge.EVENT_BUS.register(this);

        this.blocks = blocks;
        this.numberOfBlocks = numberOfBlocks;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if (!allowedToGenerate(world)) {
            return;
        }

        for (Block block : blocks) {
            int randPosX = chunkX + random.nextInt(16) + 8;
            int randPosY = getWorldSpecificY(world, random);
            int randPosZ = chunkZ + random.nextInt(16) + 8;

            McExtrasWorldGenerator worldGenerator = new McExtrasWorldGenerator(block, numberOfBlocks);
            worldGenerator.generate(world, random, randPosX, randPosY, randPosZ);
        }
    }

    protected abstract boolean allowedToGenerate(World world);

    private int getWorldSpecificY(World world, Random rnd) {
        if (world.provider instanceof WorldProviderHell) {
            return rnd.nextInt(100) + 35;
        }

        return rnd.nextInt(world.getActualHeight() - 72) + 56;
    }

}
