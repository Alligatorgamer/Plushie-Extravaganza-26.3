package net.alligator.plushie_extravaganza.block.custom;

import net.alligator.plushie_extravaganza.block.ModBlocks;
import net.alligator.plushie_extravaganza.block.entity.ModBlockEntities;
import net.alligator.plushie_extravaganza.block.entity.custom.PlushieEntity;
import net.alligator.plushie_extravaganza.block.entity.renderer.PlushieEntityRendererState;
import net.alligator.plushie_extravaganza.sound.ModSounds;
import net.minecraft.client.model.Model;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.storage.loot.providers.number.ints.Maximum;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

import static net.minecraft.world.level.block.HorizontalDirectionalBlock.FACING;

public class Plushie extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Block.box(2,0,2,14,15,14);


    public Plushie(final Properties properties, SoundEvent plushSquish, SoundEvent customSound) {
        super(properties);
        this.plushSquish = plushSquish;
        this.customSound = customSound;
    }
    private final SoundEvent plushSquish;
    private final SoundEvent customSound;

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    protected void createBlockStateDefinition(final StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    public BlockState getStateForPlacement(final BlockPlaceContext context) {
        return (BlockState)this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos worldPosition, BlockState blockState) {
        return new PlushieEntity(worldPosition, blockState);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.INVISIBLE;
    }
    PlushieEntity plushieEntity;
    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState blockState, BlockEntityType<T> type) {
        return createTickerHelper(type, ModBlockEntities.PLUSHIE_BE, PlushieEntity::tick);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!(level.getBlockEntity(pos) instanceof PlushieEntity plushieEntity)) {
            return super.useWithoutItem(state, level, pos, player, hitResult);
        }
        level.playSound(null,pos, plushSquish,SoundSource.BLOCKS,1f,
                0.8f + level.getRandom().nextFloat()*0.4f);
        level.playSound(null,pos, customSound,SoundSource.BLOCKS,1,1);
        plushieEntity.setSquish(0.5f);
        plushieEntity.setTimer(plushieEntity.UNSQUISH);
        plushieEntity.setChanged();

            return InteractionResult.SUCCESS;

    }
}
