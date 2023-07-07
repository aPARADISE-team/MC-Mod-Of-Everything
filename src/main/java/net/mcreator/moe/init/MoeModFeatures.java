
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.moe.world.features.plants.ButterMushroomFeature;
import net.mcreator.moe.MoeMod;

@Mod.EventBusSubscriber
public class MoeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MoeMod.MODID);
	public static final RegistryObject<Feature<?>> BUTTER_MUSHROOM = REGISTRY.register("butter_mushroom", ButterMushroomFeature::new);
}
