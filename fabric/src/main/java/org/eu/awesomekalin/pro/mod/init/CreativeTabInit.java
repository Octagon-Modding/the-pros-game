package org.eu.awesomekalin.pro.mod.init;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.registry.CreativeTabRegistry;

import java.util.ArrayList;
import java.util.List;

public class CreativeTabInit {
    public static final CreativeTabRegistry CREATIVE_REGISTER = new CreativeTabRegistry(TheProsGame.MODID);
    private static final List<ItemRegistryHolder> TAB_CONTENTS = new ArrayList<>();

    public static void init() {
        TheProsGame.LOGGER.info("Initialising Creative Mode Tabs");

        TAB_CONTENTS.add(SwordInit.EMERALD_SWORD);

        CREATIVE_REGISTER.registerTab("pro_tab", "itemGroup.progame", SwordInit.EMERALD_SWORD, TAB_CONTENTS);
        CREATIVE_REGISTER.register();
    }
}
