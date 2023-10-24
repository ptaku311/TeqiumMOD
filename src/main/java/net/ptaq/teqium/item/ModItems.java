package net.ptaq.teqium.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ptaq.teqium.Teqium;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Teqium.MOD_ID);

    public static final RegistryObject<Item> TEQIUM = ITEMS.register("teqium",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TEQIUM = ITEMS.register("raw_teqium",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEQIUM_NUGGET = ITEMS.register("teqium_nugget",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            ()-> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
