package com.ah.modModCore.items;

import com.ah.modModCore.core.modModCore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems 
{
	
	public static Item ingotCopper;
	public static Item ingotTin;
	public static Item ingotAluminium;
	public static Item ingotNickel;
	public static Item ingotTitanium;
	public static Item ingotPlatinum;
	
	public static Item dustNeodymium;
	public static Item dustSulphur;
	
	public static void init()
	{
		GameRegistry.registerItem(ingotCopper = new Item().setUnlocalizedName("ingotCopper").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(modModCore.modID + ":ingotCopper"), "ingotCopper");
		GameRegistry.registerItem(ingotTin = new Item().setUnlocalizedName("ingotTin").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(modModCore.modID + ":ingotTin"), "ingotTin");
		GameRegistry.registerItem(ingotAluminium = new Item().setUnlocalizedName("ingotAluminium").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(modModCore.modID + ":ingotAluminium"), "ingotAluminium");
		GameRegistry.registerItem(ingotNickel = new Item().setUnlocalizedName("ingotNickel").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(modModCore.modID + ":ingotNickel"), "ingotNickel");
		GameRegistry.registerItem(ingotTitanium = new Item().setUnlocalizedName("ingotTitanium").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(modModCore.modID + ":ingotTitanium"), "ingotTitanium");
		GameRegistry.registerItem(ingotPlatinum = new Item().setUnlocalizedName("ingotPlatinum").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(modModCore.modID + ":ingotPlatinum"), "ingotPlatinum");
		
		GameRegistry.registerItem(dustNeodymium = new Item().setUnlocalizedName("dustNeodymium").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(modModCore.modID + ":dustNeodymium"), "dustNeodymium");
		GameRegistry.registerItem(dustSulphur = new Item().setUnlocalizedName("dustSulphur").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(modModCore.modID + ":dustSulphur"), "dustSulphur");
	}

}
