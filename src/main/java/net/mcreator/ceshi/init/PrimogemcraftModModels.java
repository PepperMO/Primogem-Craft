
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ceshi.client.model.Modeljinguangshiti01_Converted_Converted;
import net.mcreator.ceshi.client.model.Modelheitaxiaoren_Converted_Converted;
import net.mcreator.ceshi.client.model.Modelcx_cyhsrmx;
import net.mcreator.ceshi.client.model.Modelceshixiaodeng_Converted;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PrimogemcraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeljinguangshiti01_Converted_Converted.LAYER_LOCATION, Modeljinguangshiti01_Converted_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelceshixiaodeng_Converted.LAYER_LOCATION, Modelceshixiaodeng_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelcx_cyhsrmx.LAYER_LOCATION, Modelcx_cyhsrmx::createBodyLayer);
		event.registerLayerDefinition(Modelheitaxiaoren_Converted_Converted.LAYER_LOCATION, Modelheitaxiaoren_Converted_Converted::createBodyLayer);
	}
}
