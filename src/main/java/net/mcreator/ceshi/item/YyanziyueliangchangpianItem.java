
package net.mcreator.ceshi.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class YyanziyueliangchangpianItem extends RecordItem {
	public YyanziyueliangchangpianItem() {
		super(10, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:yanziyueliang")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5000);
	}
}
