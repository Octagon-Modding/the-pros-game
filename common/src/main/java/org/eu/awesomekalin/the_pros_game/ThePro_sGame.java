package org.eu.awesomekalin.the_pros_game;

import org.eu.awesomekalin.the_pros_game.init.AxeInit;
import org.eu.awesomekalin.the_pros_game.init.FoodInit;
import org.eu.awesomekalin.the_pros_game.init.PickaxeInit;
import org.eu.awesomekalin.the_pros_game.init.SwordInit;

public class ThePro_sGame {
    public static final String MOD_ID = "the_pros_game";

    public static void init() {
        SwordInit.SWORDS.register();
        PickaxeInit.PICKAXES.register();
        ProTab.TAB_REGISTER.register();
        AxeInit.AXES.register();
        FoodInit.FOOD.register();
    }
}
