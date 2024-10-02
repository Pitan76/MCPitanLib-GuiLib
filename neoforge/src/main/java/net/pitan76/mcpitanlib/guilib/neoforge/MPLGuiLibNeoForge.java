package net.pitan76.mcpitanlib.guilib.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.pitan76.mcpitanlib.guilib.MPLGuiLib;

@Mod(MPLGuiLib.MOD_ID)
public class MPLGuiLibNeoForge {
    public MPLGuiLibNeoForge(ModContainer modContainer) {
        IEventBus eventBus = modContainer.getEventBus();

        new MPLGuiLib();
    }
}