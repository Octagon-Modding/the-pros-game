package org.eu.awesomekalin.the_pros_game.swords;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class GlowstoneSword extends SwordItem {
    public GlowstoneSword() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 1000;
            }

            @Override
            public float getSpeed() {
                return 4f;
            }

            @Override
            public float getAttackDamageBonus() {
                return -4.2f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 13;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.GLOWSTONE_DUST));
            }
        }, 4, -2f, new Item.Properties());
    }
}
