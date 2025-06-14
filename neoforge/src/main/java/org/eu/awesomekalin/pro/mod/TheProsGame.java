package org.eu.awesomekalin.pro.mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eu.awesomekalin.pro.mod.init.*;
import org.eu.awesomekalin.pufferfishapi.PufferfishAPI;

public class TheProsGame {
    public static final String MODID = "progame";
    public static final Logger LOGGER = LogManager.getLogger("The-Pros-Game");
    public static final String TAG_PREFIX;

    static {
        if ("1.20.6".equals(PufferfishAPI.getMinecraftVersion()) &&
                "Forge".equalsIgnoreCase(PufferfishAPI.getModLoader())) {
            TAG_PREFIX = "forge";
        } else {
            TAG_PREFIX = "c";
        }
    }

    public static void init() {
        LOGGER.info("Initialising The Pro's Game");

        SwordInit.init();
        PickaxeInit.init();
        AxeInit.init();
        ShovelInit.init();
        HoeInit.init();
        ArmourInit.init();

        FoodInit.init();

        CreativeTabInit.init();
    }
}
