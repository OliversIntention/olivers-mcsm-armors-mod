
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcsmarmors.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mcsmarmors.block.TitaniumOreBlock;
import net.mcreator.mcsmarmors.block.RomeumoreBlock;
import net.mcreator.mcsmarmors.McsmarmorsMod;

public class McsmarmorsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McsmarmorsMod.MODID);
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> ROMEUMORE = REGISTRY.register("romeumore", () -> new RomeumoreBlock());
}
