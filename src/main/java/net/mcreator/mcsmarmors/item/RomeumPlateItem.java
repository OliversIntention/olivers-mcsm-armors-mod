
package net.mcreator.mcsmarmors.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.mcsmarmors.init.McsmarmorsModTabs;

public class RomeumPlateItem extends Item {
	public RomeumPlateItem() {
		super(new Item.Properties().tab(McsmarmorsModTabs.TAB_OLIVERS_ARMOR).stacksTo(64).rarity(Rarity.EPIC));
	}
}
