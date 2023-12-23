package org.eu.awesomekalin.the_pros_game.forge;

import net.neoforged.fml.common.Mod;
import org.eu.awesomekalin.the_pros_game.ThePro_sGame;

@Mod(ThePro_sGame.MOD_ID)
public class ThePro_sGameForge {
    public ThePro_sGameForge() {
        ThePro_sGame.init();
    }
}