package net.sda.forged_horizon.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    SILVER(200, 5, 1.5f, MiningLevels.IRON, 25, () -> Ingredient.ofItems(ModItems.SILVER_INGOT));

    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantibility;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int itemDurability, float miningSpeed, float attackDamage, int miningLevel, int enchantibility,
                    Supplier<Ingredient> repairIngredient) {
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantibility = enchantibility;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantibility;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
