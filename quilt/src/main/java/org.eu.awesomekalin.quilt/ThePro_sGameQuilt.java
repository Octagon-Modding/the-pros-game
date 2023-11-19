package org.eu.awesomekalin.quilt;

import org.eu.awesomekalin.the_pros_game.ThePro_sGameFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ThePro_sGameQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        ThePro_sGameFabricLike.init();
    }
}
