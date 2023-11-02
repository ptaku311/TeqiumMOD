package net.ptaq.teqium.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Teqium.MOD_ID);

    public static final RegistryObject<Block> TEQIUM_BLOCK = registerBlock("teqium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_TEQIUM_BLOCK = registerBlock("raw_teqium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.ANCIENT_DEBRIS)));
    public static final RegistryObject<Block> TEQIUM_ORE = registerBlock("teqium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                    .strength(30.0f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> DEEPSLATE_TEQIUM_ORE = registerBlock("deepslate_teqium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                    .strength(30.0f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));


    public static final RegistryObject<Block> TEQIUM_BRICKS = registerBlock("teqium_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> TEQIUM_BRICK_WALL = registerBlock("teqium_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> TEQIUM_BRICK_STAIRS = registerBlock("teqium_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TEQIUM_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> TEQIUM_BRICK_SLAB = registerBlock("teqium_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.NETHER_BRICKS)));

    public static final RegistryObject<Block> SNOW_BRICKS = registerBlock("snow_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SNOW_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.SNOW)));


    public static final RegistryObject<Block> BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            () -> new StairBlock(() -> Blocks.BLUE_ICE.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.GLASS)));



    public static final RegistryObject<Block> PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            () -> new StairBlock(() -> Blocks.PACKED_ICE.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.GLASS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}