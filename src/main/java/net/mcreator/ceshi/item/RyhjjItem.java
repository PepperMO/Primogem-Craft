
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.RyjsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class RyhjjItem extends SwordItem {
	public RyhjjItem() {
		super(new Tier() {
			public int getUses() {
				return 2561;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.RANYUANDUANPIAN.get()), new ItemStack(Items.NETHERITE_INGOT));
			}
		}, 3, -2f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		RyjsxProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A7d\u653B\u51FB\u76EE\u6807\u65F6\uFF1A"));
		list.add(Component.literal("\u00A77 - \u4E3A\u76EE\u6807\u65BD\u52A0\u707C\u70E7\u6548\u679CIII\uFF086s\uFF09"));
		list.add(Component.literal("\u00A77 - \u89E6\u53D1\u6982\u738775%"));
	}
}
