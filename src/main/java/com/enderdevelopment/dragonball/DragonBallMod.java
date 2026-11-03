package com.enderdevelopment.dragonball;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DragonBallMod implements ModInitializer {
    public static final String MOD_ID = "dragonball";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Dragon Ball Mod initialized!");
    }
}