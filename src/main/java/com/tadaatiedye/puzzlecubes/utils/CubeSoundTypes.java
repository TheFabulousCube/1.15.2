package com.tadaatiedye.puzzlecubes.utils;

import com.tadaatiedye.puzzlecubes.init.SoundInit;

import net.minecraft.block.SoundType;

public class CubeSoundTypes {

	public static final SoundType CUBE = new SoundType(0.7F, 1.0F, 
			SoundInit.BLOCK_CUBE_BREAK,
			SoundInit.BLOCK_CUBE_STEP, 
			SoundInit.BLOCK_CUBE_PLACE, 
			SoundInit.BLOCK_CUBE_HIT, 
			SoundInit.BLOCK_CUBE_FALL);

//	   public static final Material ROCK = (new Material.Builder(MaterialColor.STONE)).requiresTool().build();
}
