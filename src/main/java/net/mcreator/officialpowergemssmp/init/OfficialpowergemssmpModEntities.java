
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.officialpowergemssmp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.officialpowergemssmp.entity.LifeGolemEntity;
import net.mcreator.officialpowergemssmp.entity.FireLauncherEntity;
import net.mcreator.officialpowergemssmp.entity.EarthBowEntity;
import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OfficialpowergemssmpModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, OfficialpowergemssmpMod.MODID);
	public static final RegistryObject<EntityType<LifeGolemEntity>> LIFE_GOLEM = register("life_golem",
			EntityType.Builder.<LifeGolemEntity>of(LifeGolemEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LifeGolemEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireLauncherEntity>> FIRE_LAUNCHER = register("projectile_fire_launcher",
			EntityType.Builder.<FireLauncherEntity>of(FireLauncherEntity::new, MobCategory.MISC).setCustomClientFactory(FireLauncherEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EarthBowEntity>> EARTH_BOW = register("projectile_earth_bow",
			EntityType.Builder.<EarthBowEntity>of(EarthBowEntity::new, MobCategory.MISC).setCustomClientFactory(EarthBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			LifeGolemEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LIFE_GOLEM.get(), LifeGolemEntity.createAttributes().build());
	}
}
