
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class RyzsshjsjItem extends Item {
	public RyzsshjsjItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77\u53EF\u76F4\u63A5\u5F3A\u5316\u81F3\u5408\u91D1\u7B49\u7EA7"));
		list.add(Component.literal("\u00A7"));
		list.add(Component.literal("\u00A77\u53EF\u5E94\u7528\u4E8E\uFF1A"));
		list.add(Component.literal("\u00A7d\u300E\u5143\u7D20\u6676\u4F53\u300F\u00A79\u94BB\u77F3\u5251"));
		list.add(Component.literal("\u00A7d\u300E\u5143\u7D20\u6676\u4F53\u300F\u00A79\u94BB\u77F3\u5236\u76D4\u7532"));
	}
}
