package net.nightium;

import net.fabricmc.api.ModInitializer;

import net.nightium.block.ModBlocks;
import net.nightium.item.ModItemGroups;
import net.nightium.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Magicary implements ModInitializer {
	public static final String MOD_ID = "magicary";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}