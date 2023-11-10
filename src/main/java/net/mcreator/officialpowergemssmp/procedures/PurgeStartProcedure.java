package net.mcreator.officialpowergemssmp.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

public class PurgeStartProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/title @a times 20 100 20");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/title @a subtitle {\"text\":\"START!!\",\"color\":\"gold\"}");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/title @a title [\"\",{\"text\":\"Power\",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"Gems \",\"bold\":true,\"color\":\"light_purple\"},{\"text\":\"S\",\"bold\":true,\"color\":\"dark_aqua\"},{\"text\":\"M\",\"bold\":true,\"color\":\"aqua\"},{\"text\":\"P\",\"bold\":true,\"color\":\"green\"}]");
		OfficialpowergemssmpMod.queueServerWork(360000, () -> {
			PurgeRealStartProcedure.execute(world, x, y, z);
		});
	}
}
