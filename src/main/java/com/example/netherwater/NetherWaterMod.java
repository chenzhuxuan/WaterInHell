package com.example.netherwater;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetherWaterMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("nether-water");

    @Override
    public void onInitialize() {
        LOGGER.info("Nether Water initialized!");
    }
}
