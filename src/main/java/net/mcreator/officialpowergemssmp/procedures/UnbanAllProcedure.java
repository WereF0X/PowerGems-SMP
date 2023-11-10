package net.mcreator.officialpowergemssmp.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.officialpowergemssmp.network.OfficialpowergemssmpModVariables;
import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;

public class UnbanAllProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.HEART_OF_THE_SEA)) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.GEM_CRYSTAL.get())) : false)) {
			if (OfficialpowergemssmpModVariables.MapVariables.get(world).Banned.contains("Already Requested")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/tellraw @p {\"text\":\"You already issued a Unban ALL request. Please wait your previus result before issuing a new one!\",\"color\":\"red\"}");
			}
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
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(OfficialpowergemssmpModItems.GEM_CRYSTAL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.HEART_OF_THE_SEA);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				OfficialpowergemssmpModVariables.MapVariables.get(world).Banned = "Already Requested";
				OfficialpowergemssmpModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/tellraw @p [\"\",{\"text\":\"Unban ALL request has been sent.\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\" You have a 50/50 chance of it being\",\"color\":\"yellow\"},{\"text\":\" successful\",\"bold\":true,\"color\":\"green\"},{\"text\":\" or being a\",\"color\":\"yellow\"},{\"text\":\" fail.\",\"bold\":true,\"color\":\"red\"},{\"text\":\"\\n\"},{\"text\":\"You will be able to see the result in a few days\",\"color\":\"yellow\"}]");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/tellraw @a {\"text\":\"A player issued a request for a Unban ALL!\",\"bold\":true,\"color\":\"yellow\"}");
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/tellraw @p {\"text\":\"You don't have the materials to buy this!\",\"color\":\"red\"}");
		}
	}
}
