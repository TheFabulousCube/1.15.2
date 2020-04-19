package com.tadaatiedye.puzzlecubes.init;

import com.tadaatiedye.puzzlecubes.PuzzleCubes;
import com.tadaatiedye.puzzlecubes.utils.CubeItemTier;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolInit {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			PuzzleCubes.MOD_ID);

	// x2 Tools
	public static final RegistryObject<Item> x2cube_sword = ITEMS.register("x2cube_sword",
			() -> new SwordItem(CubeItemTier.X2TIER, 7, 4.0f, new Item.Properties().group(ItemGroup.COMBAT)));	
	public static final RegistryObject<Item> x2cube_pickaxe = ITEMS.register("x2cube_pickaxe",
			() -> new PickaxeItem(CubeItemTier.X2TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));	
	public static final RegistryObject<Item> x2cube_shovel = ITEMS.register("x2cube_shovel",
			() -> new ShovelItem(CubeItemTier.X2TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));	
	public static final RegistryObject<Item> x2cube_axe = ITEMS.register("x2cube_axe",
			() -> new AxeItem(CubeItemTier.X2TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));	
	public static final RegistryObject<Item> x2cube_hoe = ITEMS.register("x2cube_hoe",
			() -> new HoeItem(CubeItemTier.X2TIER, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));

	// x3 Tools
	public static final RegistryObject<Item> x3cube_sword = ITEMS.register("x3cube_sword",
			() -> new SwordItem(CubeItemTier.X3TIER, 7, 4.0f, new Item.Properties().group(ItemGroup.COMBAT)));	
	public static final RegistryObject<Item> x3cube_pickaxe = ITEMS.register("x3cube_pickaxe",
			() -> new PickaxeItem(CubeItemTier.X3TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));	
	public static final RegistryObject<Item> x3cube_shovel = ITEMS.register("x3cube_shovel",
			() -> new ShovelItem(CubeItemTier.X3TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));	
	public static final RegistryObject<Item> x3cube_axe = ITEMS.register("x3cube_axe",
			() -> new AxeItem(CubeItemTier.X3TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));	
	public static final RegistryObject<Item> x3cube_hoe = ITEMS.register("x3cube_hoe",
			() -> new HoeItem(CubeItemTier.X3TIER, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));

	// x4 Tools
	public static final RegistryObject<Item> x4cube_sword = ITEMS.register("x4cube_sword",
			() -> new SwordItem(CubeItemTier.X4TIER, 7, 4.0f, new Item.Properties().group(ItemGroup.COMBAT)));	
	public static final RegistryObject<Item> x4cube_pickaxe = ITEMS.register("x4cube_pickaxe",
			() -> new PickaxeItem(CubeItemTier.X4TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));	
	public static final RegistryObject<Item> x4cube_shovel = ITEMS.register("x4cube_shovel",
			() -> new ShovelItem(CubeItemTier.X4TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));	
	public static final RegistryObject<Item> x4cube_axe = ITEMS.register("x4cube_axe",
			() -> new AxeItem(CubeItemTier.X4TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));	
	public static final RegistryObject<Item> x4cube_hoe = ITEMS.register("x4cube_hoe",
			() -> new HoeItem(CubeItemTier.X4TIER, 4.0f, new Item.Properties().group(ItemGroup.TOOLS)));

}
