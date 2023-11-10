package net.mcreator.officialpowergemssmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.AnimalTameEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;
import net.mcreator.officialpowergemssmp.entity.LifeGolemEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LifeGolemOnInitialEntitySpawnProcedure {
	@SubscribeEvent
	public static void onEntityTamed(AnimalTameEvent event) {
		execute(event, event.getAnimal(), event.getTamer());
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LifeGolemEntity) {
			if (sourceentity instanceof Player) {
				if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM.get())) : false) {
					if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner)
						_toTame.tame(_owner);
				}
			}
		}
	}
}
