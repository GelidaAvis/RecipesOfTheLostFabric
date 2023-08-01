package com.avis.uncraftable.util;

import com.avis.uncraftable.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {

    public static void registerModStuffs() {
        registerCustomTrades();
    }

        private static void registerCustomTrades() {
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 28),
                                new ItemStack(ModItems.MYSTICAL_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(ModItems.MALICIOUS_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.GUARDIAN_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.TURTLE_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.AXOLOTL_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.SHEEP_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.PIG_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.COW_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.VEX_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.SHULKER_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.CREEPER_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.SILVERFISH_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.SKELETON_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.STRAY_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.GHAST_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.PIGLIN_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 30),
                                new ItemStack(Items.BLAZE_SPAWN_EGG, 1),
                                5,2,0.02f));
                    });
        }
    }