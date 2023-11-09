package net.ptaq.teqium.datagen;

import com.mojang.datafixers.types.templates.Tag;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.block.ModBlocks;
import net.ptaq.teqium.item.ModItems;

import javax.swing.text.html.HTML;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public static final List<ItemLike> TEQIUM_SMALTABLES = List.of(ModItems.RAW_TEQIUM.get(),
            ModBlocks.TEQIUM_ORE.get(),
            ModBlocks.DEEPSLATE_TEQIUM_ORE.get());
    public static final List<ItemLike> DIAMOND_NUGGET_SMALTABLES = List.of(
            Items.DIAMOND_AXE, Items.DIAMOND_SWORD, Items.DIAMOND_HOE, Items.DIAMOND_PICKAXE, Items.DIAMOND_CHESTPLATE,
            Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS, Items.DIAMOND_HELMET, Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND_SHOVEL,
            ModItems.DIAMOND_DAGGER.get(), ModItems.DIAMOND_BIG_SWORD.get(), ModItems.DIAMOND_MACE.get(), ModItems.DIAMOND_RAPIER.get());
    public static final List<ItemLike> NETHERITE_NUGGET_SMALETABLES = List.of(
            Items.NETHERITE_AXE, Items.NETHERITE_SWORD, Items.NETHERITE_HOE, Items.NETHERITE_PICKAXE, Items.NETHERITE_CHESTPLATE,
            Items.NETHERITE_LEGGINGS, Items.NETHERITE_BOOTS, Items.NETHERITE_HELMET, Items.NETHERITE_SHOVEL,
            ModItems.NETHERITE_DAGGER.get(), ModItems.NETHERITE_BIG_SWORD.get(), ModItems.NETHERITE_MACE.get(), ModItems.NETHERITE_RAPIER.get());
    public static final List<ItemLike> COPPER_NUGGET_SMALETABLES = List.of(
            ModItems.COPPER_HELMET.get(), ModItems.COPPER_CHESTPLATE.get(), ModItems.COPPER_LEGGINGS.get(), ModItems.COPPER_BOOTS.get(),
            ModItems.COPPER_AXE.get(), ModItems.COPPER_SWORD.get(), ModItems.COPPER_PICKAXE.get(), ModItems.COPPER_SHOVEL.get(), ModItems.COPPER_HOE.get(),
            ModItems.COPPER_DAGGER.get(), ModItems.COPPER_BIG_SWORD.get(), ModItems.COPPER_MACE.get(), ModItems.COPPER_RAPIER.get());
    public static final List<ItemLike> TEQIUM_NUGGET_SMALETABLES = List.of(
            ModItems.TEQIUM_HELMET.get(), ModItems.TEQIUM_CHESTPLATE.get(), ModItems.TEQIUM_LEGGINGS.get(), ModItems.TEQIUM_BOOTS.get(),
            ModItems.TEQIUM_AXE.get(),ModItems.TEQIUM_PICKAXE.get(), ModItems.TEQIUM_SWORD.get(), ModItems.TEQIUM_SHOVEL.get(), ModItems.TEQIUM_HOE.get(),
            ModItems.TEQIUM_DAGGER.get(), ModItems.TEQIUM_BIG_SWORD.get(), ModItems.TEQIUM_MACE.get(), ModItems.TEQIUM_RAPIER.get());
    public static final List<ItemLike> IRON_NUGGET_SMALTABLES = List.of(
            ModItems.IRON_DAGGER.get(), ModItems.IRON_BIG_SWORD.get(), ModItems.IRON_MACE.get(), ModItems.IRON_RAPIER.get());
    public static final List<ItemLike> GOLD_NUGGET_SMALTABLES = List.of(
            ModItems.GOLDEN_DAGGER.get(), ModItems.GOLDEN_BIG_SWORD.get(), ModItems.GOLDEN_MACE.get(), ModItems.GOLDEN_RAPIER.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }
//Smelting/Blasting
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, TEQIUM_SMALTABLES, RecipeCategory.MISC, ModItems.TEQIUM.get(),0.25f,100, "teqium");
        oreSmelting(pWriter, TEQIUM_SMALTABLES, RecipeCategory.MISC, ModItems.TEQIUM.get(),0.25f,100, "teqium");
        oreBlasting(pWriter, DIAMOND_NUGGET_SMALTABLES, RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(),0.25f,100, "diamond_nugget");
        oreSmelting(pWriter, DIAMOND_NUGGET_SMALTABLES, RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(),0.25f,100, "diamond_nugget");
        oreBlasting(pWriter, NETHERITE_NUGGET_SMALETABLES, RecipeCategory.MISC, ModItems.NETHERITE_NUGGET.get(),0.25f,100, "netherite_nugget");
        oreSmelting(pWriter, NETHERITE_NUGGET_SMALETABLES, RecipeCategory.MISC, ModItems.NETHERITE_NUGGET.get(),0.25f,100, "netherite_nugget");
        oreBlasting(pWriter, COPPER_NUGGET_SMALETABLES, RecipeCategory.MISC, ModItems.COPPER_NUGGET.get(),0.25f,100, "copper_nugget");
        oreSmelting(pWriter, COPPER_NUGGET_SMALETABLES, RecipeCategory.MISC, ModItems.COPPER_NUGGET.get(),0.25f,100, "copper_nugget");
        oreBlasting(pWriter, TEQIUM_NUGGET_SMALETABLES, RecipeCategory.MISC, ModItems.TEQIUM_NUGGET.get(),0.25f,100, "copper_nugget");
        oreSmelting(pWriter, TEQIUM_NUGGET_SMALETABLES, RecipeCategory.MISC, ModItems.TEQIUM_NUGGET.get(),0.25f,100, "copper_nugget");
        oreBlasting(pWriter, IRON_NUGGET_SMALTABLES, RecipeCategory.MISC, Items.IRON_NUGGET,0.25f,100, "iron_nugget1");
        oreSmelting(pWriter, IRON_NUGGET_SMALTABLES, RecipeCategory.MISC, Items.IRON_NUGGET,0.25f,100, "iron_nugget1");
        oreBlasting(pWriter, GOLD_NUGGET_SMALTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET,0.25f,100, "gold_nugget1");
        oreSmelting(pWriter, GOLD_NUGGET_SMALTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET,0.25f,100, "gold_nugget1");

        TeqiumSmithing(pWriter, Items.NETHERITE_HELMET, RecipeCategory.MISC, ModItems.TEQIUM_HELMET.get());
        TeqiumSmithing(pWriter, Items.NETHERITE_CHESTPLATE, RecipeCategory.MISC, ModItems.TEQIUM_CHESTPLATE.get());
        TeqiumSmithing(pWriter, Items.NETHERITE_LEGGINGS, RecipeCategory.MISC, ModItems.TEQIUM_LEGGINGS.get());
        TeqiumSmithing(pWriter, Items.NETHERITE_BOOTS, RecipeCategory.MISC, ModItems.TEQIUM_BOOTS.get());

        TeqiumSmithing(pWriter, Items.NETHERITE_SWORD, RecipeCategory.MISC, ModItems.TEQIUM_SWORD.get());
        TeqiumSmithing(pWriter, Items.NETHERITE_AXE, RecipeCategory.MISC, ModItems.TEQIUM_AXE.get());
        TeqiumSmithing(pWriter, Items.NETHERITE_SHOVEL, RecipeCategory.MISC, ModItems.TEQIUM_SHOVEL.get());
        TeqiumSmithing(pWriter, Items.NETHERITE_HOE, RecipeCategory.MISC, ModItems.TEQIUM_HOE.get());
        TeqiumSmithing(pWriter, Items.NETHERITE_PICKAXE, RecipeCategory.MISC, ModItems.TEQIUM_PICKAXE.get());
        TeqiumSmithing(pWriter, ModItems.NETHERITE_DAGGER.get(), RecipeCategory.MISC, ModItems.TEQIUM_DAGGER.get());
        TeqiumSmithing(pWriter, ModItems.NETHERITE_BIG_SWORD.get(), RecipeCategory.MISC, ModItems.TEQIUM_BIG_SWORD.get());
        TeqiumSmithing(pWriter, ModItems.NETHERITE_MACE.get(), RecipeCategory.MISC, ModItems.TEQIUM_MACE.get());
        TeqiumSmithing(pWriter, ModItems.NETHERITE_RAPIER.get(), RecipeCategory.MISC, ModItems.TEQIUM_RAPIER.get());
        TeqiumSmithing(pWriter, Items.BOW, RecipeCategory.MISC, ModItems.TEQIUMBOW.get());

        netheriteSmithing(pWriter, ModItems.DIAMOND_DAGGER.get(), RecipeCategory.MISC, ModItems.NETHERITE_DAGGER.get());
        netheriteSmithing(pWriter, ModItems.DIAMOND_BIG_SWORD.get(), RecipeCategory.MISC, ModItems.NETHERITE_BIG_SWORD.get());
        netheriteSmithing(pWriter, ModItems.DIAMOND_MACE.get(), RecipeCategory.MISC, ModItems.NETHERITE_MACE.get());
        netheriteSmithing(pWriter, ModItems.DIAMOND_RAPIER.get(), RecipeCategory.MISC, ModItems.NETHERITE_RAPIER.get());

        // Copper tools

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_AXE.get())
                .pattern(" XX")
                .pattern(" AX")
                .pattern(" A ")
                .define('X', Items.COPPER_INGOT)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_PICKAXE.get())
                .pattern("XXX")
                .pattern(" A ")
                .pattern(" A ")
                .define('X', Items.COPPER_INGOT)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_HOE.get())
                .pattern(" XX")
                .pattern(" A ")
                .pattern(" A ")
                .define('X', Items.COPPER_INGOT)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_SWORD.get())
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" A ")
                .define('X', Items.COPPER_INGOT)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_SHOVEL.get())
                .pattern(" X ")
                .pattern(" A ")
                .pattern(" A ")
                .define('X', Items.COPPER_INGOT)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        //Blocks

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TEQIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_TEQIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_TEQIUM.get()), has(ModItems.RAW_TEQIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TEQIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TEQIUM.get())
                .unlockedBy(getHasName(ModItems.TEQIUM.get()), has(ModItems.TEQIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TEQIUM_BRICKS.get(), 8)
                .pattern("   ")
                .pattern("XX ")
                .pattern("XX ")
                .define('X', ModItems.TEQIUM.get())
                .unlockedBy(getHasName(ModItems.TEQIUM.get()), has(ModItems.TEQIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TEQIUM_BRICK_STAIRS.get(), 6)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .define('X', ModBlocks.TEQIUM_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.TEQIUM_BRICKS.get()), has(ModBlocks.TEQIUM_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TEQIUM_BRICK_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("XXX")
                .define('X', ModBlocks.TEQIUM_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.TEQIUM_BRICKS.get()), has(ModBlocks.TEQIUM_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TEQIUM_BRICK_WALL.get(), 6)
                .pattern("   ")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModBlocks.TEQIUM_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.TEQIUM_BRICKS.get()), has(ModBlocks.TEQIUM_BRICKS.get()))
                .save(pWriter);

        // snow bricks

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SNOW_BRICKS.get(), 4)
                .pattern("   ")
                .pattern("XX ")
                .pattern("XX ")
                .define('X', Items.SNOW_BLOCK)
                .unlockedBy(getHasName(Items.SNOW_BLOCK), has(Items.SNOW_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SNOW_BRICK_STAIRS.get(), 6)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .define('X', ModBlocks.SNOW_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.SNOW_BRICKS.get()), has(ModBlocks.SNOW_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SNOW_BRICK_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("XXX")
                .define('X', ModBlocks.SNOW_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.SNOW_BRICKS.get()), has(ModBlocks.SNOW_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SNOW_BRICK_WALL.get(), 6)
                .pattern("   ")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModBlocks.SNOW_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.SNOW_BRICKS.get()), has(ModBlocks.SNOW_BRICKS.get()))
                .save(pWriter);

        //Blue ice

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_ICE_STAIRS.get(), 6)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .define('X', Blocks.BLUE_ICE)
                .unlockedBy(getHasName(Blocks.BLUE_ICE), has(Blocks.BLUE_ICE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_ICE_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("XXX")
                .define('X', Blocks.BLUE_ICE)
                .unlockedBy(getHasName(Blocks.BLUE_ICE), has(Blocks.BLUE_ICE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_ICE_WALL.get(), 6)
                .pattern("   ")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', Blocks.BLUE_ICE)
                .unlockedBy(getHasName(Blocks.BLUE_ICE), has(Blocks.BLUE_ICE))
                .save(pWriter);

        //Packed Ice

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PACKED_ICE_STAIRS.get(), 6)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .define('X', Blocks.PACKED_ICE)
                .unlockedBy(getHasName(Blocks.PACKED_ICE), has(Blocks.PACKED_ICE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PACKED_ICE_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("XXX")
                .define('X', Blocks.PACKED_ICE)
                .unlockedBy(getHasName(Blocks.PACKED_ICE), has(Blocks.PACKED_ICE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PACKED_ICE_WALL.get(), 6)
                .pattern("   ")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', Blocks.PACKED_ICE)
                .unlockedBy(getHasName(Blocks.PACKED_ICE), has(Blocks.PACKED_ICE))
                .save(pWriter);

        //Nuggets

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TEQIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TEQIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TEQIUM_NUGGET.get()), has(ModItems.TEQIUM_NUGGET.get()))
                .save(pWriter, new ResourceLocation("teqium_get"));

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

        //Copper Armor

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .define('X', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .pattern("   ")
                .define('X', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        // Upgrade Template

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TEQIUM_UPGRADE_SMITHING_TEMPLATE.get())
                .pattern("ZAZ")
                .pattern("AXA")
                .pattern("ZAZ")
                .define('X', ModItems.TEQIUM_INGOT.get())
                .define('A', Items.DIAMOND)
                .define('Z', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.TEQIUM_INGOT.get()), has(ModItems.TEQIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TEQIUM_UPGRADE_SMITHING_TEMPLATE.get(),2)
                .pattern("AAA")
                .pattern("AXA")
                .pattern("ZAZ")
                .define('X', ModItems.TEQIUM_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('Z', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.TEQIUM.get()), has(ModItems.TEQIUM.get()))
                .save(pWriter, new ResourceLocation("teqium_upgrade_smithing_template1"));

        //daggers

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_DAGGER.get())
                .pattern("  X")
                .pattern(" A ")
                .pattern("Z  ")
                .define('X', ModItems.COPPER_NUGGET.get())
                .define('A', Items.COPPER_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_DAGGER.get())
                .pattern("  X")
                .pattern(" A ")
                .pattern("Z  ")
                .define('X', Items.IRON_NUGGET)
                .define('A', Items.IRON_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_DAGGER.get())
                .pattern("  X")
                .pattern(" A ")
                .pattern("Z  ")
                .define('X', Items.GOLD_NUGGET)
                .define('A', Items.GOLD_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_DAGGER.get())
                .pattern("  X")
                .pattern(" A ")
                .pattern("Z  ")
                .define('X', ModItems.DIAMOND_NUGGET.get())
                .define('A', Items.DIAMOND)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        //Rapiers

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_RAPIER.get())
                .pattern("  A")
                .pattern(" A ")
                .pattern("Z  ")
                .define('A', Items.COPPER_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_RAPIER.get())
                .pattern("  A")
                .pattern(" A ")
                .pattern("Z  ")
                .define('A', Items.IRON_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_RAPIER.get())
                .pattern("  A")
                .pattern(" A ")
                .pattern("Z  ")
                .define('A', Items.GOLD_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_RAPIER.get())
                .pattern("  A")
                .pattern(" A ")
                .pattern("Z  ")
                .define('A', Items.DIAMOND)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        // Big Swords

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_BIG_SWORD.get())
                .pattern("XAX")
                .pattern("XAX")
                .pattern(" Z ")
                .define('X', ModItems.DIAMOND_NUGGET.get())
                .define('A', Items.DIAMOND)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_BIG_SWORD.get())
                .pattern("XAX")
                .pattern("XAX")
                .pattern(" Z ")
                .define('X', Items.IRON_NUGGET)
                .define('A', Items.IRON_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_BIG_SWORD.get())
                .pattern("XAX")
                .pattern("XAX")
                .pattern(" Z ")
                .define('X', Items.GOLD_NUGGET)
                .define('A', Items.GOLD_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_BIG_SWORD.get())
                .pattern("XAX")
                .pattern("XAX")
                .pattern(" Z ")
                .define('X', ModItems.COPPER_NUGGET.get())
                .define('A', Items.COPPER_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        //Mace

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_MACE.get())
                .pattern("XAX")
                .pattern("XZX")
                .pattern(" Z ")
                .define('X', ModItems.COPPER_NUGGET.get())
                .define('A', Items.COPPER_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_MACE.get())
                .pattern("XAX")
                .pattern("XZX")
                .pattern(" Z ")
                .define('X', Items.GOLD_NUGGET)
                .define('A', Items.GOLD_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_MACE.get())
                .pattern("XAX")
                .pattern("XZX")
                .pattern(" Z ")
                .define('X', Items.IRON_NUGGET)
                .define('A', Items.IRON_INGOT)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_MACE.get())
                .pattern("XAX")
                .pattern("XZX")
                .pattern(" Z ")
                .define('X', ModItems.DIAMOND_NUGGET.get())
                .define('A', Items.DIAMOND)
                .define('Z', Items.STICK)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.RAW_TEQIUM.get(),9)
                .requires(ModBlocks.RAW_TEQIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_TEQIUM_BLOCK.get()), has(ModBlocks.RAW_TEQIUM_BLOCK.get()))
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
                .requires(ModItems.TEQIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TEQIUM_INGOT.get()), has(ModItems.TEQIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Items.QUARTZ,4)
                .requires(Items.QUARTZ_BLOCK)
                .unlockedBy(getHasName(Items.QUARTZ_BLOCK), has(Items.QUARTZ_BLOCK))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.TEQIUM_INGOT.get(),1)
                .requires(ModItems.TEQIUM.get())
                .requires(Items.NETHERITE_INGOT)
                .requires(Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.TEQIUM_INGOT.get()), has(ModItems.TEQIUM_INGOT.get()))
                .save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.OAK_SLAB, Items.OAK_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.OAK_STAIRS, Items.OAK_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.OAK_FENCE, Items.OAK_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.SPRUCE_SLAB, Items.SPRUCE_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.SPRUCE_STAIRS, Items.SPRUCE_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.SPRUCE_FENCE, Items.SPRUCE_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.BIRCH_SLAB, Items.BIRCH_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.BIRCH_STAIRS, Items.BIRCH_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.BIRCH_FENCE, Items.BIRCH_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.JUNGLE_SLAB, Items.JUNGLE_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.JUNGLE_STAIRS, Items.JUNGLE_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.JUNGLE_FENCE, Items.JUNGLE_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.ACACIA_SLAB, Items.ACACIA_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.ACACIA_STAIRS, Items.ACACIA_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.ACACIA_FENCE, Items.ACACIA_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.DARK_OAK_SLAB, Items.DARK_OAK_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.DARK_OAK_STAIRS, Items.DARK_OAK_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.DARK_OAK_FENCE, Items.DARK_OAK_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.MANGROVE_SLAB, Items.MANGROVE_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.MANGROVE_STAIRS, Items.MANGROVE_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.MANGROVE_FENCE, Items.MANGROVE_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.CHERRY_SLAB, Items.CHERRY_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.CHERRY_STAIRS, Items.CHERRY_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.CHERRY_FENCE, Items.CHERRY_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.BAMBOO_SLAB, Items.BAMBOO_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.BAMBOO_STAIRS, Items.BAMBOO_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.BAMBOO_FENCE, Items.BAMBOO_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.CRIMSON_SLAB, Items.CRIMSON_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.CRIMSON_STAIRS, Items.CRIMSON_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.CRIMSON_FENCE, Items.CRIMSON_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.WARPED_SLAB, Items.WARPED_PLANKS,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.WARPED_STAIRS, Items.WARPED_PLANKS,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, Items.WARPED_FENCE, Items.WARPED_PLANKS,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.SNOW_BRICK_SLAB.get(), ModBlocks.SNOW_BRICKS.get(),2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.SNOW_BRICK_STAIRS.get(), ModBlocks.SNOW_BRICKS.get(),1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.SNOW_BRICK_WALL.get(), ModBlocks.SNOW_BRICKS.get(),1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_ICE_SLAB.get(), Items.BLUE_ICE,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_ICE_STAIRS.get(), Items.BLUE_ICE,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_ICE_WALL.get(), Items.BLUE_ICE,1);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PACKED_ICE_SLAB.get(), Items.PACKED_ICE,2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PACKED_ICE_STAIRS.get(), Items.PACKED_ICE,1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PACKED_ICE_WALL.get(), Items.PACKED_ICE,1);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void trimSmithing(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item pIngredientItem, ResourceLocation pLocation) {
        SmithingTrimRecipeBuilder.smithingTrim(Ingredient.of(pIngredientItem), Ingredient.of(ItemTags.TRIMMABLE_ARMOR), Ingredient.of(ItemTags.TRIM_MATERIALS), RecipeCategory.MISC).unlocks("has_smithing_trim_template", has(pIngredientItem)).save(pFinishedRecipeConsumer, pLocation);
    }
    protected static void TeqiumSmithing(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item pIngredientItem, RecipeCategory pCategory, Item pResultItem) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.TEQIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(pIngredientItem), Ingredient.of(ModItems.TEQIUM_INGOT.get()), pCategory, pResultItem).unlocks("has_netherite_ingot", has(ModItems.TEQIUM_INGOT.get())).save(pFinishedRecipeConsumer, getItemName(pResultItem) + "_smithing");
    }
    protected static void netheriteSmithing(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item pIngredientItem, RecipeCategory pCategory, Item pResultItem) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(pIngredientItem), Ingredient.of(Items.NETHERITE_INGOT), pCategory, pResultItem).unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT)).save(pFinishedRecipeConsumer, getItemName(pResultItem) + "_smithing");
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
    protected static void stonecutterResultFromBase(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pResult, ItemLike pMaterial) {
        stonecutterResultFromBase(pFinishedRecipeConsumer, pCategory, pResult, pMaterial, 1);
    }
}
