package org.eu.awesomekalin.pro.mod.utils;

import org.eu.awesomekalin.pufferfishapi.util.Identifier;
import org.eu.awesomekalin.pufferfishapi.util.ToolMaterial;

import static org.eu.awesomekalin.pro.mod.TheProsGame.TAG_PREFIX;

public class ToolMaterials {
    public static final ToolMaterial EMERALD = new ToolMaterial(
            new Identifier("minecraft", "incorrect_for_diamond_tool"),
            1500,
            7f,
            -4.8f,
            3,
            new Identifier(TAG_PREFIX, "gems/emerald")
    );

    public static final ToolMaterial GLOWSTONE = new ToolMaterial(
            new Identifier("minecraft", "incorrect_for_stone_tool"),
            1000,
            4f,
            4.2f,
            6,
            new Identifier(TAG_PREFIX, "dusts/glowstone")
    );

    public static final ToolMaterial LAPIS = new ToolMaterial(
            new Identifier("minecraft", "incorrect_for_iron_tool"),
            1700,
            5f,
            2.5f,
            13,
            new Identifier(TAG_PREFIX, "gems/lapis")
    );

    public static final ToolMaterial OBSIDIAN = new ToolMaterial(
            new Identifier("minecraft", "incorrect_for_diamond_tool"),
            2000,
            12f,
            6f,
            7,
            new Identifier(TAG_PREFIX, "obsidians/normal")
    );

    public static ToolMaterial REDSTONE = new ToolMaterial(
            new Identifier("minecraft", "incorrect_for_iron_tool"),
            1700,
            9f,
            5f,
            9,
            new Identifier(TAG_PREFIX, "dusts/redstone")
    );
}
