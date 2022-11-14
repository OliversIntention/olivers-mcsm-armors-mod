
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcsmarmors.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mcsmarmors.item.WhitepumpArmorItem;
import net.mcreator.mcsmarmors.item.UnenchantedRomeumArmorItem;
import net.mcreator.mcsmarmors.item.Underneath_ChampionArmorItem;
import net.mcreator.mcsmarmors.item.TitaniumIngotItem;
import net.mcreator.mcsmarmors.item.TimmyArmorItem;
import net.mcreator.mcsmarmors.item.SworArmorItem;
import net.mcreator.mcsmarmors.item.Super_AlloyedArmorItem;
import net.mcreator.mcsmarmors.item.SteelPlateItem;
import net.mcreator.mcsmarmors.item.Star_ShieldArmorItem;
import net.mcreator.mcsmarmors.item.SoreArmorItem;
import net.mcreator.mcsmarmors.item.ShielArmorItem;
import net.mcreator.mcsmarmors.item.RomeumingotItem;
import net.mcreator.mcsmarmors.item.RomeumPlateItem;
import net.mcreator.mcsmarmors.item.RomeumBookItem;
import net.mcreator.mcsmarmors.item.Redstone_RiotArmorItem;
import net.mcreator.mcsmarmors.item.PetrArmorItem;
import net.mcreator.mcsmarmors.item.Overworld_ChampionArmorItem;
import net.mcreator.mcsmarmors.item.OliviArmorItem;
import net.mcreator.mcsmarmors.item.Nether_ChampionArmorItem;
import net.mcreator.mcsmarmors.item.MagnussArmorItem;
import net.mcreator.mcsmarmors.item.LukaArmorItem;
import net.mcreator.mcsmarmors.item.IvorsenchantmentbookItem;
import net.mcreator.mcsmarmors.item.IvorsArmorItem;
import net.mcreator.mcsmarmors.item.IvoArmorItem;
import net.mcreator.mcsmarmors.item.HeadsettItem;
import net.mcreator.mcsmarmors.item.Golden_appleArmorItem;
import net.mcreator.mcsmarmors.item.Golden_GaliathArmorItem;
import net.mcreator.mcsmarmors.item.GlasshelmetItem;
import net.mcreator.mcsmarmors.item.GabeArmorItem;
import net.mcreator.mcsmarmors.item.EnricheddiamondItem;
import net.mcreator.mcsmarmors.item.Enderman_suitArmorItem;
import net.mcreator.mcsmarmors.item.EnderArmorItem;
import net.mcreator.mcsmarmors.item.End_ChampionArmorItem;
import net.mcreator.mcsmarmors.item.EnchanteddiamondItem;
import net.mcreator.mcsmarmors.item.EnchantedRomeumArmorItem;
import net.mcreator.mcsmarmors.item.EllieArmorItem;
import net.mcreator.mcsmarmors.item.DragonsbaneArmorItem;
import net.mcreator.mcsmarmors.item.AxeeArmorItem;
import net.mcreator.mcsmarmors.item.Armor_number_7ArmorItem;
import net.mcreator.mcsmarmors.item.Adamantine_ImperviumArmorItem;
import net.mcreator.mcsmarmors.McsmarmorsMod;

public class McsmarmorsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McsmarmorsMod.MODID);
	public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
	public static final RegistryObject<Item> TITANIUM_ORE = block(McsmarmorsModBlocks.TITANIUM_ORE, McsmarmorsModTabs.TAB_OLIVERS_ARMOR);
	public static final RegistryObject<Item> TITANIUMALLOY_ARMOR_HELMET = REGISTRY.register("titaniumalloy_armor_helmet",
			() -> new IvorsArmorItem.Helmet());
	public static final RegistryObject<Item> TITANIUMALLOY_ARMOR_CHESTPLATE = REGISTRY.register("titaniumalloy_armor_chestplate",
			() -> new IvorsArmorItem.Chestplate());
	public static final RegistryObject<Item> TITANIUMALLOY_ARMOR_LEGGINGS = REGISTRY.register("titaniumalloy_armor_leggings",
			() -> new IvorsArmorItem.Leggings());
	public static final RegistryObject<Item> TITANIUMALLOY_ARMOR_BOOTS = REGISTRY.register("titaniumalloy_armor_boots",
			() -> new IvorsArmorItem.Boots());
	public static final RegistryObject<Item> ENCHANTED_DIAMOND = REGISTRY.register("enchanted_diamond", () -> new EnchanteddiamondItem());
	public static final RegistryObject<Item> CUT_DIAMOND = REGISTRY.register("cut_diamond", () -> new EnricheddiamondItem());
	public static final RegistryObject<Item> TITANIUM_PLATE = REGISTRY.register("titanium_plate", () -> new SteelPlateItem());
	public static final RegistryObject<Item> SUPER_ALLOYED_ARMOR_HELMET = REGISTRY.register("super_alloyed_armor_helmet",
			() -> new Super_AlloyedArmorItem.Helmet());
	public static final RegistryObject<Item> SUPER_ALLOYED_ARMOR_CHESTPLATE = REGISTRY.register("super_alloyed_armor_chestplate",
			() -> new Super_AlloyedArmorItem.Chestplate());
	public static final RegistryObject<Item> SUPER_ALLOYED_ARMOR_LEGGINGS = REGISTRY.register("super_alloyed_armor_leggings",
			() -> new Super_AlloyedArmorItem.Leggings());
	public static final RegistryObject<Item> SUPER_ALLOYED_ARMOR_BOOTS = REGISTRY.register("super_alloyed_armor_boots",
			() -> new Super_AlloyedArmorItem.Boots());
	public static final RegistryObject<Item> ADAMANTINE_IMPERVIUM_CHESTPLATE = REGISTRY.register("adamantine_impervium_chestplate",
			() -> new Adamantine_ImperviumArmorItem.Chestplate());
	public static final RegistryObject<Item> ADAMANTINE_IMPERVIUM_LEGGINGS = REGISTRY.register("adamantine_impervium_leggings",
			() -> new Adamantine_ImperviumArmorItem.Leggings());
	public static final RegistryObject<Item> ADAMANTINE_IMPERVIUM_BOOTS = REGISTRY.register("adamantine_impervium_boots",
			() -> new Adamantine_ImperviumArmorItem.Boots());
	public static final RegistryObject<Item> STAR_SHIELD_CHESTPLATE = REGISTRY.register("star_shield_chestplate",
			() -> new Star_ShieldArmorItem.Chestplate());
	public static final RegistryObject<Item> STAR_SHIELD_LEGGINGS = REGISTRY.register("star_shield_leggings",
			() -> new Star_ShieldArmorItem.Leggings());
	public static final RegistryObject<Item> STAR_SHIELD_BOOTS = REGISTRY.register("star_shield_boots", () -> new Star_ShieldArmorItem.Boots());
	public static final RegistryObject<Item> GOLDEN_GALIATH_CHESTPLATE = REGISTRY.register("golden_galiath_chestplate",
			() -> new Golden_GaliathArmorItem.Chestplate());
	public static final RegistryObject<Item> GOLDEN_GALIATH_LEGGINGS = REGISTRY.register("golden_galiath_leggings",
			() -> new Golden_GaliathArmorItem.Leggings());
	public static final RegistryObject<Item> GOLDEN_GALIATH_BOOTS = REGISTRY.register("golden_galiath_boots",
			() -> new Golden_GaliathArmorItem.Boots());
	public static final RegistryObject<Item> REDSTONE_RIOT_CHESTPLATE = REGISTRY.register("redstone_riot_chestplate",
			() -> new Redstone_RiotArmorItem.Chestplate());
	public static final RegistryObject<Item> REDSTONE_RIOT_LEGGINGS = REGISTRY.register("redstone_riot_leggings",
			() -> new Redstone_RiotArmorItem.Leggings());
	public static final RegistryObject<Item> REDSTONE_RIOT_BOOTS = REGISTRY.register("redstone_riot_boots", () -> new Redstone_RiotArmorItem.Boots());
	public static final RegistryObject<Item> DRAGONSBANE_CHESTPLATE = REGISTRY.register("dragonsbane_chestplate",
			() -> new DragonsbaneArmorItem.Chestplate());
	public static final RegistryObject<Item> DRAGONSBANE_LEGGINGS = REGISTRY.register("dragonsbane_leggings",
			() -> new DragonsbaneArmorItem.Leggings());
	public static final RegistryObject<Item> DRAGONSBANE_BOOTS = REGISTRY.register("dragonsbane_boots", () -> new DragonsbaneArmorItem.Boots());
	public static final RegistryObject<Item> ENDER_DEFENDER_CHESTPLATE = REGISTRY.register("ender_defender_chestplate",
			() -> new EnderArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDER_DEFENDER_LEGGINGS = REGISTRY.register("ender_defender_leggings",
			() -> new EnderArmorItem.Leggings());
	public static final RegistryObject<Item> ENDER_DEFENDER_BOOTS = REGISTRY.register("ender_defender_boots", () -> new EnderArmorItem.Boots());
	public static final RegistryObject<Item> SHIELD_OF_INFINITY_CHESTPLATE = REGISTRY.register("shield_of_infinity_chestplate",
			() -> new ShielArmorItem.Chestplate());
	public static final RegistryObject<Item> SHIELD_OF_INFINITY_LEGGINGS = REGISTRY.register("shield_of_infinity_leggings",
			() -> new ShielArmorItem.Leggings());
	public static final RegistryObject<Item> SHIELD_OF_INFINITY_BOOTS = REGISTRY.register("shield_of_infinity_boots",
			() -> new ShielArmorItem.Boots());
	public static final RegistryObject<Item> SWORDBREAKER_CHESTPLATE = REGISTRY.register("swordbreaker_chestplate",
			() -> new SworArmorItem.Chestplate());
	public static final RegistryObject<Item> SWORDBREAKER_LEGGINGS = REGISTRY.register("swordbreaker_leggings", () -> new SworArmorItem.Leggings());
	public static final RegistryObject<Item> SWORDBREAKER_BOOTS = REGISTRY.register("swordbreaker_boots", () -> new SworArmorItem.Boots());
	public static final RegistryObject<Item> MAGNUS_CHESTPLATE = REGISTRY.register("magnus_chestplate", () -> new MagnussArmorItem.Chestplate());
	public static final RegistryObject<Item> MAGNUS_LEGGINGS = REGISTRY.register("magnus_leggings", () -> new MagnussArmorItem.Leggings());
	public static final RegistryObject<Item> MAGNUS_BOOTS = REGISTRY.register("magnus_boots", () -> new MagnussArmorItem.Boots());
	public static final RegistryObject<Item> SOREN_HELMET = REGISTRY.register("soren_helmet", () -> new SoreArmorItem.Helmet());
	public static final RegistryObject<Item> SOREN_CHESTPLATE = REGISTRY.register("soren_chestplate", () -> new SoreArmorItem.Chestplate());
	public static final RegistryObject<Item> SOREN_LEGGINGS = REGISTRY.register("soren_leggings", () -> new SoreArmorItem.Leggings());
	public static final RegistryObject<Item> SOREN_BOOTS = REGISTRY.register("soren_boots", () -> new SoreArmorItem.Boots());
	public static final RegistryObject<Item> GABRIEL_HELMET = REGISTRY.register("gabriel_helmet", () -> new GabeArmorItem.Helmet());
	public static final RegistryObject<Item> GABRIEL_CHESTPLATE = REGISTRY.register("gabriel_chestplate", () -> new GabeArmorItem.Chestplate());
	public static final RegistryObject<Item> GABRIEL_LEGGINGS = REGISTRY.register("gabriel_leggings", () -> new GabeArmorItem.Leggings());
	public static final RegistryObject<Item> GABRIEL_BOOTS = REGISTRY.register("gabriel_boots", () -> new GabeArmorItem.Boots());
	public static final RegistryObject<Item> IVOR_HELMET = REGISTRY.register("ivor_helmet", () -> new IvoArmorItem.Helmet());
	public static final RegistryObject<Item> IVOR_CHESTPLATE = REGISTRY.register("ivor_chestplate", () -> new IvoArmorItem.Chestplate());
	public static final RegistryObject<Item> IVOR_LEGGINGS = REGISTRY.register("ivor_leggings", () -> new IvoArmorItem.Leggings());
	public static final RegistryObject<Item> IVOR_BOOTS = REGISTRY.register("ivor_boots", () -> new IvoArmorItem.Boots());
	public static final RegistryObject<Item> ELLEGAARD_HELMET = REGISTRY.register("ellegaard_helmet", () -> new EllieArmorItem.Helmet());
	public static final RegistryObject<Item> ELLEGAARD_CHESTPLATE = REGISTRY.register("ellegaard_chestplate", () -> new EllieArmorItem.Chestplate());
	public static final RegistryObject<Item> ELLEGAARD_LEGGINGS = REGISTRY.register("ellegaard_leggings", () -> new EllieArmorItem.Leggings());
	public static final RegistryObject<Item> ELLEGAARD_BOOTS = REGISTRY.register("ellegaard_boots", () -> new EllieArmorItem.Boots());
	public static final RegistryObject<Item> LUKAS_HELMET = REGISTRY.register("lukas_helmet", () -> new LukaArmorItem.Helmet());
	public static final RegistryObject<Item> LUKAS_CHESTPLATE = REGISTRY.register("lukas_chestplate", () -> new LukaArmorItem.Chestplate());
	public static final RegistryObject<Item> LUKAS_LEGGINGS = REGISTRY.register("lukas_leggings", () -> new LukaArmorItem.Leggings());
	public static final RegistryObject<Item> LUKAS_BOOTS = REGISTRY.register("lukas_boots", () -> new LukaArmorItem.Boots());
	public static final RegistryObject<Item> PETRA_HELMET = REGISTRY.register("petra_helmet", () -> new PetrArmorItem.Helmet());
	public static final RegistryObject<Item> PETRA_CHESTPLATE = REGISTRY.register("petra_chestplate", () -> new PetrArmorItem.Chestplate());
	public static final RegistryObject<Item> PETRA_LEGGINGS = REGISTRY.register("petra_leggings", () -> new PetrArmorItem.Leggings());
	public static final RegistryObject<Item> PETRA_BOOTS = REGISTRY.register("petra_boots", () -> new PetrArmorItem.Boots());
	public static final RegistryObject<Item> OLIVIA_HELMET = REGISTRY.register("olivia_helmet", () -> new OliviArmorItem.Helmet());
	public static final RegistryObject<Item> OLIVIA_CHESTPLATE = REGISTRY.register("olivia_chestplate", () -> new OliviArmorItem.Chestplate());
	public static final RegistryObject<Item> OLIVIA_LEGGINGS = REGISTRY.register("olivia_leggings", () -> new OliviArmorItem.Leggings());
	public static final RegistryObject<Item> OLIVIA_BOOTS = REGISTRY.register("olivia_boots", () -> new OliviArmorItem.Boots());
	public static final RegistryObject<Item> AXEL_CHESTPLATE = REGISTRY.register("axel_chestplate", () -> new AxeeArmorItem.Chestplate());
	public static final RegistryObject<Item> AXEL_LEGGINGS = REGISTRY.register("axel_leggings", () -> new AxeeArmorItem.Leggings());
	public static final RegistryObject<Item> AXEL_BOOTS = REGISTRY.register("axel_boots", () -> new AxeeArmorItem.Boots());
	public static final RegistryObject<Item> TIM_HELMET = REGISTRY.register("tim_helmet", () -> new TimmyArmorItem.Helmet());
	public static final RegistryObject<Item> TIM_CHESTPLATE = REGISTRY.register("tim_chestplate", () -> new TimmyArmorItem.Chestplate());
	public static final RegistryObject<Item> TIM_LEGGINGS = REGISTRY.register("tim_leggings", () -> new TimmyArmorItem.Leggings());
	public static final RegistryObject<Item> TIM_BOOTS = REGISTRY.register("tim_boots", () -> new TimmyArmorItem.Boots());
	public static final RegistryObject<Item> HEADSET_HELMET = REGISTRY.register("headset_helmet", () -> new HeadsettItem.Helmet());
	public static final RegistryObject<Item> GLASSHELMET_HELMET = REGISTRY.register("glasshelmet_helmet", () -> new GlasshelmetItem.Helmet());
	public static final RegistryObject<Item> WHITE_PUMPKIN_HELMET = REGISTRY.register("white_pumpkin_helmet", () -> new WhitepumpArmorItem.Helmet());
	public static final RegistryObject<Item> WHITE_PUMPKIN_CHESTPLATE = REGISTRY.register("white_pumpkin_chestplate",
			() -> new WhitepumpArmorItem.Chestplate());
	public static final RegistryObject<Item> WHITE_PUMPKIN_LEGGINGS = REGISTRY.register("white_pumpkin_leggings",
			() -> new WhitepumpArmorItem.Leggings());
	public static final RegistryObject<Item> WHITE_PUMPKIN_BOOTS = REGISTRY.register("white_pumpkin_boots", () -> new WhitepumpArmorItem.Boots());
	public static final RegistryObject<Item> IVORS_ENCHANTMENT_BOOK = REGISTRY.register("ivors_enchantment_book",
			() -> new IvorsenchantmentbookItem());
	public static final RegistryObject<Item> ROMEUMINGOT = REGISTRY.register("romeumingot", () -> new RomeumingotItem());
	public static final RegistryObject<Item> ROMEUM_PLATE = REGISTRY.register("romeum_plate", () -> new RomeumPlateItem());
	public static final RegistryObject<Item> ROMEUMORE = block(McsmarmorsModBlocks.ROMEUMORE, McsmarmorsModTabs.TAB_OLIVERS_ARMOR);
	public static final RegistryObject<Item> UNENCHANTED_ROMEUM_ARMOR_HELMET = REGISTRY.register("unenchanted_romeum_armor_helmet",
			() -> new UnenchantedRomeumArmorItem.Helmet());
	public static final RegistryObject<Item> UNENCHANTED_ROMEUM_ARMOR_CHESTPLATE = REGISTRY.register("unenchanted_romeum_armor_chestplate",
			() -> new UnenchantedRomeumArmorItem.Chestplate());
	public static final RegistryObject<Item> UNENCHANTED_ROMEUM_ARMOR_LEGGINGS = REGISTRY.register("unenchanted_romeum_armor_leggings",
			() -> new UnenchantedRomeumArmorItem.Leggings());
	public static final RegistryObject<Item> UNENCHANTED_ROMEUM_ARMOR_BOOTS = REGISTRY.register("unenchanted_romeum_armor_boots",
			() -> new UnenchantedRomeumArmorItem.Boots());
	public static final RegistryObject<Item> ROMEUM_BOOK = REGISTRY.register("romeum_book", () -> new RomeumBookItem());
	public static final RegistryObject<Item> ENCHANTED_ROMEUM_ARMOR_HELMET = REGISTRY.register("enchanted_romeum_armor_helmet",
			() -> new EnchantedRomeumArmorItem.Helmet());
	public static final RegistryObject<Item> ENCHANTED_ROMEUM_ARMOR_CHESTPLATE = REGISTRY.register("enchanted_romeum_armor_chestplate",
			() -> new EnchantedRomeumArmorItem.Chestplate());
	public static final RegistryObject<Item> ENCHANTED_ROMEUM_ARMOR_LEGGINGS = REGISTRY.register("enchanted_romeum_armor_leggings",
			() -> new EnchantedRomeumArmorItem.Leggings());
	public static final RegistryObject<Item> ENCHANTED_ROMEUM_ARMOR_BOOTS = REGISTRY.register("enchanted_romeum_armor_boots",
			() -> new EnchantedRomeumArmorItem.Boots());
	public static final RegistryObject<Item> ENDERMAN_SUIT_HELMET = REGISTRY.register("enderman_suit_helmet",
			() -> new Enderman_suitArmorItem.Helmet());
	public static final RegistryObject<Item> ENDERMAN_SUIT_CHESTPLATE = REGISTRY.register("enderman_suit_chestplate",
			() -> new Enderman_suitArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDERMAN_SUIT_LEGGINGS = REGISTRY.register("enderman_suit_leggings",
			() -> new Enderman_suitArmorItem.Leggings());
	public static final RegistryObject<Item> ENDERMAN_SUIT_BOOTS = REGISTRY.register("enderman_suit_boots", () -> new Enderman_suitArmorItem.Boots());
	public static final RegistryObject<Item> GOLDEN_APPLE_CHESTPLATE = REGISTRY.register("golden_apple_chestplate",
			() -> new Golden_appleArmorItem.Chestplate());
	public static final RegistryObject<Item> GOLDEN_APPLE_LEGGINGS = REGISTRY.register("golden_apple_leggings",
			() -> new Golden_appleArmorItem.Leggings());
	public static final RegistryObject<Item> GOLDEN_APPLE_BOOTS = REGISTRY.register("golden_apple_boots", () -> new Golden_appleArmorItem.Boots());
	public static final RegistryObject<Item> ARMOR_NUMBER_7_CHESTPLATE = REGISTRY.register("armor_number_7_chestplate",
			() -> new Armor_number_7ArmorItem.Chestplate());
	public static final RegistryObject<Item> ARMOR_NUMBER_7_LEGGINGS = REGISTRY.register("armor_number_7_leggings",
			() -> new Armor_number_7ArmorItem.Leggings());
	public static final RegistryObject<Item> ARMOR_NUMBER_7_BOOTS = REGISTRY.register("armor_number_7_boots",
			() -> new Armor_number_7ArmorItem.Boots());
	public static final RegistryObject<Item> END_CHAMPION_CHESTPLATE = REGISTRY.register("end_champion_chestplate",
			() -> new End_ChampionArmorItem.Chestplate());
	public static final RegistryObject<Item> END_CHAMPION_LEGGINGS = REGISTRY.register("end_champion_leggings",
			() -> new End_ChampionArmorItem.Leggings());
	public static final RegistryObject<Item> END_CHAMPION_BOOTS = REGISTRY.register("end_champion_boots", () -> new End_ChampionArmorItem.Boots());
	public static final RegistryObject<Item> UNDERNEATH_CHAMPION_HELMET = REGISTRY.register("underneath_champion_helmet",
			() -> new Underneath_ChampionArmorItem.Helmet());
	public static final RegistryObject<Item> UNDERNEATH_CHAMPION_CHESTPLATE = REGISTRY.register("underneath_champion_chestplate",
			() -> new Underneath_ChampionArmorItem.Chestplate());
	public static final RegistryObject<Item> UNDERNEATH_CHAMPION_LEGGINGS = REGISTRY.register("underneath_champion_leggings",
			() -> new Underneath_ChampionArmorItem.Leggings());
	public static final RegistryObject<Item> UNDERNEATH_CHAMPION_BOOTS = REGISTRY.register("underneath_champion_boots",
			() -> new Underneath_ChampionArmorItem.Boots());
	public static final RegistryObject<Item> OVERWORLD_CHAMPION_CHESTPLATE = REGISTRY.register("overworld_champion_chestplate",
			() -> new Overworld_ChampionArmorItem.Chestplate());
	public static final RegistryObject<Item> OVERWORLD_CHAMPION_LEGGINGS = REGISTRY.register("overworld_champion_leggings",
			() -> new Overworld_ChampionArmorItem.Leggings());
	public static final RegistryObject<Item> OVERWORLD_CHAMPION_BOOTS = REGISTRY.register("overworld_champion_boots",
			() -> new Overworld_ChampionArmorItem.Boots());
	public static final RegistryObject<Item> NETHER_CHAMPION_HELMET = REGISTRY.register("nether_champion_helmet",
			() -> new Nether_ChampionArmorItem.Helmet());
	public static final RegistryObject<Item> NETHER_CHAMPION_CHESTPLATE = REGISTRY.register("nether_champion_chestplate",
			() -> new Nether_ChampionArmorItem.Chestplate());
	public static final RegistryObject<Item> NETHER_CHAMPION_LEGGINGS = REGISTRY.register("nether_champion_leggings",
			() -> new Nether_ChampionArmorItem.Leggings());
	public static final RegistryObject<Item> NETHER_CHAMPION_BOOTS = REGISTRY.register("nether_champion_boots",
			() -> new Nether_ChampionArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
