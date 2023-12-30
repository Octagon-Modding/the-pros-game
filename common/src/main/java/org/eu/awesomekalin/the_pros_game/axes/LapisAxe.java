package org.eu.awesomekalin.the_pros_game.axes;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.eu.awesomekalin.the_pros_game.ProTab;

public class LapisAxe extends AxeItem {
    public LapisAxe() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 1850;
            }

            @Override
            public float getSpeed() {
                return 10.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return -3.0f;
            }

            @Override
            public int getLevel() {
                return 4;
            }

            @Override
            public int getEnchantmentValue() {
                return 10;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.LAPIS_LAZULI));
            }
        }, 10, -4.0f, new Properties().arch$tab(ProTab.PRO_TAB));
    }
}
