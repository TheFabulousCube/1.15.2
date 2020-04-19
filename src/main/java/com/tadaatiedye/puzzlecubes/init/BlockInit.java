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
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = PuzzleCubes.MOD_ID, bus = Bus.MOD)
@ObjectHolder(PuzzleCubes.MOD_ID)
public class BlockInit 
{
	public static final Block x2block_mixed = null;
	public static final Block x2block_solved = null;
	public static final Block x3block_mixed = null;
	public static final Block x3block_solved = null;
	public static final Block x4block_mixed = null;
	public static final Block x4block_solved = null;
	
	@SubscribeEvent
	public static void registerBlock(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(new DirectionalBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 100.0f)
				.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)).setRegistryName("x2block_mixed"));
		event.getRegistry().register(new DirectionalBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 100.0f)
				.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)).setRegistryName("x2block_solved"));
		event.getRegistry().register(new DirectionalBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 100.0f)
				.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)).setRegistryName("x3block_mixed"));
		event.getRegistry().register(new DirectionalBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 100.0f)
				.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)).setRegistryName("x3block_solved"));
		event.getRegistry().register(new DirectionalBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 100.0f)
				.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)).setRegistryName("x4block_mixed"));
		event.getRegistry().register(new DirectionalBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 100.0f)
				.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(CubeSoundTypes.CUBE)).setRegistryName("x4block_solved"));
	}	
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new BlockItem(x2block_mixed, new Item.Properties().maxStackSize(16).group(ItemGroup.BUILDING_BLOCKS)
				.food(new Food.Builder()
						.hunger(4).saturation(2.4f)
						.build()))
				.setRegistryName("x2block_mixed"));
		event.getRegistry().register(new BlockItem(x2block_solved, new Item.Properties().maxStackSize(16).group(ItemGroup.BUILDING_BLOCKS)				
				.food(new Food.Builder()
						.hunger(4).saturation(2.4f)
					.build()))
				.setRegistryName("x2block_solved"));
		event.getRegistry().register(new BlockItem(x3block_mixed, new Item.Properties().maxStackSize(16).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("x3block_mixed"));
		event.getRegistry().register(new BlockItem(x3block_solved, new Item.Properties().maxStackSize(16).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("x3block_solved"));
		event.getRegistry().register(new BlockItem(x4block_mixed, new Item.Properties().maxStackSize(16).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("x4block_mixed"));
		event.getRegistry().register(new BlockItem(x4block_solved, new Item.Properties().maxStackSize(16).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("x4block_solved"));
	}
}
