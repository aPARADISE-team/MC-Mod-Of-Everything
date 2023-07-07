package net.mcreator.moe.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class ButterMushroomPriShchielchkiePKMPoRastieniiuProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u041D\u0430 \u043E\u0449\u0443\u043F\u044C \u043A\u0430\u043A \u043C\u0430\u0441\u043B\u043E."), false);
	}
}
