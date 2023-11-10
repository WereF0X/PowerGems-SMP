
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.officialpowergemssmp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.officialpowergemssmp.world.inventory.ReviveGUIMenu;
import net.mcreator.officialpowergemssmp.world.inventory.RecipesMenu;
import net.mcreator.officialpowergemssmp.world.inventory.GemTraderGUIMenu;
import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

public class OfficialpowergemssmpModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, OfficialpowergemssmpMod.MODID);
	public static final RegistryObject<MenuType<ReviveGUIMenu>> REVIVE_GUI = REGISTRY.register("revive_gui", () -> IForgeMenuType.create(ReviveGUIMenu::new));
	public static final RegistryObject<MenuType<GemTraderGUIMenu>> GEM_TRADER_GUI = REGISTRY.register("gem_trader_gui", () -> IForgeMenuType.create(GemTraderGUIMenu::new));
	public static final RegistryObject<MenuType<RecipesMenu>> RECIPES = REGISTRY.register("recipes", () -> IForgeMenuType.create(RecipesMenu::new));
}
