
package net.mcreator.officialpowergemssmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GemCrystalItem extends Item {
	public GemCrystalItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
