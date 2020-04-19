package com.tadaatiedye.puzzlecubes.init;

import com.tadaatiedye.puzzlecubes.PuzzleCubes;
import com.tadaatiedye.puzzlecubes.utils.CubeArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorInit {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			PuzzleCubes.MOD_ID);

	// x2 Armor
	public static final RegistryObject<Item> x2cube_helmet = ITEMS.register("x2cube_helmet",
			() -> new ArmorItem(CubeArmorMaterial.X2ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> x2cube_chestplate = ITEMS.register("x2cube_chestplate",
			() -> new ArmorItem(CubeArmorMaterial.X2ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> x2cube_leggings = ITEMS.register("x2cube_leggings",
			() -> new ArmorItem(CubeArmorMaterial.X2ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> x2cube_boots = ITEMS.register("x2cube_boots",
			() -> new ArmorItem(CubeArmorMaterial.X2ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ItemGroup.COMBAT)));

	// x3 Armor
	public static final RegistryObject<Item> x3cube_helmet = ITEMS.register("x3cube_helmet",
			() -> new ArmorItem(CubeArmorMaterial.X3ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> x3cube_chestplate = ITEMS.register("x3cube_chestplate",
			() -> new ArmorItem(CubeArmorMaterial.X3ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> x3cube_leggings = ITEMS.register("x3cube_leggings",
			() -> new ArmorItem(CubeArmorMaterial.X3ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> x3cube_boots = ITEMS.register("x3cube_boots",
			() -> new ArmorItem(CubeArmorMaterial.X3ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ItemGroup.COMBAT)));

	// x4 Armor
	public static final RegistryObject<Item> x4cube_helmet = ITEMS.register("x4cube_helmet",
			() -> new ArmorItem(CubeArmorMaterial.X4ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> x4cube_chestplate = ITEMS.register("x4cube_chestplate",
			() -> new ArmorItem(CubeArmorMaterial.X4ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> x4cube_leggings = ITEMS.register("x4cube_leggings",
			() -> new ArmorItem(CubeArmorMaterial.X4ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> x4cube_boots = ITEMS.register("x4cube_boots",
			() -> new ArmorItem(CubeArmorMaterial.X4ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ItemGroup.COMBAT)));

}
