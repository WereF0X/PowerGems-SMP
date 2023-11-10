
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.officialpowergemssmp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

public class OfficialpowergemssmpModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OfficialpowergemssmpMod.MODID);
	public static final RegistryObject<CreativeModeTab> POWER_GEMS = REGISTRY.register("power_gems",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.officialpowergemssmp.power_gems")).icon(() -> new ItemStack(OfficialpowergemssmpModItems.GEM_CRYSTAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OfficialpowergemssmpModItems.GEM_CRYSTAL.get());
				tabData.accept(OfficialpowergemssmpModItems.GEM_UPGRADER.get());
				tabData.accept(OfficialpowergemssmpModItems.GEM_UPGRADER_TIER_II.get());
				tabData.accept(OfficialpowergemssmpModItems.REVIVE_TOTEM.get());
				tabData.accept(OfficialpowergemssmpModItems.GEM_TRADER.get());
				tabData.accept(OfficialpowergemssmpModItems.FIRE_GEM.get());
				tabData.accept(OfficialpowergemssmpModItems.LIFE_GEM.get());
				tabData.accept(OfficialpowergemssmpModItems.EARTH_GEM.get());
				tabData.accept(OfficialpowergemssmpModItems.STRENGTH_GEM.get());
				tabData.accept(OfficialpowergemssmpModItems.NETHERITE_GEM.get());
				tabData.accept(OfficialpowergemssmpModItems.SCULK_GEM.get());
			})

					.build());
}
