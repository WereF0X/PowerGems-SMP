
package net.mcreator.officialpowergemssmp.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.officialpowergemssmp.entity.LifeGolemEntity;
import net.mcreator.officialpowergemssmp.client.model.Modeliron_golem;

public class LifeGolemRenderer extends MobRenderer<LifeGolemEntity, Modeliron_golem<LifeGolemEntity>> {
	public LifeGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeliron_golem(context.bakeLayer(Modeliron_golem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LifeGolemEntity entity) {
		return new ResourceLocation("officialpowergemssmp:textures/entities/legs.png");
	}
}
