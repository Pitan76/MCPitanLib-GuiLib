package net.pitan76.examplemod.fabric;

import net.pitan76.examplemod.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        new ExampleMod();
    }
}