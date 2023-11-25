package org.eu.awesomekalin.the_pros_game.pickaxes;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import org.eu.awesomekalin.the_pros_game.ProTab;

public class ObsidianPickaxe extends PickaxeItem {
    public ObsidianPickaxe() {
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
                return 2.0f;
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
        }, 4, 12.0f, new Item.Properties().arch$tab(ProTab.PRO_TAB));
    }
}
