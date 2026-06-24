package net.sda.forged_horizon.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sda.forged_horizon.ForgedHorizon;

public class ModItems {
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new FabricItemSettings()));

    public static final Item IRON_COAL_MIX = registerItem("iron_coal_mix", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));

    public static final Item SILVER_SWORD = registerItem("silver_sword", new SwordItem(ModToolMaterial.SILVER, 3,
            -2.2f, new FabricItemSettings()));
    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe", new PickaxeItem(ModToolMaterial.SILVER, 2,
            -2.6f, new FabricItemSettings()));
    public static final Item SILVER_AXE = registerItem("silver_axe", new AxeItem(ModToolMaterial.SILVER, 7,
            -2.8f, new FabricItemSettings()));
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel", new ShovelItem(ModToolMaterial.SILVER, 2,
            -2.8f, new FabricItemSettings()));
    public static final Item SILVER_HOE = registerItem("silver_hoe", new HoeItem(ModToolMaterial.SILVER, 1,
            1f, new FabricItemSettings()));

    public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterial.STEEL, 4, -3f,
            new FabricItemSettings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new PickaxeItem(ModToolMaterial.STEEL, 2, -2.8f,
            new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe", new AxeItem(ModToolMaterial.STEEL, 7, -3.1f,
            new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new ShovelItem(ModToolMaterial.STEEL, 2, -3f,
            new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new HoeItem(ModToolMaterial.STEEL, -3, 0f,
            new FabricItemSettings()));

    public static final Item SILVER_HELMET = registerItem("silver_helmet", new ArmorItem(ModArmorMaterial.SILVER, ArmorItem.Type.HELMET,
                new FabricItemSettings()));
    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate", new ArmorItem(ModArmorMaterial.SILVER,
                ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings", new ArmorItem(ModArmorMaterial.SILVER, ArmorItem.Type.LEGGINGS,
                new FabricItemSettings()));
    public static final Item SILVER_BOOTS = registerItem("silver_boots", new ArmorItem(ModArmorMaterial.SILVER, ArmorItem.Type.BOOTS,
                new FabricItemSettings()));

    public static final Item STEEL_HELMET = registerItem("steel_helmet", new ArmorItem(ModArmorMaterial.STEEL, ArmorItem.Type.HELMET,
                new FabricItemSettings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", new ArmorItem(ModArmorMaterial.STEEL,
                ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", new ArmorItem(ModArmorMaterial.STEEL, ArmorItem.Type.LEGGINGS,
                new FabricItemSettings()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots", new ArmorItem(ModArmorMaterial.STEEL, ArmorItem.Type.BOOTS,
                new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ForgedHorizon.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ForgedHorizon.LOGGER.info("Registering Mod Items for " + ForgedHorizon.MOD_ID);
    }
}
