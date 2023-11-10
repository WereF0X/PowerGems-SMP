
package net.mcreator.officialpowergemssmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GemUpgraderItem extends Item {
	public GemUpgraderItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.RARE));
	}
}
