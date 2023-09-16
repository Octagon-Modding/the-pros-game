package org.eu.awesomekalin.the_pros_game.swords;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class EmeraldSword extends SwordItem {
    public EmeraldSword() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 1500;
            }

            @Override
            public float getSpeed() {
                return 7f;
            }

            @Override
            public float getAttackDamageBonus() {
                return -4.8f;
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
                return Ingredient.of(new ItemStack(Items.EMERALD));
            }
        }, 7, -1.5f, new Item.Properties());
    }
}
