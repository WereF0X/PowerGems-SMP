package net.mcreator.officialpowergemssmp.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.officialpowergemssmp.init.OfficialpowergemssmpModItems;
import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

public class FireGemTierIIRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 2400);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/tellraw @p {\"text\":\"Charging...\",\"color\":\"gold\"}");
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(OfficialpowergemssmpModItems.FIRE_LAUNCHER.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		OfficialpowergemssmpMod.queueServerWork(40, () -> {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new LargeFireball(EntityType.FIREBALL, projectileLevel);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x, (y + 1), z, 40, 3, 3, 3, 1);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/tellraw @p {\"text\":\"Ability recharges in 2 minutes!\",\"bold\":true,\"color\":\"yellow\"}");
		});
		OfficialpowergemssmpMod.queueServerWork(1750, () -> {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(OfficialpowergemssmpModItems.FIRE_LAUNCHER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		});
	}
}
