package com.ejs.xpsaver.registry;

import com.ejs.xpsaver.ExperienceSaver;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	public static final XpSaverBlock XPSTORAGE = new XpSaverBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
	public static final BlockItem XPSTORAGEBLOCKITEM = new BlockItem(XPSTORAGE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	
	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(ExperienceSaver.MOD_ID, "xp_storage_table"), XPSTORAGEBLOCKITEM);
		Registry.register(Registry.BLOCK, new Identifier(ExperienceSaver.MOD_ID, "xp_storage_table"), XPSTORAGE);
	}
}
