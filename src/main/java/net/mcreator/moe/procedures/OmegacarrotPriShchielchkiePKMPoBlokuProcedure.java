package net.mcreator.moe.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.moe.init.MoeModBlocks;

public class OmegacarrotPriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MoeModBlocks.OMEGACARROT_1.get() && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.BONE_MEAL)) : false)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y + 1), z, 5, 1, 1, 1, 3);
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (Math.random() <= 0.5) {
				world.setBlock(BlockPos.containing(x, y, z), MoeModBlocks.OMEGACARROT_2.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MoeModBlocks.OMEGACARROT_2.get() && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.BONE_MEAL)) : false)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y + 1), z, 5, 1, 1, 1, 3);
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (Math.random() <= 0.5) {
				world.setBlock(BlockPos.containing(x, y, z), MoeModBlocks.OMEGACARROT_3.get().defaultBlockState(), 3);
			}
		}
	}
}
