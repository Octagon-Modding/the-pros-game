package org.eu.awesomekalin.pro.forge;

import net.minecraftforge.fml.common.Mod;
import org.eu.awesomekalin.pro.mod.TheProsGame;

@Mod(TheProsGame.MODID)
public class TheProsGameForge {
    public TheProsGameForge() {
        TheProsGame.init();
    }
}
