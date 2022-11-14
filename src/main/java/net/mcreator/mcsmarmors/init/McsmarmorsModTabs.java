
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcsmarmors.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class McsmarmorsModTabs {
	public static CreativeModeTab TAB_OLIVERS_ARMOR;

	public static void load() {
		TAB_OLIVERS_ARMOR = new CreativeModeTab("tabolivers_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(McsmarmorsModItems.ADAMANTINE_IMPERVIUM_CHESTPLATE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
