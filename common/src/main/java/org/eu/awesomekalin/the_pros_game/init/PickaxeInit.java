package org.eu.awesomekalin.the_pros_game.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import org.eu.awesomekalin.the_pros_game.ThePro_sGame;
import org.eu.awesomekalin.the_pros_game.pickaxes.EmeraldPickaxe;

public class PickaxeInit {
    public static DeferredRegister<Item> PICKAXES = DeferredRegister.create(ThePro_sGame.MOD_ID, Registries.ITEM);

    public static RegistrySupplier<Item> EMERALD_PICKAXE = PICKAXES.register("emerald_pickaxe", EmeraldPickaxe::new);
}
