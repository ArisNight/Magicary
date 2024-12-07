package net.nightium.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.nightium.Magicary;


public class ModBlocks {

    public static final Block BLOOD_SHARD_ORE = registerBlock("blood_shard_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_BLOOD_SHARD_ORE = registerBlock("deepslate_blood_shard_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Magicary.MOD_ID,
                name), block);
    }
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Magicary.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){
        Magicary.LOGGER.info("Registering Mod Blocks for " + Magicary.MOD_ID);
    }
}
