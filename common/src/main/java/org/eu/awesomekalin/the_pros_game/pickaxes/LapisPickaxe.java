package org.eu.awesomekalin.the_pros_game.pickaxes;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class LapisPickaxe extends PickaxeItem {
    public LapisPickaxe() {
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
                return 3.0f;
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
        }, 10, 4.0f, new Item.Properties());
    }
}
