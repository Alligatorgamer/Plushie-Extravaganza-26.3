package net.alligator.plushie_extravaganza.block.entity.custom;

import net.alligator.plushie_extravaganza.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.Nullable;

public class PlushieEntity extends BlockEntity {
    public PlushieEntity(BlockPos worldPosition, BlockState blockState) {
        super(ModBlockEntities.PLUSHIE_BE, worldPosition, blockState);
    }

    @Override
    public void setChanged() {
        super.setChanged();
        if(level.isClientSide()) {
            level.sendBlockUpdated(worldPosition, this.getBlockState(), this.getBlockState(), 3);
        }
    }
    private boolean enabled;

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        setChanged();
    }

    private float squish;

    public float getSquish() {
        return squish;
    }

    public void setSquish(float value) {
        this.squish = Math.max(value, 0);
        setChanged();
    }
    private int timer;

    public int getTimer() {
        return timer;
    }

    public void setTimer(int value) {
        this.timer = value;
        setChanged();
    }


    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }

    @Override
    public @Nullable Packet<ClientGamePacketListener> getUpdatePacket() {
        return super.getUpdatePacket();
    }

    public static final int UNSQUISH = 4;

    public static void tick(Level level, BlockPos blockPos, BlockState blockState, PlushieEntity plushieEntity) {
        if (plushieEntity.getTimer() > 0) {
            plushieEntity.setTimer(plushieEntity.timer - 1);
        }
    }
}
