// Copyright (c) Daniel-Tayden Larsen 2022 //
// License: Open Source MCLegoMan Software License //

package com.mclegoman.toomanyzombies.registry;

import com.mclegoman.legolib.items.EnchantedItem;
import com.mclegoman.toomanyzombies.main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mclegoman.toomanyzombies.main.MOD_ID;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static final Item ENCHANTMENT_SHARD = registerItem("enchantment_shard",
            new EnchantedItem(new FabricItemSettings().group(ModItemGroup.TMZ_ITEMS).maxCount(8)));

    public static final Item ENCHANTED_ROTTEN_FLESH = registerItem("enchanted_rotten_flesh",
            new EnchantedItem(new FabricItemSettings().group(ModItemGroup.TMZ_ITEMS).food(FoodComponents.ROTTEN_FLESH).maxCount(1)));

    public static void registerModItems() {
        main.LOGGER.info("Registering Items for Mod:", MOD_ID);
    }

}
