
package net.mcreator.mcsmarmors.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mcsmarmors.init.McsmarmorsModTabs;

public abstract class Armor_number_7ArmorItem extends ArmorItem {
	public Armor_number_7ArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.LEATHER));
			}

			@Override
			public String getName() {
				return "armor_number_7";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Chestplate extends Armor_number_7ArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(McsmarmorsModTabs.TAB_OLIVERS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcsmarmors:textures/entities/new7.png";
		}
	}

	public static class Leggings extends Armor_number_7ArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(McsmarmorsModTabs.TAB_OLIVERS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcsmarmors:textures/entities/new7.png";
		}
	}

	public static class Boots extends Armor_number_7ArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(McsmarmorsModTabs.TAB_OLIVERS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcsmarmors:textures/entities/new7.png";
		}
	}
}
