package com.ah.modModCore.crafting;

import com.ah.modModCore.blocks.ModBlocks;
import com.ah.modModCore.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public final class ModCrafting 
{

	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.5F);
		GameRegistry.addSmelting(ModBlocks.oreNickel, new ItemStack(ModItems.ingotNickel), 0.5F);
		GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), 0.5F);
		GameRegistry.addSmelting(ModBlocks.oreTitanium, new ItemStack(ModItems.ingotTitanium), 0.5F);
		GameRegistry.addSmelting(ModBlocks.orePlatinum, new ItemStack(ModItems.ingotPlatinum), 0.5F);
	}
	
}
