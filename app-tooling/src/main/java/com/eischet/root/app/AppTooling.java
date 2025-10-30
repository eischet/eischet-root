package com.eischet.root.app;

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
