package net.mcreator.officialpowergemssmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class EarthBowRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.GLOW_SQUID_INK, x, (y + 1), z, 30, 3, 3, 3, 1);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 30);
	}
}
