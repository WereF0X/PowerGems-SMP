package net.mcreator.officialpowergemssmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.CommandEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.officialpowergemssmp.network.OfficialpowergemssmpModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetRandomLimitProcedure {
	@SubscribeEvent
	public static void onCommand(CommandEvent event) {
		Entity entity = event.getParseResults().getContext().getSource().getEntity();
		if (entity != null) {
			execute(event, entity);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.hasPermissions(4)) {
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(0);
		} else {
			if ((entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).RandomCommandLimit == true) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(0);
			} else if ((entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).RandomCommandLimit == false) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}
