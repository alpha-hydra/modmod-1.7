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
		GameRegistry.registerItem(ingotCopper = new Item().setUnlocalizedName("ingotCopper").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(CreativeTabs.tabModModMat).setTextureName(modModCore.modID + ":ingotCopper"), "ingotCopper");
		GameRegistry.registerItem(ingotTin = new Item().setUnlocalizedName("ingotTin").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(CreativeTabs.tabModModMat).setTextureName(modModCore.modID + ":ingotTin"), "ingotTin");
		GameRegistry.registerItem(ingotAluminium = new Item().setUnlocalizedName("ingotAluminium").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(CreativeTabs.tabModModMat).setTextureName(modModCore.modID + ":ingotAluminium"), "ingotAluminium");
		GameRegistry.registerItem(ingotNickel = new Item().setUnlocalizedName("ingotNickel").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(CreativeTabs.tabModModMat).setTextureName(modModCore.modID + ":ingotNickel"), "ingotNickel");
		GameRegistry.registerItem(ingotTitanium = new Item().setUnlocalizedName("ingotTitanium").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(CreativeTabs.tabModModMat).setTextureName(modModCore.modID + ":ingotTitanium"), "ingotTitanium");
		GameRegistry.registerItem(ingotPlatinum = new Item().setUnlocalizedName("ingotPlatinum").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(CreativeTabs.tabModModMat).setTextureName(modModCore.modID + ":ingotPlatinum"), "ingotPlatinum");
		GameRegistry.registerItem(terracottaUnfired = new Item().setUnlocalizedName("terracottaUnfired").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(CreativeTabs.tabModModMat).setTextureName(modModCore.modID + ":terracottaUnfired"), "terracottaUnfired");
		GameRegistry.registerItem(terracotta = new Item().setUnlocalizedName("terracotta").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(CreativeTabs.tabModModMat).setTextureName(modModCore.modID +":terracotta"), "terracotta");
		
		GameRegistry.registerItem(dustNeodymium = new Item().setUnlocalizedName("dustNeodymium").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(CreativeTabs.tabModModMat).setTextureName(modModCore.modID + ":dustNeodymium"), "dustNeodymium");
		GameRegistry.registerItem(dustSulphur = new Item().setUnlocalizedName("dustSulphur").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(CreativeTabs.tabModModMat).setTextureName(modModCore.modID + ":dustSulphur"), "dustSulphur");
		
		GameRegistry.registerItem(gear = new MetadataItem("gear", 10), "gear");
		GameRegistry.registerItem(plate = new MetadataItem("plate", 10), "plate");
		GameRegistry.registerItem(rod = new MetadataItem("rod", 10), "rod");
		GameRegistry.registerItem(pipe = new MetadataItem("pipe", 10), "pipe");
		GameRegistry.registerItem(wire = new MetadataItem("wire", 10), "wire");
		GameRegistry.registerItem(screw = new MetadataItem("screw", 10), "screw");
		GameRegistry.registerItem(ball = new MetadataItem("ball", 10), "ball");
		GameRegistry.registerItem(ring = new MetadataItem("ring", 10), "ring");
		GameRegistry.registerItem(mouldUnfired = new MetadataItem("mouldUnfired", 8), "mouldUnfired");
		GameRegistry.registerItem(mouldTerracotta = new MetadataItem("mouldTerracotta", 8), "mouldTerracotta");
	}
	
	public static final CreativeTabs tabModModMat = new CreativeTabs("ModModMat")
	{
		
		@Override
		public Item getTabIconItem()
		{
			
			return this.ingotSteel;
			
		}
		
	}
	
	public static final CreativeTabs tabModModComp = new CreativeTabs("ModModComp")
	{
		
		@Override
		public Item getTabIconItem()
		{
			
			return this.screw;
		}
		
		@Override
		public int getItemIconDamage()
		{
			
			return 9;
			
		}
	}

}
