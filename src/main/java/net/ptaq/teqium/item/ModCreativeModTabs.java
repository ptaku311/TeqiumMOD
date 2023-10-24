package net.ptaq.teqium.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.EventBus;
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
                        pOutput.accept(ModItems.TEQIUM_NUGGET.get());
                        pOutput.accept(ModItems.NETHERITE_NUGGET.get());
                        pOutput.accept(ModItems.DIAMOND_NUGGET.get());
                        pOutput.accept(ModItems.COPPER_NUGGET.get());

                        pOutput.accept(ModBlocks.TEQIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_TEQIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.TEQIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TEQIUM_ORE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        Creative_MODE_TABS.register(eventBus);
    }
}
