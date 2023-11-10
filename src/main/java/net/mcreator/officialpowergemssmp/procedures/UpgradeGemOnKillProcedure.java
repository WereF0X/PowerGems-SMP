package net.mcreator.officialpowergemssmp.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;
import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UpgradeGemOnKillProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(OfficialpowergemssmpModGameRules.GEMS_UPGRADE_ON_KILL) == true) {
			if (entity instanceof Player && sourceentity instanceof Player) {
				if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.STRENGTH_TIER_II.get())) : false) {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(OfficialpowergemssmpModItems.STRENGTH_TIER_II.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.STRENGTH_GEM_TIER_III.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.FIRE_GEM.get())) : false) {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(OfficialpowergemssmpModItems.FIRE_GEM.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.FIRE_GEM_TIER_II.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM.get())) : false) {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM_TIER_II.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.EARTH_GEM.get())) : false) {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(OfficialpowergemssmpModItems.EARTH_GEM.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.EARTH_GEM_TIER_II.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.STRENGTH_GEM.get())) : false) {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(OfficialpowergemssmpModItems.STRENGTH_GEM.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.STRENGTH_TIER_II.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM.get())) : false) {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM_TIER_II.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
	}
}
