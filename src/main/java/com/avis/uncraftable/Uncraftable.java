package com.avis.uncraftable;

import com.avis.uncraftable.item.ModItemGroup;
import com.avis.uncraftable.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Uncraftable implements ModInitializer {
	public static final String MOD_ID = "uncraftable";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();

		ModItems.registerModItems();
	}
}
