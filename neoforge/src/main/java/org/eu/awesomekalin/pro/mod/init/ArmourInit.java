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

    // Lapis Armor
    public static ItemRegistryHolder LAPIS_HELMET;
    public static ItemRegistryHolder LAPIS_CHESTPLATE;
    public static ItemRegistryHolder LAPIS_LEGGINGS;
    public static ItemRegistryHolder LAPIS_BOOTS;

    // Obsidian Armor
    public static ItemRegistryHolder OBSIDIAN_HELMET;
    public static ItemRegistryHolder OBSIDIAN_CHESTPLATE;
    public static ItemRegistryHolder OBSIDIAN_LEGGINGS;
    public static ItemRegistryHolder OBSIDIAN_BOOTS;

    // Redstone Armor
    public static ItemRegistryHolder REDSTONE_HELMET;
    public static ItemRegistryHolder REDSTONE_CHESTPLATE;
    public static ItemRegistryHolder REDSTONE_LEGGINGS;
    public static ItemRegistryHolder REDSTONE_BOOTS;

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

        // Lapis Armor
        LAPIS_HELMET = ARMOR_REGISTRY.registerHelmet("lapis_helmet", ArmorMaterials.LAPIS_ARMOR);
        LAPIS_CHESTPLATE = ARMOR_REGISTRY.registerChestplate("lapis_chestplate", ArmorMaterials.LAPIS_ARMOR);
        LAPIS_LEGGINGS = ARMOR_REGISTRY.registerLeggings("lapis_leggings", ArmorMaterials.LAPIS_ARMOR);
        LAPIS_BOOTS = ARMOR_REGISTRY.registerBoots("lapis_boots", ArmorMaterials.LAPIS_ARMOR);

        // Obsidian Armor
        OBSIDIAN_HELMET = ARMOR_REGISTRY.registerHelmet("obsidian_helmet", ArmorMaterials.OBSIDIAN_ARMOR);
        OBSIDIAN_CHESTPLATE = ARMOR_REGISTRY.registerChestplate("obsidian_chestplate", ArmorMaterials.OBSIDIAN_ARMOR);
        OBSIDIAN_LEGGINGS = ARMOR_REGISTRY.registerLeggings("obsidian_leggings", ArmorMaterials.OBSIDIAN_ARMOR);
        OBSIDIAN_BOOTS = ARMOR_REGISTRY.registerBoots("obsidian_boots", ArmorMaterials.OBSIDIAN_ARMOR);

        // Redstone Armor
        REDSTONE_HELMET = ARMOR_REGISTRY.registerHelmet("redstone_helmet", ArmorMaterials.REDSTONE_ARMOR);
        REDSTONE_CHESTPLATE = ARMOR_REGISTRY.registerChestplate("redstone_chestplate", ArmorMaterials.REDSTONE_ARMOR);
        REDSTONE_LEGGINGS = ARMOR_REGISTRY.registerLeggings("redstone_leggings", ArmorMaterials.REDSTONE_ARMOR);
        REDSTONE_BOOTS = ARMOR_REGISTRY.registerBoots("redstone_boots", ArmorMaterials.REDSTONE_ARMOR);

        ARMOR_REGISTRY.register();
    }
}
