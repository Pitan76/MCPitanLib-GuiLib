package net.pitan76.mcpitanlib.guilib.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.pitan76.mcpitanlib.guilib.MPLGuiLib;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MPLGuiLib.MOD_ID)
public class MPLGuiLibForge {
    public MPLGuiLibForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EventBuses.registerModEventBus(MPLGuiLib.MOD_ID, modEventBus);
        new MPLGuiLib();
    }
}