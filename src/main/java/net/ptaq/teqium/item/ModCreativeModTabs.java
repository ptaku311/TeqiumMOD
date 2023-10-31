package net.ptaq.teqium.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> Creative_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Teqium.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEQIUM_TAB = Creative_MODE_TABS.register("teqium_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TEQIUM.get()))
                    .title(Component.translatable("creativetab.teqium_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.TEQIUM.get());
                        pOutput.accept(ModItems.RAW_TEQIUM.get());
                        pOutput.accept(ModItems.TEQIUM_INGOT.get());
                        pOutput.accept(ModItems.TEQIUM_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(ModItems.TEQIUM_NUGGET.get());
                        pOutput.accept(ModItems.NETHERITE_NUGGET.get());
                        pOutput.accept(ModItems.DIAMOND_NUGGET.get());
                        pOutput.accept(ModItems.COPPER_NUGGET.get());

                        pOutput.accept(ModItems.TEQIUM_HELMET.get());
                        pOutput.accept(ModItems.TEQIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.TEQIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.TEQIUM_BOOTS.get());

                        pOutput.accept(ModItems.COPPER_HELMET.get());
                        pOutput.accept(ModItems.COPPER_CHESTPLATE.get());
                        pOutput.accept(ModItems.COPPER_LEGGINGS.get());
                        pOutput.accept(ModItems.COPPER_BOOTS.get());

                        pOutput.accept(ModItems.TEQIUM_AXE.get());
                        pOutput.accept(ModItems.TEQIUM_PICKAXE.get());
                        pOutput.accept(ModItems.TEQIUM_HOE.get());
                        pOutput.accept(ModItems.TEQIUM_SHOVEL.get());
                        pOutput.accept(ModItems.TEQIUM_SWORD.get());

                        pOutput.accept(ModItems.COPPER_AXE.get());
                        pOutput.accept(ModItems.COPPER_PICKAXE.get());
                        pOutput.accept(ModItems.COPPER_HOE.get());
                        pOutput.accept(ModItems.COPPER_SHOVEL.get());
                        pOutput.accept(ModItems.COPPER_SWORD.get());

                        pOutput.accept(ModBlocks.TEQIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_TEQIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.TEQIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TEQIUM_ORE.get());

                        pOutput.accept(ModBlocks.TEQIUM_BRICKS.get());
                        pOutput.accept(ModBlocks.TEQIUM_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.TEQIUM_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.TEQIUM_BRICK_SLAB.get());

                        pOutput.accept(ModBlocks.SNOW_BRICKS.get());
                        pOutput.accept(ModBlocks.SNOW_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.SNOW_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.SNOW_BRICK_SLAB.get());

                        pOutput.accept(ModItems.COPPER_DAGGER.get());
                        pOutput.accept(ModItems.GOLDEN_DAGGER.get());
                        pOutput.accept(ModItems.IRON_DAGGER.get());
                        pOutput.accept(ModItems.DIAMOND_DAGGER.get());
                        pOutput.accept(ModItems.NETHERITE_DAGGER.get());
                        pOutput.accept(ModItems.TEQIUM_DAGGER.get());

                        pOutput.accept(ModItems.COPPER_BIG_SWORD.get());
                        pOutput.accept(ModItems.GOLDEN_BIG_SWORD.get());
                        pOutput.accept(ModItems.IRON_BIG_SWORD.get());
                        pOutput.accept(ModItems.DIAMOND_BIG_SWORD.get());
                        pOutput.accept(ModItems.NETHERITE_BIG_SWORD.get());
                        pOutput.accept(ModItems.TEQIUM_BIG_SWORD.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        Creative_MODE_TABS.register(eventBus);
    }
}
