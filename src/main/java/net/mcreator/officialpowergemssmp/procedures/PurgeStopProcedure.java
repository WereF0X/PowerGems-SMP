package net.mcreator.officialpowergemssmp.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModGameRules;
import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

public class PurgeStopProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/title @a times 20 100 20");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/title @a subtitle {\"text\":\"Event is over. You can rest... for now\",\"color\":\"dark_red\"}");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/title @a title [\"\",{\"text\":\"\\u26a0\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"Doomsday Siege\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"\\u26a0\",\"bold\":true,\"color\":\"yellow\"}]");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/tellraw @a [\"\",{\"text\":\"\\u26a0\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"DOOMSDAY SIEGE\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"\\u26a0\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"\\n\",\"bold\":true},{\"text\":\"\\n\"},{\"text\":\"Spawn is now safe.\",\"color\":\"dark_red\"}]");
		world.getLevelData().getGameRules().getRule(OfficialpowergemssmpModGameRules.GEMS_UPGRADE_ON_KILL).set(false, world.getServer());
		OfficialpowergemssmpMod.queueServerWork(360000, () -> {
			PurgeRealStartProcedure.execute(world, x, y, z);
		});
	}
}
