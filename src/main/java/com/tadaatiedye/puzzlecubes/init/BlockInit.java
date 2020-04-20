package com.tadaatiedye.puzzlecubes.init;

import com.tadaatiedye.puzzlecubes.PuzzleCubes;
import com.tadaatiedye.puzzlecubes.objects.blocks.DirectionalBlock;
import com.tadaatiedye.puzzlecubes.utils.CubeSoundTypes;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			PuzzleCubes.MOD_ID);

	public static final DeferredRegister<Item> BLOCK_ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			PuzzleCubes.MOD_ID);

// blocks  CubeSoundTypes.CUBE
	public static final RegistryObject<Block> x2block_mixed = BLOCKS.register("x2block_mixed",
			() -> new DirectionalBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 100.0f)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)));

	public static final RegistryObject<Block> x2block_solved = BLOCKS.register("x2block_solved",
			() -> new DirectionalBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 100.0f)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)));

	public static final RegistryObject<Block> x3block_mixed = BLOCKS.register("x3block_mixed",
			() -> new DirectionalBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 100.0f)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)));

	public static final RegistryObject<Block> x3block_solved = BLOCKS.register("x3block_solved",
			() -> new DirectionalBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 100.0f)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)));

	public static final RegistryObject<Block> x4block_mixed = BLOCKS.register("x4block_mixed",
			() -> new DirectionalBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.5f, 100.0f)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)));

	public static final RegistryObject<Block> x4block_solved = BLOCKS.register("x4block_solved",
			() -> new DirectionalBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.5f, 100.0f)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)));

	// block items
	public static final RegistryObject<Item> x2Block_mixed = BLOCK_ITEMS.register("x2block_mixed",
			() -> new BlockItem(x2block_mixed.get(), new Item.Properties().maxStackSize(16)
					.group(ItemGroup.BUILDING_BLOCKS).food(new Food.Builder().hunger(4).saturation(2.4f).build())));
	public static final RegistryObject<Item> x2Block_solved = BLOCK_ITEMS.register("x2block_solved",
			() -> new BlockItem(x2block_solved.get(), new Item.Properties().maxStackSize(16)
					.group(ItemGroup.BUILDING_BLOCKS).food(new Food.Builder().hunger(4).saturation(2.4f).build())));
	
	public static final RegistryObject<Item> x3Block_mixed = BLOCK_ITEMS.register("x3block_mixed",
			() -> new BlockItem(x3block_mixed.get(),
					new Item.Properties().maxStackSize(16).group(ItemGroup.BUILDING_BLOCKS)));	
	public static final RegistryObject<Item> x3Block_solved = BLOCK_ITEMS.register("x3block_solved",
			() -> new BlockItem(x3block_solved.get(),
					new Item.Properties().maxStackSize(16).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> x4Block_mixed = BLOCK_ITEMS.register("x4block_mixed",
			() -> new BlockItem(x4block_mixed.get(),
					new Item.Properties().maxStackSize(16).group(ItemGroup.BUILDING_BLOCKS)));	
	public static final RegistryObject<Item> x4Block_solved = BLOCK_ITEMS.register("x4block_solved",
			() -> new BlockItem(x4block_solved.get(),
					new Item.Properties().maxStackSize(16).group(ItemGroup.BUILDING_BLOCKS)));
}
