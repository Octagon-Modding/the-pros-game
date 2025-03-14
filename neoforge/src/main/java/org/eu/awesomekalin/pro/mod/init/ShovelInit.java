package org.eu.awesomekalin.pro.mod.init;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pro.mod.utils.ToolMaterials;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.holders.ToolHolder;
import org.eu.awesomekalin.pufferfishapi.registry.ItemRegistry;

public class ShovelInit {
    public static final ItemRegistry SHOVEL_REGISTRY = new ItemRegistry(TheProsGame.MODID);

    public static ItemRegistryHolder EMERALD_SHOVEL;
    public static ItemRegistryHolder GLOWSTONE_SHOVEL;
    public static ItemRegistryHolder LAPIS_SHOVEL;
    public static ItemRegistryHolder OBSIDIAN_SHOVEL;
    public static ItemRegistryHolder REDSTONE_SHOVEL;

    public static void init() {
        TheProsGame.LOGGER.info("Initialising Shovels");

        EMERALD_SHOVEL = SHOVEL_REGISTRY.registerShovel(new ToolHolder(ToolMaterials.EMERALD, 2.1f, 0.45f, "emerald_shovel"));
        GLOWSTONE_SHOVEL = SHOVEL_REGISTRY.registerShovel(new ToolHolder(ToolMaterials.GLOWSTONE, 1.2f, 0.6f, "glowstone_shovel"));
        LAPIS_SHOVEL = SHOVEL_REGISTRY.registerShovel(new ToolHolder(ToolMaterials.LAPIS, 1.5f, 0.3f, "lapis_shovel"));
        OBSIDIAN_SHOVEL = SHOVEL_REGISTRY.registerShovel(new ToolHolder(ToolMaterials.OBSIDIAN, 3.6f, 0.15f, "obsidian_shovel"));
        REDSTONE_SHOVEL = SHOVEL_REGISTRY.registerShovel(new ToolHolder(ToolMaterials.REDSTONE, 2.7f, 0.33f, "redstone_shovel"));

        SHOVEL_REGISTRY.register();
    }
}
