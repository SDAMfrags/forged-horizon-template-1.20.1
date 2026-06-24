package net.sda.forged_horizon.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sda.forged_horizon.ForgedHorizon;
import net.sda.forged_horizon.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MISC_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(ForgedHorizon.MOD_ID, "misc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.forged_horizon")).icon(() -> new ItemStack(ModItems.RAW_SILVER)).
                    entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.SILVER_NUGGET);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                        entries.add(ModBlocks.RAW_SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_BLOCK);

                        entries.add(ModItems.SILVER_SWORD);
                        entries.add(ModItems.SILVER_PICKAXE);
                        entries.add(ModItems.SILVER_AXE);
                        entries.add(ModItems.SILVER_SHOVEL);
                        entries.add(ModItems.SILVER_HOE);

                        entries.add(ModItems.SILVER_HELMET);
                        entries.add(ModItems.SILVER_CHESTPLATE);
                        entries.add(ModItems.SILVER_LEGGINGS);
                        entries.add(ModItems.SILVER_BOOTS);

                    }).build());

    public static void registerItemGroups() {
        ForgedHorizon.LOGGER.info("Registering Mod Item Groups for " + ForgedHorizon.MOD_ID);
    }
}
