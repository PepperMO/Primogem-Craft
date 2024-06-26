package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModEnchantments;

import java.util.Map;

public class JianmufuzhuoshuxingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(PrimogemcraftModEnchantments.CESHIFUMO_01.get(), itemstack) != 0 && itemstack.getDamageValue() > itemstack.getMaxDamage() - 2) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			itemstack.setDamageValue((int) (itemstack.getMaxDamage() - itemstack.getMaxDamage() * itemstack.getEnchantmentLevel(PrimogemcraftModEnchantments.CESHIFUMO_01.get()) * 0.2));
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(PrimogemcraftModEnchantments.CESHIFUMO_01.get())) {
					_enchantments.remove(PrimogemcraftModEnchantments.CESHIFUMO_01.get());
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
		}
	}
}
