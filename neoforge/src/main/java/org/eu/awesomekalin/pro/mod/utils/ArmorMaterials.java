package org.eu.awesomekalin.pro.mod.utils;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pufferfishapi.holders.ArmorHolder;
import org.eu.awesomekalin.pufferfishapi.holders.SoundEventsHolder;
import org.eu.awesomekalin.pufferfishapi.util.Identifier;

import static org.eu.awesomekalin.pro.mod.TheProsGame.TAG_PREFIX;

public class ArmorMaterials {
    public static final ArmorHolder EMERALD_ARMOR = new ArmorHolder(
            20,
            2,
            3,
            3,
            2,
            3,
            3,
            SoundEventsHolder.ARMOR_EQUIP_GENERIC,
            7,
            0,
            new Identifier(TAG_PREFIX, "gems/emerald"),
            new Identifier(TheProsGame.MODID, "emerald")
    );

    public static final ArmorHolder GLOWSTONE_ARMOR = new ArmorHolder(
            14,
            1,
            2,
            2,
            1,
            2,
            6,
            SoundEventsHolder.ARMOR_EQUIP_GENERIC,
            3,
            0,
            new Identifier(TAG_PREFIX, "dusts/glowstone"),
            new Identifier(TheProsGame.MODID, "glowstone")
    );

    public static final ArmorHolder LAPIS_ARMOR = new ArmorHolder(
            22,
            1,
            2,
            2,
            1,
            2,
            13,
            SoundEventsHolder.ARMOR_EQUIP_GENERIC,
            3,
            0,
            new Identifier(TAG_PREFIX, "gems/lapis"),
            new Identifier(TheProsGame.MODID, "lapis")
    );

    public static final ArmorHolder OBSIDIAN_ARMOR = new ArmorHolder(
            27,
            3,
            4,
            3,
            2,
            3,
            7,
            SoundEventsHolder.ARMOR_EQUIP_NETHERITE,
            10,
            3,
            new Identifier(TAG_PREFIX, "obsidians/normal"),
            new Identifier(TheProsGame.MODID, "obsidian")
    );

    public static final ArmorHolder REDSTONE_ARMOR = new ArmorHolder(
            14,
            1,
            2,
            2,
            1,
            2,
            9,
            SoundEventsHolder.ARMOR_EQUIP_GENERIC,
            3,
            0,
            new Identifier(TAG_PREFIX, "dusts/redstone"),
            new Identifier(TheProsGame.MODID, "redstone")
    );
}
