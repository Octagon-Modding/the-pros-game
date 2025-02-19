package org.eu.awesomekalin.pro.mod.utils;

import org.eu.awesomekalin.pufferfishapi.util.Identifier;
import org.eu.awesomekalin.pufferfishapi.util.ToolMaterial;

public class ToolMaterials {
    public static final ToolMaterial EMERALD = new ToolMaterial(
            new Identifier("minecraft", "incorrect_for_diamond_tool"),
            1500,
            7f,
            -4.8f,
            3,
            new Identifier("c", "gems/emerald")
    );

    public static final ToolMaterial GLOWSTONE = new ToolMaterial(
            new Identifier("minecraft", "incorrect_for_stone_tool"),
            1000,
            4f,
            4.2f,
            13,
            new Identifier("c", "dusts/glowstone")
    );

    public static final ToolMaterial LAPIS = new ToolMaterial(
            new Identifier("minecraft", "incorrect_for_iron_tool"),
            1700,
            5f,
            2.5f,
            6,
            new Identifier("c", "gems/lapis")
    );

    public static final ToolMaterial OBSIDIAN = new ToolMaterial(
            new Identifier("minecraft", "incorrect_for_diamond_tool"),
            2000,
            12f,
            6f,
            7,
            new Identifier("c", "obsidians/normal")
    );

    public static ToolMaterial REDSTONE = new ToolMaterial(
            new Identifier("minecraft", "incorrect_for_iron_tool"),
            1700,
            9f,
            5f,
            9,
            new Identifier("c", "dusts/redstone")
    );
}
