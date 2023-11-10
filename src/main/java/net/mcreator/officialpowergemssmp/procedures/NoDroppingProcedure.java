package net.mcreator.officialpowergemssmp.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.item.ItemTossEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NoDroppingProcedure {
	@SubscribeEvent
	public static void onGemDropped(ItemTossEvent event) {
		execute(event, event.getPlayer(), event.getEntity().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == OfficialpowergemssmpModItems.FIRE_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.FIRE_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.LIFE_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.EARTH_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.EARTH_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.STRENGTH_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.STRENGTH_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.NETHERITE_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.SCULK_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.SCULK_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.FIRE_GEM_TIER_II.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.FIRE_GEM_TIER_II.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.LIFE_GEM_TIER_II.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.LIFE_GEM_TIER_II.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.EARTH_GEM_TIER_II.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.EARTH_GEM_TIER_II.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.STRENGTH_TIER_II.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.STRENGTH_TIER_II.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.NETHERITE_GEM_TIER_II.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM_TIER_II.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.STRENGTH_GEM_TIER_III.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.STRENGTH_GEM_TIER_III.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.NETHERITE_GEM_SWORD.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.NETHERITE_GEM_SWORD.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.SCULK_HELMET.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.SCULK_HELMET.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.SCULK_CHESTPLATE.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.SCULK_CHESTPLATE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.SCULK_LEGGINGS.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.SCULK_LEGGINGS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.SCULK_BOOTS.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.SCULK_BOOTS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.FIRE_LAUNCHER.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.FIRE_LAUNCHER.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.EARTH_DART.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.EARTH_DART.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.EARTH_BOW.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.EARTH_BOW.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
