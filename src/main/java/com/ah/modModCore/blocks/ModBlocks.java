package com.ah.modModCore.blocks;

import com.ah.modModCore.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks 
{

	public static Block oreTin;
	public static Block oreCopper;
	public static Block oreAluminium;
	public static Block oreNickel;
	public static Block orePlatinum;
	public static Block oreTitanium;
	
	public static Block oreNeodymium;
	public static Block oreSulphur;
	
	public static void init()
	{
		GameRegistry.registerBlock(oreTin = new stoneBlockTemplate("oreTin", Material.rock, 2.0F, 6.0F, 0.0F, 3), "oreTin");
		GameRegistry.registerBlock(oreCopper = new stoneBlockTemplate("oreCopper", Material.rock, 2.0F, 6.0F, 0.0F, 3), "oreCopper");
		GameRegistry.registerBlock(oreAluminium = new stoneBlockTemplate("oreAluminium", Material.rock, 2.0F, 6.0F, 0.0F, 3), "oreAluminium");
		GameRegistry.registerBlock(oreNickel = new stoneBlockTemplate("oreNickel", Material.rock, 2.0F, 6.0F, 0.0F, 3), "oreNickel");
		GameRegistry.registerBlock(orePlatinum = new stoneBlockTemplate("orePlatinum", Material.rock, 2.0F, 6.0F, 0.0F, 3), "orePlatinum");
		GameRegistry.registerBlock(oreTitanium = new stoneBlockTemplate("oreTitanium", Material.rock, 2.0F, 6.0F, 0.0F, 3), "oreTitanium");
		
		GameRegistry.registerBlock(oreNeodymium = new dustOreTemplate("oreNeodymium", Material.rock, 2.0F, 6.0F, 0.0F, 3, ModItems.dustNeodymium, 2, 4), "oreNeodymium");
		GameRegistry.registerBlock(oreSulphur = new dustOreTemplate("oreSulphur", Material.rock, 2.0F, 6.0F, 0.0F, 3, ModItems.dustSulphur, 1, 3), "oreSulphur");
	}
	
}
