package org.eu.awesomekalin.the_pros_game.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import org.eu.awesomekalin.the_pros_game.ThePro_sGame;
import org.eu.awesomekalin.the_pros_game.swords.EmeraldSword;
import org.eu.awesomekalin.the_pros_game.swords.ObsidianSword;

public class SwordInit {
    public static DeferredRegister<Item> SWORDS = DeferredRegister.create(ThePro_sGame.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> EMERALD_SWORD = SWORDS.register("emerald_sword", EmeraldSword::new);
    public static final RegistrySupplier<Item> OBSIDIAN_SWORD = SWORDS.register("obsidian_sword", ObsidianSword::new);
}
