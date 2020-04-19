package com.tadaatiedye.puzzlecubes.init;

import com.tadaatiedye.puzzlecubes.PuzzleCubes;

import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = PuzzleCubes.MOD_ID, bus = Bus.MOD)
@ObjectHolder(PuzzleCubes.MOD_ID)
public class SoundInit {

//	public static final SoundEvent ITEM_ARMOR_EQUIP = new SoundEvent(new ResourceLocation(PuzzleCubes.MOD_ID, "item.armor.equip"));
	public static final SoundEvent ITEM_ARMOR_EQUIP_CUBE = register("item.armor.equip.cube");
	public static final SoundEvent BLOCK_CUBE_BREAK = register("block.cube.break");
	public static final SoundEvent BLOCK_CUBE_STEP = register("block.cube.step");
	public static final SoundEvent BLOCK_CUBE_PLACE = register("block.cube.place");
	public static final SoundEvent BLOCK_CUBE_HIT = register("block.cube.hit");
	public static final SoundEvent BLOCK_CUBE_FALL = register("block.cube.fall");

//	public static final SoundType CUBE = new SoundType(1.0F, 1.0F, BLOCK_CUBE_BREAK,
//			BLOCK_CUBE_STEP, BLOCK_CUBE_PLACE, BLOCK_CUBE_HIT,
//			BLOCK_CUBE_FALL);
	


//	@SubscribeEvent
//	public static void registerSoundEvents(RegistryEvent.Register<SoundEvent> event) {
//        PuzzleCubes.LOGGER.info("SoundInit: " + event + " is " + event.getClass());
//		event.getRegistry()
//				.register(ITEM_ARMOR_EQUIP);
//
//	}

	/*** Vanilla class ***/
//	   public static final SoundEvent ENTITY_ZOMBIE_VILLAGER_STEP = register("entity.zombie_villager.step");
//
	private static SoundEvent register(String key) {

		SoundEvent temp = Registry.register(Registry.SOUND_EVENT, PuzzleCubes.MOD_ID + ":" + key,
				new SoundEvent(new ResourceLocation(PuzzleCubes.MOD_ID, key)));

		PuzzleCubes.LOGGER.info("SoundInit: " + temp + " is " + temp.getRegistryName());
		return temp;
	}

	/*** Deferred Registry stuff ***/
//	public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS,
//			PuzzleCubes.MOD_ID);
//
//	public static final RegistryObject<SoundEvent> EQUIP_CUBE = SOUNDS.register("item.armor.equip_cube",
//			() -> new SoundEvent(new ResourceLocation(PuzzleCubes.MOD_ID, "item.armor.equip_cube")));
}
