package com.ah.modModCore.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.IChatComponent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(name = modModCore.modName, modid = modModCore.modID, version = modModCore.version)
public class modModCore
{
	
	public static final String modName = "Modular Modification: Core";
    public static final String modID = "modModCore";
    public static final String version = "0.1.3a";
    
    public static VersionChecker versionChecker;
    public static boolean outdatedWarning = false;
    
    @SidedProxy(clientSide="com.ah.modModCore.core.ClientProxy", serverSide="com.ah.modModCore.core.ServerProxy")
    public static CommonProxy proxy;
    
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
    
    @EventHandler
    public void init(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
    
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onPlayerLogIn(PlayerEvent.PlayerLoggedInEvent event) 
    {
    	if (!modModCore.outdatedWarning && event.player.worldObj.isRemote && !modModCore.versionChecker.isLatestVersion()) {
    		ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, "http://minecraft.cuseforge.com/projects/modular-modification");
    		ChatStyle clickableChatStyle = new ChatStyle().setChatClickEvent(versionCheckChatClickEvent);
    		ChatComponentText versionWarningChatComponent = new ChatComponentText("Your Version of ModMod is out of date. Click to update...");
    		versionWarningChatComponent.setChatStyle(clickableChatStyle);
    		event.player.addChatMessage(versionWarningChatComponent);
    		modModCore.outdatedWarning = true;
    	}
    }
    
}
