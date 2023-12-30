package org.eu.awesomekalin.the_pros_game.axes;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.eu.awesomekalin.the_pros_game.ProTab;

public class ObsidianAxe extends AxeItem {
    public ObsidianAxe() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 2000;
            }

            @Override
            public float getSpeed() {
                return 12.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return -4.0f;
            }

            @Override
            public int getLevel() {
                return 4;
            }

            @Override
            public int getEnchantmentValue() {
                return 7;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.OBSIDIAN));
            }
        }, 7, -3.5f, new Properties().arch$tab(ProTab.PRO_TAB));
    }
}
