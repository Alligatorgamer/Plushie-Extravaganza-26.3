package net.alligator.plushie_extravaganza.block.entity.custom;

import net.alligator.plushie_extravaganza.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
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

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }

    @Override
    public @Nullable Packet<ClientGamePacketListener> getUpdatePacket() {
        return super.getUpdatePacket();
    }
}
