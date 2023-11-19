package org.eu.awesomekalin.the_pros_game.fabric;

import org.eu.awesomekalin.the_pros_game.ThePro_sGameFabricLike;
import net.fabricmc.api.ModInitializer;

public class ThePro_sGameFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ThePro_sGameFabricLike.init();
    }
}