// Copyright (c) Daniel-Tayden Larsen 2022 //
// License: Open Source MCLegoMan Software License //

package com.mclegoman.toomanyzombies.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static com.mclegoman.toomanyzombies.main.MOD_ID;


public class ModItemGroup {
    public static final ItemGroup TMZ_ITEMS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "tmz_items"),
            () -> new ItemStack(ModItems.ENCHANTMENT_SHARD));
}
