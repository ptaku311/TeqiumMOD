package net.ptaq.teqium;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.ptaq.teqium.block.ModBlocks;
import net.ptaq.teqium.item.ModCreativeModTabs;
import net.ptaq.teqium.item.ModItems;
import org.slf4j.Logger;
@Mod(Teqium.MOD_ID)
public class Teqium {
    public static final String MOD_ID = "teqium";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Teqium()  {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)    {

    }
    private void addCreative(BuildCreativeModeTabContentsEvent event)    {

    if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        event.accept(ModItems.TEQIUM);
        event.accept(ModItems.RAW_TEQIUM);

    }

    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)     {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents     {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)     {

        }
    }
}
