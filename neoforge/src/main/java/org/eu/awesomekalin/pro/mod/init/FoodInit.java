package org.eu.awesomekalin.pro.mod.init;

import org.eu.awesomekalin.pro.mod.TheProsGame;
import org.eu.awesomekalin.pufferfishapi.holders.ItemRegistryHolder;
import org.eu.awesomekalin.pufferfishapi.holders.MobEffectHolder;
import org.eu.awesomekalin.pufferfishapi.registry.ItemRegistry;

import java.util.ArrayList;
import java.util.List;

public class FoodInit {
    public static final ItemRegistry FOOD_REGISTRY = new ItemRegistry(TheProsGame.MODID);

    public static ItemRegistryHolder PROS_FOOD;

    public static void init() {
        TheProsGame.LOGGER.info("Initialising Food");

        PROS_FOOD = FOOD_REGISTRY.registerFoodWithEffects("pros_food", 20, 1.0f, true, getProFoodEffects());

        FOOD_REGISTRY.register();
    }

    private static List<MobEffectHolder> getProFoodEffects() {
        List<MobEffectHolder> effectList = new ArrayList<>();

        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.HASTE, 3600, 2, 2.0f));
        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.SWIFTNESS, 3600, 2, 2.0f));
        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.STRENGTH, 3600, 2, 2.0f));
        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.REGENERATION, 3600, 2, 2.0f));
        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.JUMP_BOOST, 3600, 2, 2.0f));
        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.RESISTANCE, 3600, 2, 2.0f));
        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.FIRE_RESISTANCE, 3600, 2, 2.0f));
        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.WATER_BREATHING, 3600, 2, 2.0f));
        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.NIGHT_VISION, 3600, 2, 2.0f));
        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.SATURATION, 3600, 2, 2.0f));
        effectList.add(new MobEffectHolder(MobEffectHolder.EFFECTS.LUCK, 3600, 2, 2.0f));

        return effectList;
    }
}
