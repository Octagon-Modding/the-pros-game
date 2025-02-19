package org.eu.awesomekalin.pro.mod.init;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pro.mod.utils.ToolMaterials;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.holders.ToolHolder;
import org.eu.awesomekalin.pufferfishapi.registry.ItemRegistry;

public class AxeInit {
    public static final ItemRegistry AXE_REGISTER = new ItemRegistry(TheProsGame.MODID);
    
    public static ItemRegistryHolder EMERALD_AXE;
    public static ItemRegistryHolder GLOWSTONE_AXE;
    public static ItemRegistryHolder LAPIS_AXE;
    public static ItemRegistryHolder OBSIDIAN_AXE;
    public static ItemRegistryHolder REDSTONE_AXE;
    
    public static void init() {
        TheProsGame.LOGGER.info("Initialising Axes");

        EMERALD_AXE = AXE_REGISTER.registerAxe(new ToolHolder(ToolMaterials.EMERALD, 7f, 1.5f, "emerald_axe"));
        GLOWSTONE_AXE = AXE_REGISTER.registerAxe(new ToolHolder(ToolMaterials.GLOWSTONE, 4f, 2f, "glowstone_axe"));
        LAPIS_AXE = AXE_REGISTER.registerAxe(new ToolHolder(ToolMaterials.LAPIS, 5f, 1f, "lapis_axe"));
        OBSIDIAN_AXE = AXE_REGISTER.registerAxe(new ToolHolder(ToolMaterials.OBSIDIAN, 12f, 0.5f,"obsidian_axe"));
        REDSTONE_AXE = AXE_REGISTER.registerAxe(new ToolHolder(ToolMaterials.REDSTONE, 9f, 1.1f, "redstone_axe"));

        AXE_REGISTER.register();
    }
}
