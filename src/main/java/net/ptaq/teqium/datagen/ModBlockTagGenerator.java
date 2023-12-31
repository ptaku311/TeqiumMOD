package net.ptaq.teqium.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.block.ModBlocks;
import net.ptaq.teqium.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static java.awt.AWTEventMulticaster.add;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Teqium.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TEQIUM_BLOCK.get(),
                        ModBlocks.RAW_TEQIUM_BLOCK.get(),
                        ModBlocks.DEEPSLATE_TEQIUM_ORE.get(),
                        ModBlocks.TEQIUM_ORE.get(),
                        ModBlocks.TEQIUM_BRICKS.get(),
                        ModBlocks.TEQIUM_BRICK_WALL.get(),
                        ModBlocks.TEQIUM_BRICK_STAIRS.get(),
                        ModBlocks.TEQIUM_BRICK_SLAB.get(),
                        ModBlocks.SNOW_BRICKS.get(),
                        ModBlocks.SNOW_BRICK_WALL.get(),
                        ModBlocks.SNOW_BRICK_STAIRS.get(),
                        ModBlocks.SNOW_BRICK_SLAB.get(),

                        ModBlocks.BLUE_ICE_WALL.get(),
                        ModBlocks.BLUE_ICE_STAIRS.get(),
                        ModBlocks.BLUE_ICE_SLAB.get(),

                        ModBlocks.PACKED_ICE_WALL.get(),
                        ModBlocks.PACKED_ICE_STAIRS.get(),
                        ModBlocks.PACKED_ICE_SLAB.get()

                );

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SNOW_BRICKS.get(), ModBlocks.SNOW_BRICK_WALL.get(), ModBlocks.SNOW_BRICK_STAIRS.get(), ModBlocks.SNOW_BRICK_SLAB.get(),
                        ModBlocks.BLUE_ICE_WALL.get(),  ModBlocks.PACKED_ICE_WALL.get(),  ModBlocks.BLUE_ICE_STAIRS.get(),  ModBlocks.PACKED_ICE_STAIRS.get(),
                        ModBlocks.BLUE_ICE_SLAB.get(),  ModBlocks.PACKED_ICE_SLAB.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TEQIUM_BLOCK.get(), ModBlocks.TEQIUM_BRICKS.get(),
                        ModBlocks.TEQIUM_BRICK_SLAB.get(),ModBlocks.TEQIUM_BRICK_STAIRS.get(),ModBlocks.TEQIUM_BRICK_WALL.get());
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.DEEPSLATE_TEQIUM_ORE.get(),ModBlocks.TEQIUM_ORE.get(),ModBlocks.RAW_TEQIUM_BLOCK.get());
        this.tag(ModTags.Blocks.NEEDS_TEQIUM_TOOL);

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.TEQIUM_BRICK_WALL.get(), ModBlocks.SNOW_BRICK_WALL.get(), ModBlocks.BLUE_ICE_WALL.get(), ModBlocks.PACKED_ICE_WALL.get());
    }
}
