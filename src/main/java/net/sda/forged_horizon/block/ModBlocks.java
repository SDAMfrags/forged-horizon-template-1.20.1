package net.sda.forged_horizon.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.sda.forged_horizon.ForgedHorizon;

public class ModBlocks {
    public static final Block SILVER_ORE = registerBlock("silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE),
            UniformIntProvider.create(1,4)));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE), UniformIntProvider.create(1,4)));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ForgedHorizon.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ForgedHorizon.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ForgedHorizon.LOGGER.info("Registering Mod Blocks for " + ForgedHorizon.MOD_ID);
    }
}
