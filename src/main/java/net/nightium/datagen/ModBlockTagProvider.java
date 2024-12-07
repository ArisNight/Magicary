package net.nightium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.nightium.block.ModBlocks;
import net.nightium.utils.CustomTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLOOD_SHARD_ORE)
                .add(ModBlocks.DEEPSLATE_BLOOD_SHARD_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEEPSLATE_BLOOD_SHARD_ORE)
                .add(ModBlocks.BLOOD_SHARD_ORE);

        getOrCreateTagBuilder(CustomTags.Blocks.NEEDS_BLOOD_TOOL)
                .add(ModBlocks.BLOOD_SHARD_ORE)
                .add(ModBlocks.DEEPSLATE_BLOOD_SHARD_ORE)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
    }
}
