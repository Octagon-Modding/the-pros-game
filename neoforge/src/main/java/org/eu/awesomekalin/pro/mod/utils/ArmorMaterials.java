package org.eu.awesomekalin.pro.mod.utils;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pufferfishapi.PufferfishAPI;
import org.eu.awesomekalin.pufferfishapi.holders.ArmorHolder;
import org.eu.awesomekalin.pufferfishapi.holders.SoundEventsHolder;
import org.eu.awesomekalin.pufferfishapi.util.Identifier;

public class ArmorMaterials {
    public static final String TAG_PREFIX;

    static {
        if ("1.20.6".equals(PufferfishAPI.getMinecraftVersion()) &&
                "Forge".equalsIgnoreCase(PufferfishAPI.getModLoader())) {
            TAG_PREFIX = "forge";
        } else {
            TAG_PREFIX = "c";
        }
    }

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
            15,
            1,
            2,
            2,
            1,
            2,
            13,
            SoundEventsHolder.ARMOR_EQUIP_GENERIC,
            3,
            0,
            new Identifier(TAG_PREFIX, "dusts/glowstone"),
            new Identifier(TheProsGame.MODID, "glowstone")
    );
}
