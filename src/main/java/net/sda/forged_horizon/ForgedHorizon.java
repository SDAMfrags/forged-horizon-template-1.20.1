package net.sda.forged_horizon;

import net.fabricmc.api.ModInitializer;

import net.sda.forged_horizon.block.ModBlocks;
import net.sda.forged_horizon.item.ModItemGroups;
import net.sda.forged_horizon.item.ModItems;
import net.sda.forged_horizon.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForgedHorizon implements ModInitializer {
	public static final String MOD_ID = "forged_horizon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();

		ModWorldGeneration.generateModWorldGen();
	}
}