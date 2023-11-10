package net.mcreator.officialpowergemssmp.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import net.mcreator.officialpowergemssmp.network.OfficialpowergemssmpModVariables;
import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;
import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

public class RandomGemsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double RandomGem = 0;
		RandomGem = Mth.nextDouble(RandomSource.create(), 1, 7);
		if (RandomGem >= 1 && RandomGem < 2) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.FIRE_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(OfficialpowergemssmpModItems.FIRE_GEM.get()));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/tellraw @p [\"\",{\"text\":\"Your Gem is now\",\"color\":\"yellow\"},{\"text\":\" Fire!\",\"bold\":true,\"color\":\"gold\"}]");
		}
		if (RandomGem >= 2 && RandomGem < 3) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM.get()));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/tellraw @p [\"\",{\"text\":\"Your Gem is now\",\"color\":\"yellow\"},{\"text\":\" Life!\",\"bold\":true,\"color\":\"light_purple\"}]");
		}
		if (RandomGem >= 3 && RandomGem < 4) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.EARTH_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(OfficialpowergemssmpModItems.EARTH_GEM.get()));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/tellraw @p [\"\",{\"text\":\"Your Gem is now\",\"color\":\"yellow\"},{\"text\":\" Earth!\",\"bold\":true,\"color\":\"green\"}]");
		}
		if (RandomGem >= 4 && RandomGem < 5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.STRENGTH_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(OfficialpowergemssmpModItems.STRENGTH_GEM.get()));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/tellraw @p [\"\",{\"text\":\"Your Gem is now\",\"color\":\"yellow\"},{\"text\":\" Strength!\",\"bold\":true,\"color\":\"red\"}]");
		}
		if (RandomGem >= 5 && RandomGem < 6) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM.get()));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/tellraw @p [\"\",{\"text\":\"Your Gem is now\",\"color\":\"yellow\"},{\"text\":\" Netherite!\",\"bold\":true,\"color\":\"black\"}]");
		}
		if (RandomGem >= 6 && RandomGem < 7) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.SCULK_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(OfficialpowergemssmpModItems.SCULK_GEM.get()));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/tellraw @p [\"\",{\"text\":\"Your Gem is now\",\"color\":\"yellow\"},{\"text\":\" Sculk!\",\"bold\":true,\"color\":\"dark_aqua\"}]");
		}
		{
			boolean _setval = false;
			entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.RandomCommandLimit = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		OfficialpowergemssmpMod.queueServerWork(100, () -> {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.FIRE_GEM.get())) : false) {
				{
					boolean _setval = true;
					entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FireGem = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM.get())) : false) {
				{
					boolean _setval = true;
					entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.LifeGem = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.EARTH_GEM.get())) : false) {
				{
					boolean _setval = true;
					entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EarthGem = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.STRENGTH_GEM.get())) : false) {
				{
					boolean _setval = true;
					entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StrengthGem = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM.get())) : false) {
				{
					boolean _setval = true;
					entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NetheriteGem = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.SCULK_GEM.get())) : false) {
				{
					boolean _setval = true;
					entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SculkGem = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		});
	}
}
