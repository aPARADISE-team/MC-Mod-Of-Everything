
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.moe.item.TapItem;
import net.mcreator.moe.item.OmegacarrotseedsItem;
import net.mcreator.moe.item.HandleItem;
import net.mcreator.moe.item.ButterItem;
import net.mcreator.moe.MoeMod;

public class MoeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoeMod.MODID);
	public static final RegistryObject<Item> BUG = block(MoeModBlocks.BUG);
	public static final RegistryObject<Item> TAP = REGISTRY.register("tap", () -> new TapItem());
	public static final RegistryObject<Item> BUTTER_MUSHROOM = block(MoeModBlocks.BUTTER_MUSHROOM);
	public static final RegistryObject<Item> BUTTER = REGISTRY.register("butter", () -> new ButterItem());
	public static final RegistryObject<Item> HANDLE = REGISTRY.register("handle", () -> new HandleItem());
	public static final RegistryObject<Item> OMEGACARROTSEEDS = REGISTRY.register("omegacarrotseeds", () -> new OmegacarrotseedsItem());
	public static final RegistryObject<Item> OMEGACARROT_1 = block(MoeModBlocks.OMEGACARROT_1);
	public static final RegistryObject<Item> OMEGACARROT_2 = block(MoeModBlocks.OMEGACARROT_2);
	public static final RegistryObject<Item> OMEGACARROT_3 = block(MoeModBlocks.OMEGACARROT_3);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
