package net.mcreator.officialpowergemssmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.item.ItemStack;

import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NoPickingUpProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getItem().getItem());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getItem() == OfficialpowergemssmpModItems.FIRE_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.LIFE_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.EARTH_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.STRENGTH_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.NETHERITE_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.SCULK_GEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.FIRE_GEM_TIER_II.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.LIFE_GEM_TIER_II.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.EARTH_GEM_TIER_II.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.STRENGTH_TIER_II.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.NETHERITE_GEM_TIER_II.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.STRENGTH_GEM_TIER_III.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.NETHERITE_GEM_SWORD.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.SCULK_HELMET.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.SCULK_CHESTPLATE.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.SCULK_LEGGINGS.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.SCULK_BOOTS.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.FIRE_LAUNCHER.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.EARTH_DART.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
		if (itemstack.getItem() == OfficialpowergemssmpModItems.EARTH_BOW.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
	}
}
