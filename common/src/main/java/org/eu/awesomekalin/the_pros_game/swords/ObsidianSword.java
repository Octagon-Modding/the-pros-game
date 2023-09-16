package org.eu.awesomekalin.the_pros_game.swords;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class ObsidianSword extends SwordItem {
    public ObsidianSword() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 2000;
            }

            @Override
            public float getSpeed() {
                return 12f;
            }

            @Override
            public float getAttackDamageBonus() {
                return -6f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 7;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.OBSIDIAN));
            }
        }, 12, -0.5f, new Item.Properties());
    }
}
