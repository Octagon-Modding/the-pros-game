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
                return 1250;
            }

            @Override
            public float getSpeed() {
                return 6.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return -1.5f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 15;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.LAPIS_LAZULI));
            }
        }, 10, -4.0f, new Properties().arch$tab(ProTab.PRO_TAB));
    }
}
