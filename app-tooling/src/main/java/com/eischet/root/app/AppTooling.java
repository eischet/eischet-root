package com.eischet.root.app;

/**
 * Helper to detect if we're running a beta version.
 *
 * Beta versions include the app-beta artifact / jar, which includes the BetaVersion class, and we simply try to load it.
 */
@SuppressWarnings("unused")
public class AppTooling {

    public static boolean isBetaVersion() {
        try {
            Class.forName("com.eischet.root.app.BetaVersion");
            return true;
        } catch (ClassNotFoundException ignored) {
            return false;
        }
    }

}
