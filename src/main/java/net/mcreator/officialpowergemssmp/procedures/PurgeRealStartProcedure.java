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

public class PurgeRealStartProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/title @a times 20 100 20");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/title @a subtitle {\"text\":\"Gems are now upgraded on kill\",\"color\":\"dark_red\"}");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/title @a title [\"\",{\"text\":\"\\u26a0\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"Doomsday Siege\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"\\u26a0\",\"bold\":true,\"color\":\"yellow\"}]");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/tellraw @a [\"\",{\"text\":\"\\u26a0\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"DOOMSDAY SIEGE\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"\\u26a0\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"\\n\",\"bold\":true},{\"text\":\"You can now be attacked at spawn.\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"\\n\"},{\"text\":\"Gems will be upgraded on kill for the next 30 minutes.\",\"color\":\"dark_red\"}]");
		world.getLevelData().getGameRules().getRule(OfficialpowergemssmpModGameRules.GEMS_UPGRADE_ON_KILL).set(true, world.getServer());
		OfficialpowergemssmpMod.queueServerWork(36000, () -> {
			PurgeStopProcedure.execute(world, x, y, z);
		});
	}
}
