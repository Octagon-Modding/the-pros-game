package org.eu.awesomekalin.the_pros_game.axes;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import org.eu.awesomekalin.the_pros_game.ProTab;

public class EmeraldAxe extends AxeItem {
    public EmeraldAxe() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 1500;
            }

            @Override
            public float getSpeed() {
                return 7.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return -3.2f;
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
        }, 9, -4.7f, new Item.Properties().arch$tab(ProTab.PRO_TAB));
    }
}
