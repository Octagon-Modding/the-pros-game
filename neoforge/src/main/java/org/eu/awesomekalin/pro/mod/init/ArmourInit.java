package org.eu.awesomekalin.pro.mod.init;

import net.minecraft.sounds.SoundEvents;
import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pro.mod.utils.ArmorMaterials;
import org.eu.awesomekalin.pufferfishapi.holders.ArmorHolder;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.holders.SoundEventsHolder;
import org.eu.awesomekalin.pufferfishapi.registry.ItemRegistry;
import org.eu.awesomekalin.pufferfishapi.util.Identifier;

public class ArmourInit {
    public static final ItemRegistry ARMOR_REGISTRY = new ItemRegistry(TheProsGame.MODID);

    // Emerald Armor
    public static ItemRegistryHolder EMERALD_HELMET;
    public static ItemRegistryHolder EMERALD_CHESTPLATE;
    public static ItemRegistryHolder EMERALD_LEGGINGS;
    public static ItemRegistryHolder EMERALD_BOOTS;

    public static void init() {
        TheProsGame.LOGGER.info("Initialising Armour");

        EMERALD_HELMET = ARMOR_REGISTRY.registerHelmet("emerald_helmet", ArmorMaterials.EMERALD_ARMOR);
        EMERALD_CHESTPLATE = ARMOR_REGISTRY.registerChestplate("emerald_chestplate", ArmorMaterials.EMERALD_ARMOR);
        EMERALD_LEGGINGS = ARMOR_REGISTRY.registerLeggings("emerald_leggings", ArmorMaterials.EMERALD_ARMOR);
        EMERALD_BOOTS = ARMOR_REGISTRY.registerBoots("emerald_boots", ArmorMaterials.EMERALD_ARMOR);

        ARMOR_REGISTRY.register();
    }
}
