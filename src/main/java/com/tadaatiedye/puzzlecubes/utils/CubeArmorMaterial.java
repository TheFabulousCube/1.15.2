package com.tadaatiedye.puzzlecubes.utils;

import java.util.function.Supplier;

import com.tadaatiedye.puzzlecubes.PuzzleCubes;
import com.tadaatiedye.puzzlecubes.init.BlockInit;
import com.tadaatiedye.puzzlecubes.init.SoundInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum CubeArmorMaterial implements IArmorMaterial {

	// Forces the textures to assets/MOD_ID/models/armor/x2cube
	X2ARMOR(PuzzleCubes.MOD_ID + ":x2cube", 5, new int[] { 7, 9, 11, 7 }, 420, SoundInit.ITEM_ARMOR_EQUIP_CUBE,
			6.9F, () -> {
				return Ingredient.fromItems(BlockInit.x2Block_solved.get());
			}),
	X3ARMOR(PuzzleCubes.MOD_ID + ":x3cube", 5, new int[] { 7, 9, 11, 7 }, 420, SoundInit.ITEM_ARMOR_EQUIP_CUBE,
			6.9F, () -> {
				return Ingredient.fromItems(BlockInit.x3block_solved.get());
			}),
	X4ARMOR(PuzzleCubes.MOD_ID + ":x4cube", 5, new int[] { 7, 9, 11, 7 }, 420, SoundInit.ITEM_ARMOR_EQUIP_CUBE,
			6.9F, () -> {
				return Ingredient.fromItems(BlockInit.x4block_solved.get());
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
