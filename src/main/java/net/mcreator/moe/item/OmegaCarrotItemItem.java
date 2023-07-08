
package net.mcreator.moe.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class OmegaCarrotItemItem extends Item {
	public OmegaCarrotItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(20).saturationMod(20f).alwaysEat().build()));
	}
}
