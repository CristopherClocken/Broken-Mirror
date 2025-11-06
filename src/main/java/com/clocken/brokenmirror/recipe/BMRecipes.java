package com.clocken.brokenmirror.recipe;

import com.clocken.brokenmirror.BrokenMirror;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BMRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, BrokenMirror.MODID);

    public static final DeferredHolder<RecipeSerializer<?>, FixedRecipe.Serializer> FIXED_RECIPE = SERIALIZERS.register("shaped_fixed", FixedRecipe.Serializer::new);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
