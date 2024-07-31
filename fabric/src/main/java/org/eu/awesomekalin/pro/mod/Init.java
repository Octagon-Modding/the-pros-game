package org.eu.awesomekalin.pro.mod;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mtr.mapping.registry.Registry;
import org.mtr.mapping.tool.DummyClass;

public class Init {
    public static final String MOD_ID = "pro";
    public static final Logger LOGGER = LogManager.getLogger("The_Pros_Game");
    public static final Registry REGISTRY = new Registry();

    public static void init() {
        DummyClass.enableLogging();
        LOGGER.log(Level.INFO, "Loading The Pro's Game");
    }
}
