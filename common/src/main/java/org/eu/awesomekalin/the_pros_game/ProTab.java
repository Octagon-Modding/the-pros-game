package org.eu.awesomekalin.the_pros_game;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.eu.awesomekalin.the_pros_game.init.SwordInit;

public class ProTab {
    public static final DeferredRegister<CreativeModeTab> TAB_REGISTER = DeferredRegister.create(ThePro_sGame.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> PRO_TAB = TAB_REGISTER.register("pro_tab", () -> CreativeTabRegistry.create(
            Component.translatable("category.pro_tab"),
            () -> new ItemStack(SwordInit.EMERALD_SWORD.get())
    ));
}
