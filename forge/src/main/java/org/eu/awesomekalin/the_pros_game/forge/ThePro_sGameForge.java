package org.eu.awesomekalin.the_pros_game.forge;

import dev.architectury.platform.forge.EventBuses;
import org.eu.awesomekalin.the_pros_game.ThePro_sGame;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ThePro_sGame.MOD_ID)
public class ThePro_sGameForge {
    public ThePro_sGameForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ThePro_sGame.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            ThePro_sGame.init();
    }
}