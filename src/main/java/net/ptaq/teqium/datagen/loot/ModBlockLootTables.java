package net.ptaq.teqium.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.ptaq.teqium.block.ModBlocks;
import net.ptaq.teqium.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TEQIUM_BLOCK.get());
        this.dropSelf(ModBlocks.TEQIUM_BRICKS.get());
        this.dropSelf(ModBlocks.TEQIUM_BRICK_WALL.get());
        this.dropSelf(ModBlocks.TEQIUM_BRICK_STAIRS.get());
        this.add(ModBlocks.TEQIUM_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.TEQIUM_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.RAW_TEQIUM_BLOCK.get());

        this.dropSelf(ModBlocks.SNOW_BRICKS.get());
        this.dropSelf(ModBlocks.SNOW_BRICK_WALL.get());
        this.dropSelf(ModBlocks.SNOW_BRICK_STAIRS.get());
        this.add(ModBlocks.SNOW_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.SNOW_BRICK_SLAB.get()));

        this.dropSelf(ModBlocks.BLUE_ICE_WALL.get());
        this.dropSelf(ModBlocks.BLUE_ICE_STAIRS.get());
        this.add(ModBlocks.BLUE_ICE_SLAB.get(), block -> createSlabItemTable(ModBlocks.BLUE_ICE_SLAB.get()));

        this.dropSelf(ModBlocks.PACKED_ICE_WALL.get());
        this.dropSelf(ModBlocks.PACKED_ICE_STAIRS.get());
        this.add(ModBlocks.PACKED_ICE_SLAB.get(), block -> createSlabItemTable(ModBlocks.PACKED_ICE_SLAB.get()));

        this.add(ModBlocks.TEQIUM_ORE.get(),
                block -> createCopperOreDrops(ModBlocks.TEQIUM_ORE.get(), ModItems.RAW_TEQIUM.get()));
        this.add(ModBlocks.DEEPSLATE_TEQIUM_ORE.get(),
                block -> createCopperOreDrops(ModBlocks.DEEPSLATE_TEQIUM_ORE.get(), ModItems.RAW_TEQIUM.get()));

    }

    protected LootTable.Builder createCopperOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
