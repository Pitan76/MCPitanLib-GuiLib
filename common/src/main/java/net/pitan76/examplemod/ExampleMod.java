package net.pitan76.examplemod;

import net.pitan76.examplemod.block.Blocks;
import net.pitan76.examplemod.item.ItemGroups;
import net.pitan76.examplemod.item.Items;
import net.pitan76.mcpitanlib.api.CommonModInitializer;
import net.pitan76.mcpitanlib.api.registry.v2.CompatRegistryV2;
import net.pitan76.mcpitanlib.api.util.CompatIdentifier;

public class ExampleMod extends CommonModInitializer {
    public static final String MOD_ID = "examplemod";
    public static final String MOD_NAME = "Example Mod";

    public static ExampleMod INSTANCE;
    public static CompatRegistryV2 registry;

    @Override
    public void init() {
        INSTANCE = this;
        registry = super.registry;

        ItemGroups.init();
        Blocks.init();
        Items.init();
    }

    // ----
    /**
     * @param path The path of the id
     * @return The id
     */
    public static CompatIdentifier _id(String path) {
        return CompatIdentifier.of(MOD_ID, path);
    }

    @Override
    public String getId() {
        return MOD_ID;
    }

    @Override
    public String getName() {
        return MOD_NAME;
    }
}