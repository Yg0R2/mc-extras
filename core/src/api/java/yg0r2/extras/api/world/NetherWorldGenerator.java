package yg0r2.extras.api.world;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;

import java.util.List;

public final class NetherWorldGenerator extends WorldGenerator {

    public NetherWorldGenerator(List<Block> blocks, int numberOfBlocks) {
        super(blocks, numberOfBlocks);
    }

    @Override
    protected boolean allowedToGenerate(World world) {
        return world.provider instanceof WorldProviderHell;
    }
}
