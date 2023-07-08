package net.mcreator.moe.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.moe.init.MoeModItems;
import net.mcreator.moe.init.MoeModBlocks;

public class OmegacarrotObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoeModItems.OMEGACARROTSEEDS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MoeModBlocks.OMEGACARROT_1.get() && Math.random() <= 0.1) {
			world.setBlock(BlockPos.containing(x, y, z), MoeModBlocks.OMEGACARROT_2.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MoeModBlocks.OMEGACARROT_2.get() && Math.random() <= 0.1) {
			world.setBlock(BlockPos.containing(x, y, z), MoeModBlocks.OMEGACARROT_3.get().defaultBlockState(), 3);
		}
	}
}
