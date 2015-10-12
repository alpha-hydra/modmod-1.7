package com.ah.modModCore.core;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy 
{

	@Override
	public void preInit(FMLPreInitializationEvent event) 
	{
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) 
	{
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) 
	{
		modModCore.versionChecker = new VersionChecker();
		Thread versionCheckerThread = new Thread(modModCore.versionChecker, "Version Check");
		versionCheckerThread.start();
		super.postInit(event);
	}

}
