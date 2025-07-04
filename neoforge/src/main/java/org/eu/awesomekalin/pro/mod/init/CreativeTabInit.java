package org.eu.awesomekalin.pro.mod.init;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.registry.CreativeTabRegistry;

import java.util.ArrayList;
import java.util.List;

public class CreativeTabInit {
    public static final CreativeTabRegistry CREATIVE_REGISTER = new CreativeTabRegistry(TheProsGame.MODID);
    private static final List<ItemRegistryHolder> TAB_CONTENTS = new ArrayList<>();

    public static void init() {
        TheProsGame.LOGGER.info("Initialising Creative Mode Tabs");

        TAB_CONTENTS.add(AxeInit.EMERALD_AXE);
        TAB_CONTENTS.add(SwordInit.EMERALD_SWORD);
        TAB_CONTENTS.add(PickaxeInit.EMERALD_PICKAXE);
        TAB_CONTENTS.add(ShovelInit.EMERALD_SHOVEL);
        TAB_CONTENTS.add(HoeInit.EMERALD_HOE);

        TAB_CONTENTS.add(ArmourInit.EMERALD_HELMET);
        TAB_CONTENTS.add(ArmourInit.EMERALD_CHESTPLATE);
        TAB_CONTENTS.add(ArmourInit.EMERALD_LEGGINGS);
        TAB_CONTENTS.add(ArmourInit.EMERALD_BOOTS);

        TAB_CONTENTS.add(AxeInit.GLOWSTONE_AXE);
        TAB_CONTENTS.add(SwordInit.GLOWSTONE_SWORD);
        TAB_CONTENTS.add(PickaxeInit.GLOWSTONE_PICKAXE);
        TAB_CONTENTS.add(ShovelInit.GLOWSTONE_SHOVEL);
        TAB_CONTENTS.add(HoeInit.GLOWSTONE_HOE);

        TAB_CONTENTS.add(ArmourInit.GLOWSTONE_HELMET);
        TAB_CONTENTS.add(ArmourInit.GLOWSTONE_CHESTPLATE);
        TAB_CONTENTS.add(ArmourInit.GLOWSTONE_LEGGINGS);
        TAB_CONTENTS.add(ArmourInit.GLOWSTONE_BOOTS);

        TAB_CONTENTS.add(AxeInit.LAPIS_AXE);
        TAB_CONTENTS.add(SwordInit.LAPIS_SWORD);
        TAB_CONTENTS.add(PickaxeInit.LAPIS_PICKAXE);
        TAB_CONTENTS.add(ShovelInit.LAPIS_SHOVEL);
        TAB_CONTENTS.add(HoeInit.LAPIS_HOE);

        TAB_CONTENTS.add(ArmourInit.LAPIS_HELMET);
        TAB_CONTENTS.add(ArmourInit.LAPIS_CHESTPLATE);
        TAB_CONTENTS.add(ArmourInit.LAPIS_LEGGINGS);
        TAB_CONTENTS.add(ArmourInit.LAPIS_BOOTS);

        TAB_CONTENTS.add(AxeInit.OBSIDIAN_AXE);
        TAB_CONTENTS.add(SwordInit.OBSIDIAN_SWORD);
        TAB_CONTENTS.add(PickaxeInit.OBSIDIAN_PICKAXE);
        TAB_CONTENTS.add(ShovelInit.OBSIDIAN_SHOVEL);
        TAB_CONTENTS.add(HoeInit.OBSIDIAN_HOE);

        TAB_CONTENTS.add(ArmourInit.OBSIDIAN_HELMET);
        TAB_CONTENTS.add(ArmourInit.OBSIDIAN_CHESTPLATE);
        TAB_CONTENTS.add(ArmourInit.OBSIDIAN_LEGGINGS);
        TAB_CONTENTS.add(ArmourInit.OBSIDIAN_BOOTS);

        TAB_CONTENTS.add(AxeInit.REDSTONE_AXE);
        TAB_CONTENTS.add(SwordInit.REDSTONE_SWORD);
        TAB_CONTENTS.add(PickaxeInit.REDSTONE_PICKAXE);
        TAB_CONTENTS.add(ShovelInit.REDSTONE_SHOVEL);
        TAB_CONTENTS.add(HoeInit.REDSTONE_HOE);

        TAB_CONTENTS.add(ArmourInit.REDSTONE_HELMET);
        TAB_CONTENTS.add(ArmourInit.REDSTONE_CHESTPLATE);
        TAB_CONTENTS.add(ArmourInit.REDSTONE_LEGGINGS);
        TAB_CONTENTS.add(ArmourInit.REDSTONE_BOOTS);

        TAB_CONTENTS.add(FoodInit.PROS_FOOD);

        CREATIVE_REGISTER.registerTab("pro_tab", "itemGroup.progame", SwordInit.EMERALD_SWORD, TAB_CONTENTS);
        CREATIVE_REGISTER.register();
    }
}
