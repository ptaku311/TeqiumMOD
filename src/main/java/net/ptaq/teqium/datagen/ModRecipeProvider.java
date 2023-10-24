package net.ptaq.teqium.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.block.ModBlocks;
import net.ptaq.teqium.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public static final List<ItemLike> TEQIUM_SMALTABLES = List.of(ModItems.RAW_TEQIUM.get(),
            ModBlocks.TEQIUM_ORE.get(),
            ModBlocks.DEEPSLATE_TEQIUM_ORE.get());
    public static final List<ItemLike> TEQIUM_INGOT = List.of(ModItems.TEQIUM.get(),
            ModBlocks.TEQIUM_BLOCK.get(),
            ModItems.TEQIUM_NUGGET.get());
    public static final List<ItemLike> DIAMOND_NUGGET_SMALTABLES = List.of(ModItems.DIAMOND_NUGGET.get(),
            Items.DIAMOND_AXE, Items.DIAMOND_SWORD, Items.DIAMOND_HOE, Items.DIAMOND_PICKAXE, Items.DIAMOND_CHESTPLATE, Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS, Items.DIAMOND_HELMET, Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND_SHOVEL);
    public static final List<ItemLike> NETHERITE_MIGGET_SMALETABLES = List.of(ModItems.NETHERITE_NUGGET.get(),
            Items.NETHERITE_AXE, Items.NETHERITE_SWORD, Items.NETHERITE_HOE, Items.NETHERITE_PICKAXE, Items.NETHERITE_CHESTPLATE, Items.NETHERITE_LEGGINGS, Items.NETHERITE_BOOTS, Items.NETHERITE_HELMET, Items.NETHERITE_SHOVEL);

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, TEQIUM_SMALTABLES, RecipeCategory.MISC, ModItems.TEQIUM.get(),0.25f,100, "teqium");
        oreSmelting(pWriter, TEQIUM_SMALTABLES, RecipeCategory.MISC, ModItems.TEQIUM.get(),0.25f,100, "teqium");
        oreBlasting(pWriter, DIAMOND_NUGGET_SMALTABLES, RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(),0.25f,100, "diamond_nugget");
        oreSmelting(pWriter, DIAMOND_NUGGET_SMALTABLES, RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(),0.25f,100, "diamond_nugget");
        oreBlasting(pWriter, NETHERITE_MIGGET_SMALETABLES, RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(),0.25f,100, "diamond_nugget");
        oreSmelting(pWriter, NETHERITE_MIGGET_SMALETABLES, RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(),0.25f,100, "diamond_nugget");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TEQIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TEQIUM.get())
                .unlockedBy(getHasName(ModItems.TEQIUM.get()), has(ModItems.TEQIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.DIAMOND_NUGGET.get())
                .unlockedBy(getHasName(ModItems.DIAMOND_NUGGET.get()), has(ModItems.DIAMOND_NUGGET.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.NETHERITE_INGOT)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.NETHERITE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NETHERITE_NUGGET.get()), has(ModItems.NETHERITE_NUGGET.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COPPER_INGOT)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.COPPER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.COPPER_NUGGET.get()), has(ModItems.COPPER_NUGGET.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.TEQIUM.get(),9)
                .requires(ModBlocks.TEQIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TEQIUM_BLOCK.get()), has(ModBlocks.TEQIUM_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.NETHERITE_NUGGET.get(),9)
                .requires(Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.COPPER_NUGGET.get(),9)
                .requires(Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.DIAMOND_NUGGET.get(),9)
                .requires(Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.TEQIUM_NUGGET.get(),9)
                .requires(ModItems.TEQIUM.get())
                .unlockedBy(getHasName(ModItems.TEQIUM.get()), has(ModItems.TEQIUM.get()))
                .save(pWriter);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Teqium.MOD_ID + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pUnpackedCategory, ItemLike pUnpacked, RecipeCategory pPackedCategory, ItemLike pPacked) {
        nineBlockStorageRecipes(pFinishedRecipeConsumer, pUnpackedCategory, pUnpacked, pPackedCategory, pPacked, getSimpleRecipeName(pPacked), (String)null, getSimpleRecipeName(pUnpacked), (String)null);
    }
}
