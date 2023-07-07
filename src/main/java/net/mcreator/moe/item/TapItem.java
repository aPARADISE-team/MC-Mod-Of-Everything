
package net.mcreator.moe.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TapItem extends Item {
	public TapItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
