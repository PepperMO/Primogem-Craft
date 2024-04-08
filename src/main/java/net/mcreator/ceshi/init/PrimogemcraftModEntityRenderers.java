
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ceshi.client.renderer.XiaoheitaRenderer;
import net.mcreator.ceshi.client.renderer.XiaodengRenderer;
import net.mcreator.ceshi.client.renderer.QqiyuanJinGuangRenderer;
import net.mcreator.ceshi.client.renderer.QqiwuzhanlipinshitiRenderer;
import net.mcreator.ceshi.client.renderer.QQyuanchuzi01Renderer;
import net.mcreator.ceshi.client.renderer.QQQyuanchulan01Renderer;
import net.mcreator.ceshi.client.renderer.CaoyuanheshengwuRenderer;
import net.mcreator.ceshi.client.renderer.BaiguangguodushengwuRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PrimogemcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PrimogemcraftModEntities.QQIYUAN_JIN_GUANG.get(), QqiyuanJinGuangRenderer::new);
		event.registerEntityRenderer(PrimogemcraftModEntities.Q_QYUANCHUZI_01.get(), QQyuanchuzi01Renderer::new);
		event.registerEntityRenderer(PrimogemcraftModEntities.QQ_QYUANCHULAN_01.get(), QQQyuanchulan01Renderer::new);
		event.registerEntityRenderer(PrimogemcraftModEntities.QQIWUZHANLIPINSHITI.get(), QqiwuzhanlipinshitiRenderer::new);
		event.registerEntityRenderer(PrimogemcraftModEntities.BAIGUANGGUODUSHENGWU.get(), BaiguangguodushengwuRenderer::new);
		event.registerEntityRenderer(PrimogemcraftModEntities.CAOYUANHESHENGWU.get(), CaoyuanheshengwuRenderer::new);
		event.registerEntityRenderer(PrimogemcraftModEntities.XIAODENG.get(), XiaodengRenderer::new);
		event.registerEntityRenderer(PrimogemcraftModEntities.XIAOHEITA.get(), XiaoheitaRenderer::new);
	}
}
