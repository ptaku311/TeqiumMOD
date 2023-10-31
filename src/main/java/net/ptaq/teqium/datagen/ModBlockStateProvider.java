package net.ptaq.teqium.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
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

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
