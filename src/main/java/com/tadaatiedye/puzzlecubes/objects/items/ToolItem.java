package com.tadaatiedye.puzzlecubes.objects.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class ToolItem extends PickaxeItem {

	public ToolItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
		
	}

}
