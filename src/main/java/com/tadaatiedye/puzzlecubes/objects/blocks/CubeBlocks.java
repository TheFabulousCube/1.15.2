package com.tadaatiedye.puzzlecubes.objects.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.state.BooleanProperty;

public class CubeBlocks extends DirectionalBlock {

	/** Harvest Level (wood = 0, stone = 1, iron = 2, diamond = 3, gold = 0) */
	/** Max Uses (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
	/** Mining Speed (wood = 2.0f, stone = 4.0f, iron = 6.0f, diamond = 8.0f, gold = 12.0f) */
	/** Damage to Entities (wood = 0.0f, stone = 1.0f, iron = 2.0f, diamond = 3.0f, gold = 0.0f, sword adds 4.0) */
	/** Enchantability (wood = 15, stone = 5, iron = 14, diamond = 10, gold = 22) */


	public static final BooleanProperty IS_SOLVED = null;
	public CubeBlocks(Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(IS_SOLVED, false));
		
	}

	public boolean isSolved (BlockState state)
	{
		return state.get(IS_SOLVED);
	}
}
