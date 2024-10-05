package net.pitan76.mcpitanlib.guilib.api.screen;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.pitan76.mcpitanlib.api.client.gui.screen.CompatInventoryScreen;
import net.pitan76.mcpitanlib.api.client.render.handledscreen.DrawBackgroundArgs;
import net.pitan76.mcpitanlib.api.util.CompatIdentifier;
import net.pitan76.mcpitanlib.api.util.ScreenHandlerUtil;
import net.pitan76.mcpitanlib.api.util.client.RenderUtil;
import net.pitan76.mcpitanlib.guilib.api.container.ContainerGui;

public class ContainerGuiScreen<T extends ContainerGui> extends CompatInventoryScreen<T> {
    public ContainerGuiScreen(T handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        setBackgroundWidth(handler.getScreenBackgroundWidth());
        setBackgroundHeight(handler.getScreenBackgroundHeight());
        setX(handler.getScreenX());
        setY(handler.getScreenY());
        setTitlePos(handler.getScreenTitleX(), handler.getScreenTitleY());
    }

    @Override
    public void initOverride() {
        super.initOverride();
    }

    @Override
    public void drawBackgroundOverride(DrawBackgroundArgs args) {
        RenderUtil.setShaderToPositionTexProgram();
        RenderUtil.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

        // TODO: width, heightに応じてgui_backgroundのサイズを変更するべき。
        callDrawTexture(args.drawObjectDM, CompatIdentifier.of("gui_background"), 0, 0, 0, 0, handler.getScreenWidth(), handler.getScreenHeight());

        ScreenHandlerUtil.getSlots(handler).forEach(slot ->
                callDrawTexture(args.drawObjectDM, CompatIdentifier.of("gui_parts"), slot.x, slot.y, 0, 0, 18, 18));

    }

    @Override
    public CompatIdentifier getCompatTexture() {
        return null;
    }
}
