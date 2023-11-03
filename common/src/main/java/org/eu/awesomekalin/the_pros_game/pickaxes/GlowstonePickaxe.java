package org.eu.awesomekalin.the_pros_game.pickaxes;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import org.eu.awesomekalin.the_pros_game.ProTab;

public class GlowstonePickaxe extends PickaxeItem {
    public GlowstonePickaxe() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 1000;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 1.0f;
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
        }, 4, 6.0f, new Item.Properties().arch$tab(ProTab.PRO_TAB));
    }
}
