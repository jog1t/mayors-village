package com.example.modid;

import com.example.modid.block.custom.CashoutBlock;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "modid";
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Block CASHOUT_BLOCK = new CashoutBlock(Block.Settings.create().strength(4.0f).requiresTool());

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");

        Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, "cashout_block"), CASHOUT_BLOCK);
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "cashout_block"), new BlockItem(CASHOUT_BLOCK, new Item.Settings()));
    }
}