package org.eu.awesomekalin.the_pros_game.pickaxes;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import org.eu.awesomekalin.the_pros_game.ProTab;

public class LapisPickaxe extends PickaxeItem {
    public LapisPickaxe() {
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
        }, 6, 3.0f, new Item.Properties().arch$tab(ProTab.PRO_TAB));
    }
}
