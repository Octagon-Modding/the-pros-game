package org.eu.awesomekalin.pro.mod.init;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pro.mod.utils.ToolMaterials;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.holders.ToolHolder;
import org.eu.awesomekalin.pufferfishapi.registry.ItemRegistry;
import org.eu.awesomekalin.pufferfishapi.util.Identifier;

public class SwordInit {
    public static final ItemRegistry SWORD_REGISTER = new ItemRegistry(TheProsGame.MODID);
    public static ItemRegistryHolder EMERALD_SWORD;

    public static void init() {
        TheProsGame.LOGGER.info("Initialising Swords");
        EMERALD_SWORD = SWORD_REGISTER.registerSword("emerald_sword", new ToolHolder(ToolMaterials.emerald, 7f, -1.5f, new Identifier(TheProsGame.MODID, "emerald_sword")));
        SWORD_REGISTER.register();
    }
}
