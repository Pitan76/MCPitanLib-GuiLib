package net.pitan76.mcpitanlib.guilib;

import net.minecraft.screen.ScreenHandlerType;
import net.pitan76.mcpitanlib.api.client.registry.CompatRegistryClient;
import net.pitan76.mcpitanlib.api.gui.SimpleScreenHandlerTypeBuilder;
import net.pitan76.mcpitanlib.guilib.api.container.TestContainer;

public class GuiRegistry {
    public static void register() {
        ScreenHandlerType<TestContainer> type = new SimpleScreenHandlerTypeBuilder<>(TestContainer::new).build();
        CompatRegistryClient.registerScreen(type, TestContainer.getFactory());
    }
}
