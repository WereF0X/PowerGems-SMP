
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.officialpowergemssmp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.officialpowergemssmp.client.renderer.LifeGolemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OfficialpowergemssmpModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OfficialpowergemssmpModEntities.LIFE_GOLEM.get(), LifeGolemRenderer::new);
		event.registerEntityRenderer(OfficialpowergemssmpModEntities.FIRE_LAUNCHER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(OfficialpowergemssmpModEntities.EARTH_BOW.get(), ThrownItemRenderer::new);
	}
}
