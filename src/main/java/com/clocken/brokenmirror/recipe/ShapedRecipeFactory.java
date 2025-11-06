package com.clocken.brokenmirror.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.ShapedRecipePattern;

/// Represents a factory or constructor for [ShapedRecipe] classes.
///
/// Adapted from Choonster:
/// [Source code](https://github.com/Choonster-Minecraft-Mods/TestMod3/blob/1.21.x/src/main/java/choonster/testmod3/world/item/crafting/recipe/ShapelessRecipeFactory.java)

public interface ShapedRecipeFactory<T extends ShapedRecipe> {
    T createRecipe(
            String group,
            CraftingBookCategory category,
            ShapedRecipePattern pattern,
            ItemStack result,
            boolean showNotification
    );
}
