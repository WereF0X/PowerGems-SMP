package net.mcreator.officialpowergemssmp.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.officialpowergemssmp.network.OfficialpowergemssmpModVariables;

public class TellLivesOnCommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("You have " + (entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).Lives + " left")),
					false);
	}
}
