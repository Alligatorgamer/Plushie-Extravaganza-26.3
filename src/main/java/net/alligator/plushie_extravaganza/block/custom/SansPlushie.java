package net.alligator.plushie_extravaganza.block.custom;

import net.alligator.plushie_extravaganza.block.entity.custom.PlushieEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class SansPlushie extends Plushie{
    public SansPlushie(Properties properties) {
        super(properties);
    }
    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!(level.getBlockEntity(pos) instanceof PlushieEntity plushieEntity)) {
            return super.useWithoutItem(state, level, pos, player, hitResult);
        }

        level.playSound(player, pos, SoundEvents.BLAZE_DEATH, SoundSource.BLOCKS, 2f, 1f);
        plushieEntity.setSquish(0.5f);
        plushieEntity.setTimer(plushieEntity.UNSQUISH);
        return InteractionResult.SUCCESS;
    }
}
