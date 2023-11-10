
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.officialpowergemssmp.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.officialpowergemssmp.client.gui.ReviveGUIScreen;
import net.mcreator.officialpowergemssmp.client.gui.RecipesScreen;
import net.mcreator.officialpowergemssmp.client.gui.GemTraderGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OfficialpowergemssmpModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(OfficialpowergemssmpModMenus.REVIVE_GUI.get(), ReviveGUIScreen::new);
			MenuScreens.register(OfficialpowergemssmpModMenus.GEM_TRADER_GUI.get(), GemTraderGUIScreen::new);
			MenuScreens.register(OfficialpowergemssmpModMenus.RECIPES.get(), RecipesScreen::new);
		});
	}
}
