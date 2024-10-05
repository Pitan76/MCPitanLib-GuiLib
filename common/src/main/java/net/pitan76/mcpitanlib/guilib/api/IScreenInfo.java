package net.pitan76.mcpitanlib.guilib.api;

public interface IScreenInfo {
    default int getScreenBackgroundWidth() {
        return getScreenWidth();
    }

    default int getScreenBackgroundHeight() {
        return getScreenHeight();
    }

    int getScreenWidth();

    int getScreenHeight();

    default int getScreenX() {
        return 0;
    }

    default int getScreenY() {
        return 0;
    }

    default int getScreenTitleX() {
        return -1;
    }

    default int getScreenTitleY() {
        return -1;
    }
}
