package com.clocken.brokenmirror;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = BrokenMirror.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = BrokenMirror.MODID, value = Dist.CLIENT)
public class BrokenMirrorClient {

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        BrokenMirror.LOGGER.info("Don’t listen to what they say about Broken Mirror!");
    }
}
