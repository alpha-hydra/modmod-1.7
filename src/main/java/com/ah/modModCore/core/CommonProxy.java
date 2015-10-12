package com.ah.modModCore.core;

import com.ah.modModCore.blocks.ModBlocks;
import com.ah.modModCore.crafting.ModCrafting;
import com.ah.modModCore.items.ModItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.init();
		ModItems.init();
		ModCrafting.init();
	}
	
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
