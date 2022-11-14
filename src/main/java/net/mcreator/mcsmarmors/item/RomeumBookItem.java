
package net.mcreator.mcsmarmors.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mcsmarmors.init.McsmarmorsModTabs;

public class RomeumBookItem extends Item {
	public RomeumBookItem() {
		super(new Item.Properties().tab(McsmarmorsModTabs.TAB_OLIVERS_ARMOR).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
