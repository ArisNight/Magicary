package net.nightium.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BloodBlade extends SwordItem {
    public BloodBlade(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient()) {
            user.damage(user.getDamageSources().magic(), 2.0F);
        }
        if (!world.isClient()) {
            spawnRedParticles(world, user);
        }

        return super.use(world, user, hand);
    }

    private void spawnRedParticles(World world, PlayerEntity player) {
        double x = player.getX();
        double y = player.getY();
        double z = player.getZ();

        for (int i = 0; i < 20; ++i) {
            double d = Math.random() * 2.0D - 1.0D;
            double e = Math.random() * 2.0D - 1.0D;
            double f = Math.random() * 2.0D - 1.0D;
            DustParticleEffect dust = new DustParticleEffect(DustParticleEffect.RED, 1.0F); // Красный цвет
            world.addParticle(dust, x + d, y + e, z + f, 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player && !player.getWorld().isClient()) {
            // Восстанавливаем игроку 1 ХП за каждый удар
            player.heal(1.0F);
        }
        return super.postHit(stack, target, attacker);
    }
}
