package net.alligator.plushie_extravaganza.block.entity.custom;

import net.alligator.plushie_extravaganza.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.jspecify.annotations.Nullable;

public class PlushieEntity extends BlockEntity {
    public PlushieEntity(BlockPos worldPosition, BlockState blockState) {
        super(ModBlockEntities.PLUSHIE_BE, worldPosition, blockState);
    }

    @Override
    public void setChanged() {
        super.setChanged();
        if (level == null) return;

        BlockState state = getBlockState();
        level.sendBlockUpdated(worldPosition, this.getBlockState(), this.getBlockState(), Block.UPDATE_ALL);

        if(level.isClientSide()) {
            level.sendBlockUpdated(worldPosition, this.getBlockState(), this.getBlockState(), 3);
        }
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        output.putFloat("squish",this.squish);
        output.putInt("timer",this.timer);
        setChanged();

        super.saveAdditional(output);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);

        this.squish = input.getFloatOr("squish",1);
        this.squish = input.getIntOr("timer",0);
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
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public static final int UNSQUISH = 4;

    public static void tick(Level level, BlockPos blockPos, BlockState blockState, PlushieEntity plushieEntity) {
        if (plushieEntity.getTimer() > 0) {
            plushieEntity.setTimer(plushieEntity.timer - 1);
        }
    }
}
