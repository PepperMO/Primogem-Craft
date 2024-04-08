
package net.mcreator.ceshi.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.Level;

import net.mcreator.ceshi.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.ceshi.procedures.Jiegouxianzhi1Procedure;

public class Zhzhongguanzi01FeatureFeature extends StructureFeature {
	public Zhzhongguanzi01FeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		Level world = context.level().getLevel();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!Jiegouxianzhi1Procedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
