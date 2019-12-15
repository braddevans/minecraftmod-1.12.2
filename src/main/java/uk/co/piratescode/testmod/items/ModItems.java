package uk.co.piratescode.testmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemBase tab_item = new ItemBase("tab_item").setCreativeTab(CreativeTabs.MISC);


	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
			tab_item
		);
	}

	public static void registerModels() {
		tab_item.registerItemModel();
	}
}
