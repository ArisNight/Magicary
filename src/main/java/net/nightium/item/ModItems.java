package net.nightium.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nightium.Magicary;

public class ModItems {
    public static final Item BLOOD_SHARD = registerItem("blood_shard", new Item(new Item.Settings()));


    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Magicary.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Magicary.LOGGER.info("Registering Mod Items for " + Magicary.MOD_ID);
    }
}
