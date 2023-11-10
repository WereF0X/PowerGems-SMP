package net.mcreator.officialpowergemssmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;
import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DropCrystalOnkillProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.END_ROD, x, (y + 4), z, 40, 3, 3, 3, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.END_ROD, x, (y + 4), z, 40, 3, 3, 3, 1);
			OfficialpowergemssmpMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 4), z, new ItemStack(OfficialpowergemssmpModItems.GEM_CRYSTAL.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			});
		}
	}
}
