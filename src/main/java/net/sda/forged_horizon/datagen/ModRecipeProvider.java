package net.sda.forged_horizon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.sda.forged_horizon.ForgedHorizon;
import net.sda.forged_horizon.block.ModBlocks;
import net.sda.forged_horizon.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILVER_SMELTABLE = List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE);

    private void offerPickaxeRecipe(Consumer<RecipeJsonProvider> exporter, Item result, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result)
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .input('M', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
    }
    private void offerAxeRecipe(Consumer<RecipeJsonProvider> exporter, Item result, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result)
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .input('M', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result)
                .pattern(" MM")
                .pattern(" SM")
                .pattern(" S ")
                .input('M', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(ForgedHorizon.MOD_ID,
                        Registries.ITEM.getId(result).getPath() + "_mirror"));
    }
    private void offerSwordRecipe(Consumer<RecipeJsonProvider> exporter, Item result, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result)
                .pattern("M")
                .pattern("M")
                .pattern("S")
                .input('M', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
    }
    private void offerShovelRecipe(Consumer<RecipeJsonProvider> exporter, Item result, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result)
                .pattern("M")
                .pattern("S")
                .pattern("S")
                .input('M', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
    }
    private void offerHoeRecipe(Consumer<RecipeJsonProvider> exporter, Item result, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result)
                .pattern("MM")
                .pattern(" S")
                .pattern(" S")
                .input('M', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result)
                .pattern("MM")
                .pattern("S ")
                .pattern("S ")
                .input('M', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(ForgedHorizon.MOD_ID,
                        Registries.ITEM.getId(result).getPath() + "_mirror"));
    }
    private void offerHelmetRecipe(Consumer<RecipeJsonProvider> exporter, Item result, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result)
                .pattern("MMM")
                .pattern("M M")
                .input('M', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
    }
    private void offerChestplateRecipe(Consumer<RecipeJsonProvider> exporter, Item result, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result)
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
    }
    private void offerLeggingsRecipe(Consumer<RecipeJsonProvider> exporter, Item result, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result)
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .input('M', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
    }
    private void offerBootsRecipe(Consumer<RecipeJsonProvider> exporter, Item result, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result)
                .pattern("M M")
                .pattern("M M")
                .input('M', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
    }

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, SILVER_SMELTABLE, RecipeCategory.MISC, ModItems.SILVER_INGOT, 1f, 200, "silver");
        offerBlasting(exporter, SILVER_SMELTABLE, RecipeCategory.MISC, ModItems.SILVER_INGOT, 1f, 100, "silver");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER_INGOT,
                RecipeCategory.DECORATIONS, ModBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_SILVER,
                RecipeCategory.DECORATIONS, ModBlocks.RAW_SILVER_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_INGOT)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.SILVER_NUGGET)
                .criterion(hasItem(ModItems.SILVER_NUGGET),
                        conditionsFromItem(ModItems.SILVER_NUGGET))
                .offerTo(exporter,
                        new Identifier(ForgedHorizon.MOD_ID, "silver_ingot_from_nuggets"));

        offerSwordRecipe(exporter, ModItems.SILVER_SWORD, ModItems.SILVER_INGOT);
        offerPickaxeRecipe(exporter, ModItems.SILVER_PICKAXE, ModItems.SILVER_INGOT);
        offerAxeRecipe(exporter, ModItems.SILVER_AXE, ModItems.SILVER_INGOT);
        offerShovelRecipe(exporter, ModItems.SILVER_SHOVEL, ModItems.SILVER_INGOT);
        offerHoeRecipe(exporter, ModItems.SILVER_HOE, ModItems.SILVER_INGOT);

        offerHelmetRecipe(exporter, ModItems.SILVER_HELMET, ModItems.SILVER_INGOT);
        offerChestplateRecipe(exporter, ModItems.SILVER_CHESTPLATE, ModItems.SILVER_INGOT);
        offerLeggingsRecipe(exporter, ModItems.SILVER_LEGGINGS, ModItems.SILVER_INGOT);
        offerBootsRecipe(exporter, ModItems.SILVER_BOOTS, ModItems.SILVER_INGOT);

    }
}
