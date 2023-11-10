package net.mcreator.officialpowergemssmp.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.officialpowergemssmp.network.OfficialpowergemssmpModVariables;
import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;

public class GiveGemBackOnCommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.FIRE_GEM.get())) : false)
				&& (entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).FireGem == true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.FIRE_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM.get())) : false)
				&& (entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).LifeGem == true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.EARTH_GEM.get())) : false)
				&& (entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).EarthGem == true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.EARTH_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.STRENGTH_GEM.get())) : false)
				&& (entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).StrengthGem == true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.STRENGTH_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM.get())) : false)
				&& (entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).NetheriteGem == true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.SCULK_GEM.get())) : false)
				&& (entity.getCapability(OfficialpowergemssmpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OfficialpowergemssmpModVariables.PlayerVariables())).SculkGem == true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.SCULK_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
