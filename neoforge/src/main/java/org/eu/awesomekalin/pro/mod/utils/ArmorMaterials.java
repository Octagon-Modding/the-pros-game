package org.eu.awesomekalin.pro.mod.utils;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pufferfishapi.holders.ArmorHolder;
import org.eu.awesomekalin.pufferfishapi.holders.SoundEventsHolder;
import org.eu.awesomekalin.pufferfishapi.util.Identifier;

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
            new Identifier("c", "gems/emerald"),
            new Identifier(TheProsGame.MODID, "emerald")
    );
}
