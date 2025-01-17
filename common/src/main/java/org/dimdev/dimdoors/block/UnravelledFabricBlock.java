package org.dimdev.dimdoors.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.dimdev.dimdoors.world.ModDimensions;
import org.dimdev.dimdoors.world.decay.Decay;
import org.dimdev.dimdoors.world.decay.DecaySource;

public class UnravelledFabricBlock extends Block {
	public static final String ID = "unravelled_fabric";

	public UnravelledFabricBlock(BlockBehaviour.Properties settings) {
		super(settings);
	}

	@Override
	public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		if (ModDimensions.isLimboDimension(level)) {
			Decay.applySpreadDecay(level, pos, random, DecaySource.LIMBO);
		}
	}
}
