package net.ptaq.teqium.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.item.custom.ModArmorMaterials;
import net.ptaq.teqium.item.custom.ModTemplateItems;
import net.ptaq.teqium.item.custom.ModToolTiers;

import static net.minecraft.world.item.ArmorItem.*;
import static net.minecraft.world.item.ArmorItem.Type.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Teqium.MOD_ID);
    private static final Item.Properties STACKS_TO_64 = new Item.Properties().stacksTo(64);


    public static final RegistryObject<Item> TEQIUM = ITEMS.register("teqium",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEQIUM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("teqium_upgrade_smithing_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEQIUM_INGOT = ITEMS.register("teqium_ingot",
            ()-> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> RAW_TEQIUM = ITEMS.register("raw_teqium",
            ()-> new Item(new Item.Properties().fireResistant()));



    public static final RegistryObject<Item> TEQIUM_NUGGET = ITEMS.register("teqium_nugget",
            ()-> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
            ()-> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            ()-> new Item(new Item.Properties()));



    public static final RegistryObject<Item> TEQIUM_AXE = ITEMS.register("teqium_axe",
            ()-> new AxeItem(ModToolTiers.TEQIUM, 6, -3F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_PICKAXE = ITEMS.register("teqium_pickaxe",
            ()-> new PickaxeItem(ModToolTiers.TEQIUM, 1, -2.8F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_HOE = ITEMS.register("teqium_hoe",
            ()-> new HoeItem(ModToolTiers.TEQIUM, 0, -2F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_SWORD = ITEMS.register("teqium_sword",
            ()-> new SwordItem(ModToolTiers.TEQIUM, 4, -2.4F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_SHOVEL = ITEMS.register("teqium_shovel",
            ()-> new HoeItem(ModToolTiers.TEQIUM, 0, -2F, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            ()-> new AxeItem(ModToolTiers.COPPER, 6, -3F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            ()-> new PickaxeItem(ModToolTiers.COPPER, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            ()-> new HoeItem(ModToolTiers.COPPER, -2, -2F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            ()-> new SwordItem(ModToolTiers.COPPER, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            ()-> new HoeItem(ModToolTiers.COPPER, 1, -2F, new Item.Properties()));



    public static final RegistryObject<Item> TEQIUM_HELMET = ITEMS.register("teqium_helmet",
            ()-> new ArmorItem(ModArmorMaterials.TEQIUM, Type.HELMET, new  Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_CHESTPLATE = ITEMS.register("teqium_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.TEQIUM, Type.CHESTPLATE, new  Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_LEGGINGS = ITEMS.register("teqium_leggings",
            ()-> new ArmorItem(ModArmorMaterials.TEQIUM, Type.LEGGINGS, new  Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_BOOTS = ITEMS.register("teqium_boots",
            ()-> new ArmorItem(ModArmorMaterials.TEQIUM, Type.BOOTS, new  Item.Properties().fireResistant()));
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            ()-> new ArmorItem(ModArmorMaterials.COPPER_INGOT, Type.HELMET, new  Item.Properties()));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.COPPER_INGOT, Type.CHESTPLATE, new  Item.Properties()));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            ()-> new ArmorItem(ModArmorMaterials.COPPER_INGOT, Type.LEGGINGS, new  Item.Properties()));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            ()-> new ArmorItem(ModArmorMaterials.COPPER_INGOT, Type.BOOTS, new  Item.Properties()));



    public static final RegistryObject<Item> COPPER_DAGGER = ITEMS.register("copper_dagger",
            ()-> new SwordItem(ModToolTiers.COPPER, 2, -2F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_DAGGER = ITEMS.register("golden_dagger",
            ()-> new SwordItem(Tiers.GOLD, 2, -2F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger",
            ()-> new SwordItem(Tiers.IRON, 2, -2F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            ()-> new SwordItem(Tiers.DIAMOND, 2, -2F, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
            ()-> new SwordItem(Tiers.NETHERITE, 2, -2F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_DAGGER = ITEMS.register("teqium_dagger",
            ()-> new SwordItem(ModToolTiers.TEQIUM, 3, -2F, new Item.Properties().fireResistant()));


    public static final RegistryObject<Item> COPPER_BIG_SWORD = ITEMS.register("copper_big_sword",
            ()-> new SwordItem(ModToolTiers.COPPER, 4, -3F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_BIG_SWORD = ITEMS.register("golden_big_sword",
            ()-> new SwordItem(Tiers.GOLD, 4, -3F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_BIG_SWORD = ITEMS.register("iron_big_sword",
            ()-> new SwordItem(Tiers.IRON, 4, -3F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BIG_SWORD = ITEMS.register("diamond_big_sword",
            ()-> new SwordItem(Tiers.DIAMOND, 4, -3F, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BIG_SWORD = ITEMS.register("netherite_big_sword",
            ()-> new SwordItem(Tiers.NETHERITE, 4, -3F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_BIG_SWORD = ITEMS.register("teqium_big_sword",
            ()-> new SwordItem(ModToolTiers.TEQIUM, 5, -3F, new Item.Properties().fireResistant()));


    public static final RegistryObject<Item> COPPER_MACE = ITEMS.register("copper_mace",
            ()-> new SwordItem(ModToolTiers.COPPER, 7, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_MACE = ITEMS.register("golden_mace",
            ()-> new SwordItem(Tiers.GOLD, 7, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_MACE = ITEMS.register("iron_mace",
            ()-> new SwordItem(Tiers.IRON, 7, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_MACE = ITEMS.register("diamond_mace",
            ()-> new SwordItem(Tiers.DIAMOND, 6, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_MACE = ITEMS.register("netherite_mace",
            ()-> new SwordItem(Tiers.NETHERITE, 6, -3.5F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_MACE = ITEMS.register("teqium_mace",
            ()-> new SwordItem(ModToolTiers.TEQIUM, 7, -3.5F, new Item.Properties().fireResistant()));


    public static final RegistryObject<Item> COPPER_RAPIER = ITEMS.register("copper_rapier",
            ()-> new SwordItem(ModToolTiers.COPPER, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_RAPIER = ITEMS.register("golden_rapier",
            ()-> new SwordItem(Tiers.GOLD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_RAPIER = ITEMS.register("iron_rapier",
            ()-> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_RAPIER = ITEMS.register("diamond_rapier",
            ()-> new SwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_RAPIER = ITEMS.register("netherite_rapier",
            ()-> new SwordItem(Tiers.NETHERITE, 3, -2.4F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TEQIUM_RAPIER = ITEMS.register("teqium_rapier",
            ()-> new SwordItem(ModToolTiers.TEQIUM,4, -2.4F, new Item.Properties().fireResistant()));


    public static final RegistryObject<Item> TEQIUMBOW = ITEMS.register("teqiumbow",
            ()-> new BowItem(new Item.Properties().durability(640).fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
