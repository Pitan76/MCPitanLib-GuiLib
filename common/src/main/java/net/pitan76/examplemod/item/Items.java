package net.pitan76.examplemod.item;

import net.minecraft.item.Item;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static net.pitan76.examplemod.ExampleMod._id;
import static net.pitan76.examplemod.ExampleMod.registry;

public class Items {

    public static RegistryResult<Item> EXAMPLE_ITEM;

    public static void init() {
        EXAMPLE_ITEM = registry.registerItem(_id("example_item"), () -> new ExampleItem(CompatibleItemSettings.of()));
    }
}
