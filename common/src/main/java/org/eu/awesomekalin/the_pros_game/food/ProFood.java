package org.eu.awesomekalin.the_pros_game.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import org.eu.awesomekalin.the_pros_game.ProTab;

public class ProFood extends Item {
    public ProFood() {
        super(new Item.Properties()
                .food(new FoodProperties.Builder()
                        .alwaysEat()
                        .nutrition(20)
                        .saturationMod(1.0f)
                        .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 2), 2.0f)
                        .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 2), 2.0f)
                        .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2), 2.0f)
                        .effect(new MobEffectInstance(MobEffects.REGENERATION, 3600, 2), 2.0f)
                        .effect(new MobEffectInstance(MobEffects.JUMP, 3600, 2), 2.0f)
                        .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 2), 2.0f)
                        .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 2), 2.0f)
                        .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 2), 2.0f)
                        .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 2), 2.0f)
                        .effect(new MobEffectInstance(MobEffects.SATURATION, 3600, 2), 2.0f)
                        .effect(new MobEffectInstance(MobEffects.LUCK, 3600, 2), 2.0f)
                        .build())
                .rarity(Rarity.EPIC)
                .arch$tab(ProTab.PRO_TAB));
    }
}
