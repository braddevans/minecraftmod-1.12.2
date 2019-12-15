package uk.co.piratescode.testmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import uk.co.piratescode.testmod.Main;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setTranslationKey(name);
		setRegistryName(name);
	}

	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
