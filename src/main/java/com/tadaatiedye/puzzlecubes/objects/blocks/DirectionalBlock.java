package com.tadaatiedye.puzzlecubes.objects.blocks;

import java.util.Random;

import com.tadaatiedye.puzzlecubes.PuzzleCubes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class DirectionalBlock extends Block {
	
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	private Direction[] directions = {Direction.NORTH,Direction.EAST, Direction.SOUTH, Direction.WEST};
	

	public DirectionalBlock(Properties properties) {
		super(properties);
		Random random = new Random();
		Direction randomDirection = directions[random.nextInt(directions.length)];

				PuzzleCubes.LOGGER.info("DirectionalBlock WorldGen: " + this.getBlock().getRegistryName() + randomDirection);
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, randomDirection));
	}
	
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return  this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
	}

	/**
	 * Returns the blockstate with the given rotation from the passed blockstate. If
	 * inapplicable, returns the passed blockstate.
	 * 
	 * @deprecated call via {@link IBlockState#withRotation(Rotation)} whenever
	 *             possible. Implementing/overriding is fine.
	 */
	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING, rot.rotate(state.get(FACING)));
	}

	/**
	 * Returns the blockstate with the given mirror of the passed blockstate. If
	 * inapplicable, returns the passed blockstate.
	 * 
	 * @deprecated call via {@link IBlockState#withMirror(Mirror)} whenever
	 *             possible. Implementing/overriding is fine.
	 */
	@Override
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(FACING)));
	}

	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult result) {
		if (!worldIn.isRemote()) {
			ServerWorld serverWorld = (ServerWorld) worldIn;
			LightningBoltEntity entity = new LightningBoltEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), false);
			serverWorld.addLightningBolt(entity);
		}
		return ActionResultType.SUCCESS;
	}

}
