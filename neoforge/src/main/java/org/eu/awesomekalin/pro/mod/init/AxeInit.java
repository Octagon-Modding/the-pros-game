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

        EMERALD_AXE = AXE_REGISTER.registerAxe(new ToolHolder(ToolMaterials.EMERALD, 9.1f, 1.95f, "emerald_axe"));
        GLOWSTONE_AXE = AXE_REGISTER.registerAxe(new ToolHolder(ToolMaterials.GLOWSTONE, 5.2f, 2.6f, "glowstone_axe"));
        LAPIS_AXE = AXE_REGISTER.registerAxe(new ToolHolder(ToolMaterials.LAPIS, 6.5f, 1.3f, "lapis_axe"));
        OBSIDIAN_AXE = AXE_REGISTER.registerAxe(new ToolHolder(ToolMaterials.OBSIDIAN, 15.6f, 0.65f,"obsidian_axe"));
        REDSTONE_AXE = AXE_REGISTER.registerAxe(new ToolHolder(ToolMaterials.REDSTONE, 11.7f, 1.43f, "redstone_axe"));

        AXE_REGISTER.register();
    }
}
