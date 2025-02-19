package org.eu.awesomekalin.pro.mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eu.awesomekalin.pro.mod.init.CreativeTabInit;
import org.eu.awesomekalin.pro.mod.init.SwordInit;

public class TheProsGame {
    public static final String MODID = "progame";
    public static final Logger LOGGER = LogManager.getLogger("The-Pros-Game");

    public static void init() {
        LOGGER.info("Initialising The Pro's Game");
        SwordInit.init();
        CreativeTabInit.init();
    }
}
