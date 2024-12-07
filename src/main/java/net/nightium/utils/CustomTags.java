package net.nightium.utils;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.nightium.Magicary;

public class CustomTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_BLOOD_TOOL = createTag("needs_blood_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLOOD_TOOL = createTag("incorrect_for_blood_tool");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Magicary.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Magicary.MOD_ID, name));
        }
    }
}
