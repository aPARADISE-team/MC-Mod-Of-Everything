
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moe.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoeModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MoeModBlocks.BUG.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MoeModBlocks.BUTTER_MUSHROOM.get().asItem());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("moe", "mod_of_everything"),
				builder -> builder.title(Component.translatable("item_group.moe.mod_of_everything")).icon(() -> new ItemStack(MoeModBlocks.BUG.get())).displayItems((parameters, tabData) -> {
					tabData.accept(MoeModItems.TAP.get());
					tabData.accept(MoeModItems.BUTTER.get());
				})

		);
	}
}
