
package net.mcreator.mcsmarmors.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mcsmarmors.init.McsmarmorsModTabs;
import net.mcreator.mcsmarmors.init.McsmarmorsModItems;

public abstract class SoreArmorItem extends ArmorItem {
	public SoreArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 100;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 12, 13, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(McsmarmorsModItems.ENCHANTED_DIAMOND.get()));
			}

			@Override
			public String getName() {
				return "soren";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SoreArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(McsmarmorsModTabs.TAB_OLIVERS_ARMOR).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcsmarmors:textures/entities/soren4.png";
		}
	}

	public static class Chestplate extends SoreArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(McsmarmorsModTabs.TAB_OLIVERS_ARMOR).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcsmarmors:textures/entities/soren4.png";
		}
	}

	public static class Leggings extends SoreArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(McsmarmorsModTabs.TAB_OLIVERS_ARMOR).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcsmarmors:textures/entities/soren4.png";
		}
	}

	public static class Boots extends SoreArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(McsmarmorsModTabs.TAB_OLIVERS_ARMOR).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcsmarmors:textures/entities/soren4.png";
		}
	}
}
