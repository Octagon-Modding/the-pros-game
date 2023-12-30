package org.eu.awesomekalin.the_pros_game.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import org.eu.awesomekalin.the_pros_game.ThePro_sGame;
import org.eu.awesomekalin.the_pros_game.axes.EmeraldAxe;
import org.eu.awesomekalin.the_pros_game.axes.GlowstoneAxe;

public class AxeInit {
    public static DeferredRegister<Item> AXES = DeferredRegister.create(ThePro_sGame.MOD_ID, Registries.ITEM);

    public static RegistrySupplier<Item> EMERALD_AXE = AXES.register("emerald_axe", EmeraldAxe::new);
    public static RegistrySupplier<Item> GLOWSTONE_AXE = AXES.register("glowstone_axe", GlowstoneAxe::new);
}
