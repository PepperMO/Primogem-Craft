
package net.mcreator.ceshi.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.world.inventory.CunzheshezhiMenu;
import net.mcreator.ceshi.procedures.GUIsxr1Procedure;
import net.mcreator.ceshi.procedures.GUIsxr10Procedure;
import net.mcreator.ceshi.procedures.GUIsxr100Procedure;
import net.mcreator.ceshi.procedures.GUIsxp1Procedure;
import net.mcreator.ceshi.procedures.GUIsxp10Procedure;
import net.mcreator.ceshi.procedures.GUIsxp100Procedure;
import net.mcreator.ceshi.procedures.CunzheshuxingProcedure;
import net.mcreator.ceshi.procedures.Cunzheshuxing3Procedure;
import net.mcreator.ceshi.procedures.Cunzheshuxing2Procedure;
import net.mcreator.ceshi.procedures.Cunzheshuxing02Procedure;
import net.mcreator.ceshi.procedures.CunzheguibwdProcedure;
import net.mcreator.ceshi.PrimogemcraftMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CunzheshezhiButtonMessage {
	private final int buttonID, x, y, z;

	public CunzheshezhiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CunzheshezhiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CunzheshezhiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CunzheshezhiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = CunzheshezhiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Cunzheshuxing2Procedure.execute(entity, guistate);
		}
		if (buttonID == 1) {

			Cunzheshuxing02Procedure.execute(entity);
		}
		if (buttonID == 2) {

			GUIsxp1Procedure.execute(entity, guistate);
		}
		if (buttonID == 3) {

			GUIsxp10Procedure.execute(entity, guistate);
		}
		if (buttonID == 4) {

			GUIsxp100Procedure.execute(entity, guistate);
		}
		if (buttonID == 5) {

			GUIsxr1Procedure.execute(entity, guistate);
		}
		if (buttonID == 6) {

			GUIsxr10Procedure.execute(entity, guistate);
		}
		if (buttonID == 7) {

			GUIsxr100Procedure.execute(entity, guistate);
		}
		if (buttonID == 8) {

			CunzheshuxingProcedure.execute(entity, guistate);
		}
		if (buttonID == 9) {

			Cunzheshuxing3Procedure.execute(entity, guistate);
		}
		if (buttonID == 10) {

			CunzheguibwdProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PrimogemcraftMod.addNetworkMessage(CunzheshezhiButtonMessage.class, CunzheshezhiButtonMessage::buffer, CunzheshezhiButtonMessage::new, CunzheshezhiButtonMessage::handler);
	}
}
