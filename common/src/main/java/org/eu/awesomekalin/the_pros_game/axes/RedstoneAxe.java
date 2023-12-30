package org.eu.awesomekalin.the_pros_game.axes;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.eu.awesomekalin.the_pros_game.ProTab;

public class RedstoneAxe extends AxeItem {
    public RedstoneAxe() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 1700;
            }

            @Override
            public float getSpeed() {
                return 9.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return -3.5f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 9;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.REDSTONE));
            }
        }, 9, -4.5f, new Properties().arch$tab(ProTab.PRO_TAB));
    }
}
