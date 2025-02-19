package org.eu.awesomekalin.pro.mod.init;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pro.mod.utils.ToolMaterials;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.holders.ToolHolder;
import org.eu.awesomekalin.pufferfishapi.registry.ItemRegistry;

public class PickaxeInit {
    public static final ItemRegistry PICKAXE_REGISTER = new ItemRegistry(TheProsGame.MODID);

    public static ItemRegistryHolder EMERALD_PICKAXE;
    public static ItemRegistryHolder GLOWSTONE_PICKAXE;
    public static ItemRegistryHolder LAPIS_PICKAXE;
    public static ItemRegistryHolder OBSIDIAN_PICKAXE;
    public static ItemRegistryHolder REDSTONE_PICKAXE;

    public static void init() {
        TheProsGame.LOGGER.info("Initialising Pickaxes");

        EMERALD_PICKAXE = PICKAXE_REGISTER.registerPickaxe(new ToolHolder(ToolMaterials.EMERALD, 7f, 1.5f, "emerald_pickaxe"));
        GLOWSTONE_PICKAXE = PICKAXE_REGISTER.registerPickaxe(new ToolHolder(ToolMaterials.GLOWSTONE, 4f, 2f, "glowstone_pickaxe"));
        LAPIS_PICKAXE = PICKAXE_REGISTER.registerPickaxe(new ToolHolder(ToolMaterials.LAPIS, 5f, 1f, "lapis_pickaxe"));
        OBSIDIAN_PICKAXE = PICKAXE_REGISTER.registerPickaxe(new ToolHolder(ToolMaterials.OBSIDIAN, 12f, 0.5f,"obsidian_pickaxe"));
        REDSTONE_PICKAXE = PICKAXE_REGISTER.registerPickaxe(new ToolHolder(ToolMaterials.REDSTONE, 9f, 1.1f, "redstone_pickaxe"));

        PICKAXE_REGISTER.register();
    }
}
