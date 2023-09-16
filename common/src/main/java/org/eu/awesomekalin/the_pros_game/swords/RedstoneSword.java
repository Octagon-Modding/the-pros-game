package org.eu.awesomekalin.the_pros_game.swords;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class RedstoneSword extends SwordItem {
    public RedstoneSword() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 1700;
            }

            @Override
            public float getSpeed() {
                return 9f;
            }

            @Override
            public float getAttackDamageBonus() {
                return -5f;
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
        }, 9, -1.1f, new Item.Properties());
    }
}
