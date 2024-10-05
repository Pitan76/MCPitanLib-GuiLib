package net.pitan76.mcpitanlib.guilib.api.container;

import net.minecraft.inventory.Inventory;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.pitan76.mcpitanlib.api.client.registry.CompatRegistryClient;
import net.pitan76.mcpitanlib.api.entity.Player;
import net.pitan76.mcpitanlib.api.gui.SimpleScreenHandler;
import net.pitan76.mcpitanlib.guilib.api.IScreenInfo;
import net.pitan76.mcpitanlib.guilib.api.screen.ContainerGuiScreen;

import java.util.ArrayList;
import java.util.List;

public abstract class ContainerGui extends SimpleScreenHandler implements IScreenInfo {

    private final List<Inventory> INVENTORIES = new ArrayList<>();

    public static CompatRegistryClient.ScreenFactory<ContainerGui, ContainerGuiScreen<ContainerGui>> getFactory() {
        return ContainerGuiScreen::new;
    }



    protected ContainerGui(ScreenHandlerType<?> type, int syncId) {
        super(type, syncId);
    }

    @Override
    public boolean canUse(Player player) {
        return true;
    }

    @Override
    protected Slot addSlot(Slot slot) {
        if (slot.inventory instanceof Inventory && !INVENTORIES.contains(slot.inventory))
            INVENTORIES.add(slot.inventory);

        return super.addSlot(slot);
    }

    @Override
    public void close(Player player) {
        INVENTORIES.forEach((inv -> inv.onClose(player.getEntity())));
    }
}
