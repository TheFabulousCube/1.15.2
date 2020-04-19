package com.tadaatiedye.puzzlecubes.init;

import java.util.function.Supplier;

import com.tadaatiedye.puzzlecubes.PuzzleCubes;
import com.tadaatiedye.puzzlecubes.utils.CubeItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = PuzzleCubes.MOD_ID, bus = Bus.MOD)
@ObjectHolder(PuzzleCubes.MOD_ID)
public class ItemInit {
	// public static final Item x2block_mixed = null;

	/*
	 * // tools public static final Item x2cube_sword = null; public static final
	 * Item x2cube_pickaxe = null; public static final Item x2cube_shovel = null;
	 * public static final Item x2cube_axe = null; public static final Item
	 * x2cube_hoe = null;
	 * 
	 * public static final Item x3cube_sword = null; public static final Item
	 * x3cube_pickaxe = null; public static final Item x3cube_shovel = null; public
	 * static final Item x3cube_axe = null; public static final Item x3cube_hoe =
	 * null;
	 * 
	 * public static final Item x4cube_sword = null; public static final Item
	 * x4cube_pickaxe = null; public static final Item x4cube_shovel = null; public
	 * static final Item x4cube_axe = null; public static final Item x4cube_hoe =
	 * null;
	 */

	// armor
	public static final Item x2cube_helmet = null;
	public static final Item x2cube_chestplate = null;
	public static final Item x2cube_leggings = null;
	public static final Item x2cube_boots = null;

	public static final Item x3cube_helmet = null;
	public static final Item x3cube_chestplate = null;
	public static final Item x3cube_leggings = null;
	public static final Item x3cube_boots = null;

	public static final Item x4cube_helmet = null;
	public static final Item x4cube_chestplate = null;
	public static final Item x4cube_leggings = null;
	public static final Item x4cube_boots = null;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		// event.getRegistry().register(new Item(new
		// Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("x2block_mixed"));
		

		/** Harvest Level (wood = 0, stone = 1, iron = 2, diamond = 3, gold = 0) */
		/** Max Uses (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
		/** Mining Speed (wood = 2.0f, stone = 4.0f, iron = 6.0f, diamond = 8.0f, gold = 12.0f) */
		/** Damage to Entities (wood = 0.0f, stone = 1.0f, iron = 2.0f, diamond = 3.0f, gold = 0.0f, sword adds 4.0) */
		/** Enchantability (wood = 15, stone = 5, iron = 14, diamond = 10, gold = 22) */
		
		// Tools
//		event.getRegistry()
//				.register(new SwordItem(CubeItemTier.X2TIER, 7, 4.0f, new Item.Properties().group(ItemGroup.COMBAT))
//						.setRegistryName("x2cube_sword"));
//		event.getRegistry()
//				.register(new PickaxeItem(CubeItemTier.X2TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x2cube_pickaxe"));
//		event.getRegistry()
//				.register(new ShovelItem(CubeItemTier.X2TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x2cube_shovel"));
//		event.getRegistry()
//				.register(new AxeItem(CubeItemTier.X2TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x2cube_axe"));
//		event.getRegistry()
//				.register(new HoeItem(CubeItemTier.X2TIER, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x2cube_hoe"));
//
//		event.getRegistry()
//				.register(new SwordItem(CubeItemTier.X3TIER, 7, 4.0f, new Item.Properties().group(ItemGroup.COMBAT))
//						.setRegistryName("x3cube_sword"));
//		event.getRegistry()
//				.register(new PickaxeItem(CubeItemTier.X3TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x3cube_pickaxe"));
//		event.getRegistry()
//				.register(new ShovelItem(CubeItemTier.X3TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x3cube_shovel"));
//		event.getRegistry()
//				.register(new AxeItem(CubeItemTier.X3TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x3cube_axe"));
//		event.getRegistry()
//				.register(new HoeItem(CubeItemTier.X3TIER, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x3cube_hoe"));
//
//		event.getRegistry()
//				.register(new SwordItem(CubeItemTier.X4TIER, 7, 4.0f, new Item.Properties().group(ItemGroup.COMBAT))
//						.setRegistryName("x4cube_sword"));
//		event.getRegistry()
//				.register(new PickaxeItem(CubeItemTier.X4TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x4cube_pickaxe"));
//		event.getRegistry()
//				.register(new ShovelItem(CubeItemTier.X4TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x4cube_shovel"));
//		event.getRegistry()
//				.register(new AxeItem(CubeItemTier.X4TIER, 4, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x4cube_axe"));
//		event.getRegistry()
//				.register(new HoeItem(CubeItemTier.X4TIER, 4.0f, new Item.Properties().group(ItemGroup.TOOLS))
//						.setRegistryName("x4cube_hoe"));

		// Armor
		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X2ARMOR, EquipmentSlotType.HEAD,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x2cube_helmet"));
		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X3ARMOR, EquipmentSlotType.HEAD,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x3cube_helmet"));
		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X4ARMOR, EquipmentSlotType.HEAD,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x4cube_helmet"));

		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X2ARMOR, EquipmentSlotType.CHEST,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x2cube_chestplate"));
		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X3ARMOR, EquipmentSlotType.CHEST,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x3cube_chestplate"));
		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X4ARMOR, EquipmentSlotType.CHEST,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x4cube_chestplate"));
		

		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X2ARMOR, EquipmentSlotType.LEGS,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x2cube_leggings"));
		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X3ARMOR, EquipmentSlotType.LEGS,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x3cube_leggings"));
		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X4ARMOR, EquipmentSlotType.LEGS,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x4cube_leggings"));

		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X2ARMOR, EquipmentSlotType.FEET,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x2cube_boots"));
		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X3ARMOR, EquipmentSlotType.FEET,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x3cube_boots"));
		event.getRegistry().register(new ArmorItem(CubeArmorMaterial.X4ARMOR, EquipmentSlotType.FEET,
				new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("x4cube_boots"));
		
	}

	public enum CubeArmorMaterial implements IArmorMaterial {

		// Forces the textures to assets/MOD_ID/models/armor/x2cube
		X2ARMOR(PuzzleCubes.MOD_ID + ":x2cube", 5, new int[] { 7, 9, 11, 7 }, 420, SoundInit.ITEM_ARMOR_EQUIP_CUBE,
				6.9F, () -> {
					return Ingredient.fromItems(BlockInit.x2block_mixed);
				}),
		X3ARMOR(PuzzleCubes.MOD_ID + ":x3cube", 5, new int[] { 7, 9, 11, 7 }, 420, SoundInit.ITEM_ARMOR_EQUIP_CUBE,
				6.9F, () -> {
					return Ingredient.fromItems(BlockInit.x3block_mixed);
				}),
		X4ARMOR(PuzzleCubes.MOD_ID + ":x4cube", 5, new int[] { 7, 9, 11, 7 }, 420, SoundInit.ITEM_ARMOR_EQUIP_CUBE,
				6.9F, () -> {
					return Ingredient.fromItems(BlockInit.x4block_mixed);
				});

		private static final int[] MAX_DAMAGE_ARRAY = new int[] { 16, 16, 16, 16 };
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;

		private CubeArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
				int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
				Supplier<Ingredient> repairMaterialIn) {
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			// TODO Auto-generated method stub
			return this.repairMaterial.getValue();
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}

	}
}
