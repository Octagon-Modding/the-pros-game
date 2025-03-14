package org.eu.awesomekalin.pro.mod.init;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pro.mod.utils.ToolMaterials;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.holders.ToolHolder;
import org.eu.awesomekalin.pufferfishapi.registry.ItemRegistry;

public class HoeInit {
    public static final ItemRegistry HOE_REGISTRY = new ItemRegistry(TheProsGame.MODID);

    public static ItemRegistryHolder EMERALD_HOE;
    public static ItemRegistryHolder GLOWSTONE_HOE;
    public static ItemRegistryHolder LAPIS_HOE;
    public static ItemRegistryHolder OBSIDIAN_HOE;
    public static ItemRegistryHolder REDSTONE_HOE;

    public static void init() {
        TheProsGame.LOGGER.info("Initialising Hoes");

        EMERALD_HOE = HOE_REGISTRY.registerHoe(new ToolHolder(ToolMaterials.EMERALD, 2.8f, 0.6f, "emerald_hoe"));
        GLOWSTONE_HOE = HOE_REGISTRY.registerHoe(new ToolHolder(ToolMaterials.GLOWSTONE, 1.6f, 0.8f, "glowstone_hoe"));
        LAPIS_HOE = HOE_REGISTRY.registerHoe(new ToolHolder(ToolMaterials.LAPIS, 2f, 0.2f, "lapis_hoe"));
        OBSIDIAN_HOE = HOE_REGISTRY.registerHoe(new ToolHolder(ToolMaterials.OBSIDIAN, 4.8f, 0.2f, "obsidian_hoe"));
        REDSTONE_HOE = HOE_REGISTRY.registerHoe(new ToolHolder(ToolMaterials.REDSTONE, 3.6f, 0.44f, "redstone_hoe"));

        HOE_REGISTRY.register();
    }
}
