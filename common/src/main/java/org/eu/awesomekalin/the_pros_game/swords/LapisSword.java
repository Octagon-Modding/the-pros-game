package org.eu.awesomekalin.the_pros_game.swords;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class LapisSword extends SwordItem {
    public LapisSword() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 1700;
            }

            @Override
            public float getSpeed() {
                return 5f;
            }

            @Override
            public float getAttackDamageBonus() {
                return -2.5f;
            }

            @Override
            public int getLevel() {
                return 2;
            }

            @Override
            public int getEnchantmentValue() {
                return 6;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.LAPIS_LAZULI));
            }
        }, 5, -1f, new Item.Properties());
    }
}
