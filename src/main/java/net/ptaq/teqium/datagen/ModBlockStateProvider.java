package net.ptaq.teqium.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Teqium.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RAW_TEQIUM_BLOCK);
        blockWithItem(ModBlocks.TEQIUM_BLOCK);
        blockWithItem(ModBlocks.TEQIUM_BRICKS);
        blockWithItem(ModBlocks.SNOW_BRICKS);

        blockWithItem(ModBlocks.DEEPSLATE_TEQIUM_ORE);
        blockWithItem(ModBlocks.TEQIUM_ORE);

        stairsBlock(((StairBlock) ModBlocks.TEQIUM_BRICK_STAIRS.get()), blockTexture(ModBlocks.TEQIUM_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.TEQIUM_BRICK_SLAB.get()), blockTexture(ModBlocks.TEQIUM_BRICKS.get()), blockTexture(ModBlocks.TEQIUM_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.TEQIUM_BRICK_WALL.get()), blockTexture(ModBlocks.TEQIUM_BRICKS.get()));

        stairsBlock(((StairBlock) ModBlocks.SNOW_BRICK_STAIRS.get()), blockTexture(ModBlocks.SNOW_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.SNOW_BRICK_SLAB.get()), blockTexture(ModBlocks.SNOW_BRICKS.get()), blockTexture(ModBlocks.SNOW_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.SNOW_BRICK_WALL.get()), blockTexture(ModBlocks.SNOW_BRICKS.get()));

        stairsBlock(((StairBlock) ModBlocks.BLUE_ICE_STAIRS.get()), blockTexture(Blocks.BLUE_ICE));
        slabBlock(((SlabBlock) ModBlocks.BLUE_ICE_SLAB.get()), blockTexture(Blocks.BLUE_ICE), blockTexture(Blocks.BLUE_ICE));
        wallBlock(((WallBlock) ModBlocks.BLUE_ICE_WALL.get()), blockTexture(Blocks.BLUE_ICE));

        stairsBlock(((StairBlock) ModBlocks.PACKED_ICE_STAIRS.get()), blockTexture(Blocks.PACKED_ICE));
        slabBlock(((SlabBlock) ModBlocks.PACKED_ICE_SLAB.get()), blockTexture(Blocks.PACKED_ICE), blockTexture(Blocks.PACKED_ICE));
        wallBlock(((WallBlock) ModBlocks.PACKED_ICE_WALL.get()), blockTexture(Blocks.PACKED_ICE));


    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
