package net.mcreator.officialpowergemssmp.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.officialpowergemssmp.network.OfficialpowergemssmpModVariables;
import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;

public class UnbanProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (OfficialpowergemssmpModVariables.MapVariables.get(world).Banned.contains("\"\"")) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/tellraw @p {\"text\":\"No player is banned!\",\"color\":\"red\"}");
		} else {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(OfficialpowergemssmpModItems.REVIVE_TOTEM.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("pardon " + OfficialpowergemssmpModVariables.MapVariables.get(world).Banned));
			OfficialpowergemssmpModVariables.MapVariables.get(world).Banned = "\"\"";
			OfficialpowergemssmpModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/tellraw @a {\"text\":\"A player has been revived!\",\"bold\":true,\"color\":\"yellow\"}");
		}
	}
}
