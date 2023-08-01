package com.avis.uncraftable.item;

import com.avis.uncraftable.Uncraftable;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MYSTICAL_EGG = registerItem("mystical_egg",
            new Item(new FabricItemSettings()));
    public static final Item MALICIOUS_EGG = registerItem("malicious_egg",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Uncraftable.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Uncraftable.LOGGER.info("Registering mod items for uncraftable" + Uncraftable.MOD_ID);
    }
}