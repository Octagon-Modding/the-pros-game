package org.eu.awesomekalin.the_pros_game.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import org.eu.awesomekalin.the_pros_game.ThePro_sGame;
import net.minecraft.world.item.Item;
import org.eu.awesomekalin.the_pros_game.food.ProFood;

public class FoodInit {
    public static DeferredRegister<Item> FOOD = DeferredRegister.create(ThePro_sGame.MOD_ID, Registries.ITEM);

    public static RegistrySupplier<Item> PRO_FOOD = FOOD.register("pro_food", ProFood::new);
}
