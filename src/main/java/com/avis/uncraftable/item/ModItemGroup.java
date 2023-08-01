package com.avis.uncraftable.item;

import com.avis.uncraftable.Uncraftable;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup UNCRAFTABLE = Registry.register(Registries.ITEM_GROUP, new Identifier(Uncraftable.MOD_ID, "uncraftablegroup"),
            FabricItemGroup.builder().displayName(Text.translatable("Recipes of the Lost"))
                    .icon(() -> new ItemStack(ModItems.MYSTICAL_EGG)).entries((displayContext, entries) -> {
                entries.add(ModItems.MALICIOUS_EGG);
                entries.add(ModItems.MYSTICAL_EGG);
        }).build());
    public static void registerItemGroup() {

        }
}