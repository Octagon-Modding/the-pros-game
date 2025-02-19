package org.eu.awesomekalin.pro.fabric;

import net.fabricmc.api.ModInitializer;
import org.eu.awesomekalin.pro.mod.TheProsGame;

public class TheProsGameFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TheProsGame.init();
    }
}
