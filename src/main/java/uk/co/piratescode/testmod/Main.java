package uk.co.piratescode.testmod;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jline.utils.Log;
import uk.co.piratescode.testmod.items.ModItems;
import uk.co.piratescode.testmod.proxy.CommonProxy;
import uk.co.piratescode.testmod.utils.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Main {

	@Mod.Instance(Reference.MOD_ID)
	public static Main INSTANCE;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public static void preinit(FMLPreInitializationEvent event) {
		Log.info("HAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {
	}

	@Mod.EventHandler
	public static void postinit(FMLPostInitializationEvent event) {
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
	}
}
