package com.tadaatiedye.puzzlecubes.world.gen;

import com.tadaatiedye.puzzlecubes.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class CubeBlocksGen {
 
	public CubeBlocksGen() {
	}
	
	/****************************************************
	 * **   Vanilla defaults                          ***
	 * 		COAL_ORE size = 17, count = 20, bottomOffset = 0, topOffset = 0, maximum = 128
	 * 		IRON_ORE size = 9, count = 20, bottomOffset = 0, topOffset = 0, maximum = 64
	 * 		GOLD_ORE size = 9, count = 2, bottomOffset = 0, topOffset = 0, maximum = 32
	 * 		REDSTONE_ORE size = 8, count = 8, bottomOffset = 0, topOffset = 0, maximum = 16
	 * 		DIAMOND_ORE size = 8, count = 1, bottomOffset = 0, topOffset = 0, maximum = 16
	 * 		LAPIS_ORE size = 7, new DepthAverageConfig(count=1, baseline=16, spread=16)
	 **************************************************************************/

	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			// (int count, int bottomOffset, int topOffset, int maximum
			ConfiguredPlacement<CountRangeConfig> x2Config = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128));
//	        LOGGER.info("HELLO from World Gen 2" + x2Config.toString());
	        
			ConfiguredPlacement<CountRangeConfig> x3Config = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64));
//	        LOGGER.info("HELLO from World Gen 3" + x3Config.toString());
	        
			ConfiguredPlacement<CountRangeConfig> x4Config = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 32));
//	        LOGGER.info("HELLO from World Gen 4" + x4Config.config.toString());
			
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.x2block_mixed.get().getDefaultState(), 27))
					.withPlacement(x2Config));
//		        LOGGER.info("HELLO from World Gen x2s added");
		        
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.x3block_mixed.get().getDefaultState(), 20))
						.withPlacement(x3Config));
//		        LOGGER.info("HELLO from World Gen x3s added");
		        		
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.x4block_mixed.get().getDefaultState(), 16))
						.withPlacement(x4Config));
//		        LOGGER.info("HELLO from World Gen x4s added");
		        
		}
	}

}
