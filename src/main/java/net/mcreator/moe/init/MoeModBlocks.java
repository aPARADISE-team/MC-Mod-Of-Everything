
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.moe.block.OmegacarrotBlock;
import net.mcreator.moe.block.Omegacarrot3Block;
import net.mcreator.moe.block.Omegacarrot2Block;
import net.mcreator.moe.block.ButterMushroomBlock;
import net.mcreator.moe.block.BugBlock;
import net.mcreator.moe.MoeMod;

public class MoeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoeMod.MODID);
	public static final RegistryObject<Block> BUG = REGISTRY.register("bug", () -> new BugBlock());
	public static final RegistryObject<Block> BUTTER_MUSHROOM = REGISTRY.register("butter_mushroom", () -> new ButterMushroomBlock());
	public static final RegistryObject<Block> OMEGACARROT_1 = REGISTRY.register("omegacarrot_1", () -> new OmegacarrotBlock());
	public static final RegistryObject<Block> OMEGACARROT_2 = REGISTRY.register("omegacarrot_2", () -> new Omegacarrot2Block());
	public static final RegistryObject<Block> OMEGACARROT_3 = REGISTRY.register("omegacarrot_3", () -> new Omegacarrot3Block());
}
