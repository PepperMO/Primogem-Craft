
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.LajizunyanProcedure;

import java.util.List;

public class LajitongzunyanItem extends Item {
	public LajitongzunyanItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77\u975E\u5E38\u6709\u5C0A\u4E25\u7684\u5783\u573E\u6876...."));
		list.add(Component.literal("\u00A7"));
		list.add(Component.literal("\u00A75\u5F53\u98DF\u7528\u540E\uFF1A"));
		list.add(Component.literal("\u00A79\u6297\u6027\u63D0\u5347II\uFF083:00\uFF09"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		LajizunyanProcedure.execute(entity);
		return retval;
	}
}
