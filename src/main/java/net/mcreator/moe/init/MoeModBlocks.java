
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.moe.block.BugBlock;
import net.mcreator.moe.MoeMod;

public class MoeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoeMod.MODID);
	public static final RegistryObject<Block> BUG = REGISTRY.register("bug", () -> new BugBlock());
}
