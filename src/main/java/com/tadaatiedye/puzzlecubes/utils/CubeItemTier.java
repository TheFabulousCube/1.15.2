package com.tadaatiedye.puzzlecubes.utils;

import java.util.function.Supplier;

import com.tadaatiedye.puzzlecubes.init.BlockInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum CubeItemTier implements IItemTier
{

	/** Harvest Level (wood = 0, stone = 1, iron = 2, diamond = 3, gold = 0) */
	/** Max Uses (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
	/** Mining Speed (wood = 2.0f, stone = 4.0f, iron = 6.0f, diamond = 8.0f, gold = 12.0f) */
	/** Damage to Entities (wood = 0.0f, stone = 1.0f, iron = 2.0f, diamond = 3.0f, gold = 0.0f, sword adds 4.0) */
	/** Enchantability (wood = 15, stone = 5, iron = 14, diamond = 10, gold = 22) */
	
	X2TIER(1, 400, 4.0f, 1.5f, 12, () -> {
		return Ingredient.fromItems(BlockInit.x2block_mixed);
	}),

	X3TIER(2, 900, 9.0f, 2.5f, 16, () -> {
		return Ingredient.fromItems(BlockInit.x3block_mixed);
	}),

	X4TIER(3, 1600, 16.0f, 3.5f, 24, () -> {
		return Ingredient.fromItems(BlockInit.x4block_mixed);
	});
	

	
	private final int harvestLevel, maxUses, enchantability;
	private final float efficiency, attackDamage;
	private final LazyValue<Ingredient> repairMaterial;

	private CubeItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyValue<Ingredient>(repairMaterial);
	}

	@Override
	public int getMaxUses() {
		
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		//wood = 2.0f, diamond = 10.0f
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		// wood = 0.0f
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		// 0 = wood
		// 1 = stone
		// 2 = Iron
		// 3 = diamond
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		// wood = 15, gold = very high
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return this.repairMaterial.getValue();
	}
}
