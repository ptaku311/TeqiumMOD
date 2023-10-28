package net.ptaq.teqium.item.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.item.ModItems;
import net.ptaq.teqium.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier TEQIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9.0F, 4F, 20,
                    ModTags.Blocks.NEEDS_TEQIUM_TOOL, () -> Ingredient.of(ModItems.TEQIUM.get())),
            new ResourceLocation(Teqium.MOD_ID, "teqium"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(2, 100, 6.0F, 2F, 14,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(Teqium.MOD_ID, "copper"), List.of(Tiers.IRON), List.of());
}
