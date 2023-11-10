
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.officialpowergemssmp.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OfficialpowergemssmpModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> GEMS_UPGRADE_ON_KILL = GameRules.register("gemsUpgradeOnKill", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
}
