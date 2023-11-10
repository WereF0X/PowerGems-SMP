package net.mcreator.officialpowergemssmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.officialpowergemssmp.network.OfficialpowergemssmpModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ResetLivesProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).Lives <= 0) {
			{
				double _setval = 3;
				entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Lives = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).Lives == 1) {
			{
				double _setval = 3;
				entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Lives = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
