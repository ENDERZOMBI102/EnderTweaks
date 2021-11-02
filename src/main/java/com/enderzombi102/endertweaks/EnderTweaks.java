package com.enderzombi102.endertweaks;

import net.minecraft.init.Blocks;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EnderTweaks.MODID, name = EnderTweaks.NAME, version = EnderTweaks.VERSION)
public class EnderTweaks {
	public static final String MODID = "endertweaks";
	public static final String NAME = "EnderTweaks";
	public static final String VERSION = "1.0.0";

	private static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// some example code
		logger.info("DIRT BLOCK >> {}", Blocks.field_150346_d.getUnlocalizedName());
	}
}
