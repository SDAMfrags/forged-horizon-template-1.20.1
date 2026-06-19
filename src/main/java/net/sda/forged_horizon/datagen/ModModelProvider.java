package net.sda.forged_horizon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.sda.forged_horizon.block.ModBlocks;
import net.sda.forged_horizon.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVER_BOOTS));

    }
}
