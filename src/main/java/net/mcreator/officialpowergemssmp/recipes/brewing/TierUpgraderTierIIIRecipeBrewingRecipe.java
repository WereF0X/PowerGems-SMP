
package net.mcreator.officialpowergemssmp.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TierUpgraderTierIIIRecipeBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new TierUpgraderTierIIIRecipeBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		return Ingredient.of(new ItemStack(Items.NETHER_STAR)).test(input);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(new ItemStack(OfficialpowergemssmpModItems.GEM_UPGRADER.get())).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(OfficialpowergemssmpModItems.GEM_UPGRADER_TIER_II.get());
		}
		return ItemStack.EMPTY;
	}
}
