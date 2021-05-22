package com.ejs.xpsaver;

import com.ejs.xpsaver.registry.ModItems;

import net.fabricmc.api.ModInitializer;

public class ExperienceSaver implements ModInitializer{

	public static final String MOD_ID = "xpsaver";
	
	@Override
	public void onInitialize() {
		ModItems.registerItems();
	}
}