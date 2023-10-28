package net.ptaq.teqium.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.item.ModItems;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    TEQIUM("teqium", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 1f, 0f, () -> Ingredient.of(ModItems.TEQIUM.get())),
    COPPER_INGOT("copper", 26, new int[]{ 2, 6, 4, 2 }, 25,
    SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.of(ModItems.TEQIUM.get()));


    public final String name;
    public final int durabilityMultiplier;
    public final int [] protectionAmounts;
    public final int enchantmentValue;
    public final SoundEvent equipSound;
    public final float toughness;
    public final float knockbackResistance;
    public final Supplier<Ingredient> repairIngredient;

    private  static final int[] BASE_DURABILITY = {11, 16, 16, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Teqium.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}
