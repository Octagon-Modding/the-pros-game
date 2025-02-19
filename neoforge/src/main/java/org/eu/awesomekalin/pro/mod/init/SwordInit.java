package org.eu.awesomekalin.pro.mod.init;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pro.mod.utils.ToolMaterials;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.holders.ToolHolder;
import org.eu.awesomekalin.pufferfishapi.registry.ItemRegistry;

public class SwordInit {
    public static final ItemRegistry SWORD_REGISTER = new ItemRegistry(TheProsGame.MODID);

    public static ItemRegistryHolder EMERALD_SWORD;
    public static ItemRegistryHolder GLOWSTONE_SWORD;
    public static ItemRegistryHolder LAPIS_SWORD;
    public static ItemRegistryHolder OBSIDIAN_SWORD;
    public static ItemRegistryHolder REDSTONE_SWORD;

    public static void init() {
        TheProsGame.LOGGER.info("Initialising Swords");

        EMERALD_SWORD = SWORD_REGISTER.registerSword(new ToolHolder(ToolMaterials.EMERALD, 7f, 1.5f, "emerald_sword"));
        GLOWSTONE_SWORD = SWORD_REGISTER.registerSword(new ToolHolder(ToolMaterials.GLOWSTONE, 4f, 2f, "glowstone_sword"));
        LAPIS_SWORD = SWORD_REGISTER.registerSword(new ToolHolder(ToolMaterials.LAPIS, 5f, 1f, "lapis_sword"));
        OBSIDIAN_SWORD = SWORD_REGISTER.registerSword(new ToolHolder(ToolMaterials.OBSIDIAN, 12f, 0.5f,"obsidian_sword"));
        REDSTONE_SWORD = SWORD_REGISTER.registerSword(new ToolHolder(ToolMaterials.REDSTONE, 9f, 1.1f, "redstone_sword"));

        SWORD_REGISTER.register();
    }
}
