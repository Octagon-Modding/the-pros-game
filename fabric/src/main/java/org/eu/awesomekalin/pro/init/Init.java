package org.eu.awesomekalin.pro.init;

import net.fabricmc.api.ModInitializer;

public class Init implements ModInitializer {
    @Override
    public void onInitialize() {
        org.eu.awesomekalin.pro.mod.Init.init();
    }
}
