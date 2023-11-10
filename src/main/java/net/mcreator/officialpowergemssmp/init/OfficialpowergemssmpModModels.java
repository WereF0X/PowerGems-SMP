
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.officialpowergemssmp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.officialpowergemssmp.client.model.Modeliron_golem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OfficialpowergemssmpModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeliron_golem.LAYER_LOCATION, Modeliron_golem::createBodyLayer);
	}
}
