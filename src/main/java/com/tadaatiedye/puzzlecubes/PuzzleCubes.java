package com.tadaatiedye.puzzlecubes;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tadaatiedye.puzzlecubes.init.ArmorInit;
import com.tadaatiedye.puzzlecubes.init.ToolInit;
import com.tadaatiedye.puzzlecubes.world.gen.CubeBlocksGen;

import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("puzzlecubes")
@Mod.EventBusSubscriber(modid = PuzzleCubes.MOD_ID, bus = Bus.MOD)
public class PuzzleCubes
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "puzzlecubes";
	public static PuzzleCubes instance;

    public PuzzleCubes() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
		modEventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
		modEventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
		modEventBus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
		modEventBus.addListener(this::doClientStuff);
		
//		SoundInit.SOUNDS.register(modEventBus);
		ToolInit.ITEMS.register(modEventBus);
		ArmorInit.ITEMS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
		instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("puzzlecubes", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
     //You can use SubscribeEvent and let the Event Bus discover methods to call
	
	 @SubscribeEvent public void onServerStarting(FMLServerStartingEvent event) {
	 }
	
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event)
    {
    	CubeBlocksGen.generateOre();
    }

	// You can use EventBusSubscriber to automatically subscribe events on the
	// contained class (this is subscribing to the MOD
	// Event bus for receiving Registry Events)

	/*
	 * @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD) public static
	 * class RegistryEvents {
	 * 
	 * @SubscribeEvent public static void onSoundEventRegistry(final
	 * RegistryEvent.Register<SoundEvent> event) { // register // a new
	 * SoundInit.registerSoundEvents(event); // block
	 * LOGGER.info("HELLO from Register SoundEvnet"); } }
	 */

}