package net.pitan76.examplemod.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.pitan76.examplemod.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public class ExampleModNeoForge {
    public ExampleModNeoForge(ModContainer modContainer) {
        IEventBus eventBus = modContainer.getEventBus();

        new ExampleMod();
    }
}