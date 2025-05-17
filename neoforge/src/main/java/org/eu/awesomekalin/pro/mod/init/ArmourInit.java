package org.eu.awesomekalin.pro.mod.init;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pro.mod.utils.ArmorMaterials;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.registry.ItemRegistry;

public class ArmourInit {
    public static final ItemRegistry ARMOR_REGISTRY = new ItemRegistry(TheProsGame.MODID);

    // Emerald Armor
    public static ItemRegistryHolder EMERALD_HELMET;
    public static ItemRegistryHolder EMERALD_CHESTPLATE;
    public static ItemRegistryHolder EMERALD_LEGGINGS;
    public static ItemRegistryHolder EMERALD_BOOTS;

    // Glowstone Armor
    public static ItemRegistryHolder GLOWSTONE_HELMET;
    public static ItemRegistryHolder GLOWSTONE_CHESTPLATE;
    public static ItemRegistryHolder GLOWSTONE_LEGGINGS;
    public static ItemRegistryHolder GLOWSTONE_BOOTS;

    public static void init() {
        TheProsGame.LOGGER.info("Initialising Armour");

        // Emerald Armor
        EMERALD_HELMET = ARMOR_REGISTRY.registerHelmet("emerald_helmet", ArmorMaterials.EMERALD_ARMOR);
        EMERALD_CHESTPLATE = ARMOR_REGISTRY.registerChestplate("emerald_chestplate", ArmorMaterials.EMERALD_ARMOR);
        EMERALD_LEGGINGS = ARMOR_REGISTRY.registerLeggings("emerald_leggings", ArmorMaterials.EMERALD_ARMOR);
        EMERALD_BOOTS = ARMOR_REGISTRY.registerBoots("emerald_boots", ArmorMaterials.EMERALD_ARMOR);

        // Glowstone Armor
        GLOWSTONE_HELMET = ARMOR_REGISTRY.registerHelmet("glowstone_helmet", ArmorMaterials.GLOWSTONE_ARMOR);
        GLOWSTONE_CHESTPLATE = ARMOR_REGISTRY.registerChestplate("glowstone_chestplate", ArmorMaterials.GLOWSTONE_ARMOR);
        GLOWSTONE_LEGGINGS = ARMOR_REGISTRY.registerLeggings("glowstone_leggings", ArmorMaterials.GLOWSTONE_ARMOR);
        GLOWSTONE_BOOTS = ARMOR_REGISTRY.registerBoots("glowstone_boots", ArmorMaterials.GLOWSTONE_ARMOR);

        ARMOR_REGISTRY.register();
    }
}
