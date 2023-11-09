package net.ptaq.teqium.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.block.ModBlocks;
import net.ptaq.teqium.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Teqium.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.COPPER_NUGGET);
        simpleItem(ModItems.NETHERITE_NUGGET);
        simpleItem(ModItems.DIAMOND_NUGGET);
        simpleItem(ModItems.TEQIUM_NUGGET);

        simpleItem(ModItems.TEQIUM);
        simpleItem(ModItems.TEQIUM_INGOT);
        simpleItem(ModItems.TEQIUM_UPGRADE_SMITHING_TEMPLATE);

        simpleItem(ModItems.RAW_TEQIUM);

        handheldItem(ModItems.TEQIUM_AXE);
        handheldItem(ModItems.TEQIUM_PICKAXE);
        handheldItem(ModItems.TEQIUM_HOE);
        handheldItem(ModItems.TEQIUM_SWORD);
        handheldItem(ModItems.TEQIUM_SHOVEL);

        handheldItem(ModItems.COPPER_AXE);
        handheldItem(ModItems.COPPER_PICKAXE);
        handheldItem(ModItems.COPPER_HOE);
        handheldItem(ModItems.COPPER_SWORD);
        handheldItem(ModItems.COPPER_SHOVEL);

        trimmedArmorItem(ModItems.TEQIUM_HELMET);
        trimmedArmorItem(ModItems.TEQIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.TEQIUM_LEGGINGS);
        trimmedArmorItem(ModItems.TEQIUM_BOOTS);

        handheldItem(ModItems.COPPER_HELMET);
        handheldItem(ModItems.COPPER_CHESTPLATE);
        handheldItem(ModItems.COPPER_LEGGINGS);
        handheldItem(ModItems.COPPER_BOOTS);

        handheldItem(ModItems.COPPER_DAGGER);
        handheldItem(ModItems.GOLDEN_DAGGER);
        handheldItem(ModItems.IRON_DAGGER);
        handheldItem(ModItems.DIAMOND_DAGGER);
        handheldItem(ModItems.NETHERITE_DAGGER);
        handheldItem(ModItems.TEQIUM_DAGGER);

        handheldItem(ModItems.COPPER_BIG_SWORD);
        handheldItem(ModItems.GOLDEN_BIG_SWORD);
        handheldItem(ModItems.IRON_BIG_SWORD);
        handheldItem(ModItems.DIAMOND_BIG_SWORD);
        handheldItem(ModItems.NETHERITE_BIG_SWORD);
        handheldItem(ModItems.TEQIUM_BIG_SWORD);

        handheldItem(ModItems.COPPER_MACE);
        handheldItem(ModItems.GOLDEN_MACE);
        handheldItem(ModItems.IRON_MACE);
        handheldItem(ModItems.DIAMOND_MACE);
        handheldItem(ModItems.NETHERITE_MACE);
        handheldItem(ModItems.TEQIUM_MACE);

        handheldItem(ModItems.COPPER_RAPIER);
        handheldItem(ModItems.GOLDEN_RAPIER);
        handheldItem(ModItems.IRON_RAPIER);
        handheldItem(ModItems.DIAMOND_RAPIER);
        handheldItem(ModItems.NETHERITE_RAPIER);
        handheldItem(ModItems.TEQIUM_RAPIER);

        wallItem(ModBlocks.TEQIUM_BRICK_WALL, ModBlocks.TEQIUM_BRICKS);
        fixBlockItem(ModBlocks.TEQIUM_BRICK_SLAB);
        fixBlockItem(ModBlocks.TEQIUM_BRICK_STAIRS);

        wallItem(ModBlocks.SNOW_BRICK_WALL, ModBlocks.SNOW_BRICKS);
        fixBlockItem(ModBlocks.SNOW_BRICK_SLAB);
        fixBlockItem(ModBlocks.SNOW_BRICK_STAIRS);

        wallItem2(ModBlocks.BLUE_ICE_WALL, Blocks.BLUE_ICE);
        fixBlockItem(ModBlocks.BLUE_ICE_SLAB);
        fixBlockItem(ModBlocks.BLUE_ICE_STAIRS);

        wallItem2(ModBlocks.PACKED_ICE_WALL, Blocks.PACKED_ICE);
        fixBlockItem(ModBlocks.PACKED_ICE_SLAB);
        fixBlockItem(ModBlocks.PACKED_ICE_STAIRS);
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = Teqium.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Teqium.MOD_ID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Teqium.MOD_ID,"item/" + item.getId().getPath()));
    }
    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Teqium.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Teqium.MOD_ID,"item/" + item.getId().getPath()));
    }
    public void wallItem2(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }
    public void fixBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Teqium.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
}
