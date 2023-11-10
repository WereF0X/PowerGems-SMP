
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.officialpowergemssmp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.officialpowergemssmp.item.StrengthTierIIItem;
import net.mcreator.officialpowergemssmp.item.StrengthGemTierIIIItem;
import net.mcreator.officialpowergemssmp.item.StrengthGemItem;
import net.mcreator.officialpowergemssmp.item.SculkItem;
import net.mcreator.officialpowergemssmp.item.SculkGemItem;
import net.mcreator.officialpowergemssmp.item.ReviveTotemItem;
import net.mcreator.officialpowergemssmp.item.NetheriteGemTierIIItem;
import net.mcreator.officialpowergemssmp.item.NetheriteGemSwordItem;
import net.mcreator.officialpowergemssmp.item.NetheriteGemItem;
import net.mcreator.officialpowergemssmp.item.LifeGemTierIIItem;
import net.mcreator.officialpowergemssmp.item.LifeGemItem;
import net.mcreator.officialpowergemssmp.item.GemUpgraderTierIIItem;
import net.mcreator.officialpowergemssmp.item.GemUpgraderItem;
import net.mcreator.officialpowergemssmp.item.GemTraderItem;
import net.mcreator.officialpowergemssmp.item.GemCrystalItem;
import net.mcreator.officialpowergemssmp.item.FireLauncherItem;
import net.mcreator.officialpowergemssmp.item.FireGemTierIIItem;
import net.mcreator.officialpowergemssmp.item.FireGemItem;
import net.mcreator.officialpowergemssmp.item.EarthGemTierIIItem;
import net.mcreator.officialpowergemssmp.item.EarthGemItem;
import net.mcreator.officialpowergemssmp.item.EarthDartItem;
import net.mcreator.officialpowergemssmp.item.EarthBowItem;
import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

public class OfficialpowergemssmpModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OfficialpowergemssmpMod.MODID);
	public static final RegistryObject<Item> GEM_CRYSTAL = REGISTRY.register("gem_crystal", () -> new GemCrystalItem());
	public static final RegistryObject<Item> GEM_UPGRADER = REGISTRY.register("gem_upgrader", () -> new GemUpgraderItem());
	public static final RegistryObject<Item> GEM_UPGRADER_TIER_II = REGISTRY.register("gem_upgrader_tier_ii", () -> new GemUpgraderTierIIItem());
	public static final RegistryObject<Item> REVIVE_TOTEM = REGISTRY.register("revive_totem", () -> new ReviveTotemItem());
	public static final RegistryObject<Item> GEM_TRADER = REGISTRY.register("gem_trader", () -> new GemTraderItem());
	public static final RegistryObject<Item> FIRE_GEM = REGISTRY.register("fire_gem", () -> new FireGemItem());
	public static final RegistryObject<Item> LIFE_GEM = REGISTRY.register("life_gem", () -> new LifeGemItem());
	public static final RegistryObject<Item> EARTH_GEM = REGISTRY.register("earth_gem", () -> new EarthGemItem());
	public static final RegistryObject<Item> STRENGTH_GEM = REGISTRY.register("strength_gem", () -> new StrengthGemItem());
	public static final RegistryObject<Item> NETHERITE_GEM = REGISTRY.register("netherite_gem", () -> new NetheriteGemItem());
	public static final RegistryObject<Item> SCULK_GEM = REGISTRY.register("sculk_gem", () -> new SculkGemItem());
	public static final RegistryObject<Item> NETHERITE_GEM_SWORD = REGISTRY.register("netherite_gem_sword", () -> new NetheriteGemSwordItem());
	public static final RegistryObject<Item> SCULK_HELMET = REGISTRY.register("sculk_helmet", () -> new SculkItem.Helmet());
	public static final RegistryObject<Item> SCULK_CHESTPLATE = REGISTRY.register("sculk_chestplate", () -> new SculkItem.Chestplate());
	public static final RegistryObject<Item> SCULK_LEGGINGS = REGISTRY.register("sculk_leggings", () -> new SculkItem.Leggings());
	public static final RegistryObject<Item> SCULK_BOOTS = REGISTRY.register("sculk_boots", () -> new SculkItem.Boots());
	public static final RegistryObject<Item> FIRE_GEM_TIER_II = REGISTRY.register("fire_gem_tier_ii", () -> new FireGemTierIIItem());
	public static final RegistryObject<Item> FIRE_LAUNCHER = REGISTRY.register("fire_launcher", () -> new FireLauncherItem());
	public static final RegistryObject<Item> LIFE_GEM_TIER_II = REGISTRY.register("life_gem_tier_ii", () -> new LifeGemTierIIItem());
	public static final RegistryObject<Item> EARTH_GEM_TIER_II = REGISTRY.register("earth_gem_tier_ii", () -> new EarthGemTierIIItem());
	public static final RegistryObject<Item> EARTH_DART = REGISTRY.register("earth_dart", () -> new EarthDartItem());
	public static final RegistryObject<Item> EARTH_BOW = REGISTRY.register("earth_bow", () -> new EarthBowItem());
	public static final RegistryObject<Item> STRENGTH_TIER_II = REGISTRY.register("strength_tier_ii", () -> new StrengthTierIIItem());
	public static final RegistryObject<Item> NETHERITE_GEM_TIER_II = REGISTRY.register("netherite_gem_tier_ii", () -> new NetheriteGemTierIIItem());
	public static final RegistryObject<Item> STRENGTH_GEM_TIER_III = REGISTRY.register("strength_gem_tier_iii", () -> new StrengthGemTierIIIItem());
}
