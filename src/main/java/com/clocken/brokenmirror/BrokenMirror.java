package com.clocken.brokenmirror;

import com.clocken.brokenmirror.recipe.BMRecipes;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(BrokenMirror.MODID)
public class BrokenMirror {
    public static final String MODID = "brokenmirror";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BrokenMirror(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        BMRecipes.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
