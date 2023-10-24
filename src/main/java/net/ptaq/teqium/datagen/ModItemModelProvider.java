package net.ptaq.teqium.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.ptaq.teqium.Teqium;
import net.ptaq.teqium.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
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
        simpleItem(ModItems.RAW_TEQIUM);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Teqium.MOD_ID, "item/" + item.getId().getPath()));
    }
}
