package net.nightium.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nightium.Magicary;
import net.nightium.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup RITUALS = Registry.register(Registries.ITEM_GROUP, //Предметы для риуалов
            Identifier.of(Magicary.MOD_ID, "rituals"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BLOOD_SHARD))
                    .displayName(Text.translatable("itemgroups.magicary.rituals"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.BLOOD_SHARD);
                    }).build());

    public static final ItemGroup TOOLS = Registry.register(Registries.ITEM_GROUP, //Оружия и инструменты
            Identifier.of(Magicary.MOD_ID, "tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BLOOD_SHARD))
                    .displayName(Text.translatable("itemgroups.magicary.tools"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLOOD_SHARD);
                    }).build());

    public static final ItemGroup JEWELRY = Registry.register(Registries.ITEM_GROUP, //Драгоценности
            Identifier.of(Magicary.MOD_ID, "jewerly"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLOOD_SHARD_ORE))
                    .displayName(Text.translatable("itemgroups.magicary.jewerly"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLOOD_SHARD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_BLOOD_SHARD_ORE);
                    }).build());

    public static final ItemGroup SPELLS = Registry.register(Registries.ITEM_GROUP, //Заклинания
            Identifier.of(Magicary.MOD_ID, "spells"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BLOOD_SHARD))
                    .displayName(Text.translatable("itemgroups.magicary.spells"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLOOD_SHARD);
                    }).build());

    public static void registerItemGroups(){
        Magicary.LOGGER.info("Registering Item Group for " + Magicary.MOD_ID);
    }
}
