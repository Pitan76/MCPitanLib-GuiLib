package net.pitan76.mcpitanlib.guilib.fabric;

import net.pitan76.mcpitanlib.guilib.MPLGuiLib;
import net.fabricmc.api.ModInitializer;

public class MPLGuiLibFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        new MPLGuiLib();
    }
}