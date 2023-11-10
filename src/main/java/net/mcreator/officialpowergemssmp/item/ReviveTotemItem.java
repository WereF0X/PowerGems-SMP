
package net.mcreator.officialpowergemssmp.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.officialpowergemssmp.procedures.ReviveTotemRightclickedProcedure;

public class ReviveTotemItem extends Item {
	public ReviveTotemItem() {
		super(new Item.Properties().stacksTo(10).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		ReviveTotemRightclickedProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
