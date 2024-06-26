package net.mcreator.ceshi.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.ceshi.network.PrimogemcraftModVariables;
import net.mcreator.ceshi.init.PrimogemcraftModItems;
import net.mcreator.ceshi.init.PrimogemcraftModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SuijishijiandiaoluoProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack a = ItemStack.EMPTY;
		if (!(world.isClientSide() && entity instanceof Player)) {
			if (Math.random() < ((world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZESUIJISHIJIAN)) * 0.01) / 100
					&& PrimogemcraftModVariables.MapVariables.get(world).shijian_xianzhi < (world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZESHIJIANXIANZHI))) {
				a = new ItemStack(PrimogemcraftModItems.SH_JWUPIN.get());
				if (Math.random() < 0.5) {
					a.getOrCreateTag().putBoolean("PGC_fumo_shijian_00", true);
				} else {
					a.getOrCreateTag().putBoolean("PGC_fumo_shijian_01", true);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, a);
					entityToSpawn.setPickUpDelay(40);
					_level.addFreshEntity(entityToSpawn);
				}
				PrimogemcraftModVariables.MapVariables.get(world).shijian_xianzhi = PrimogemcraftModVariables.MapVariables.get(world).shijian_xianzhi + 1;
				PrimogemcraftModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
