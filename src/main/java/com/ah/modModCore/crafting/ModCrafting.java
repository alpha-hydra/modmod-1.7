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
		GameRegistry.addSmelting(ModBlocks.oreTitanium, new ItemStack(ModItems.ingotTitanium), 0.7F);
		GameRegistry.addSmelting(ModBlocks.orePlatinum, new ItemStack(ModItems.ingotPlatinum), 1.0F);
		GameRegistry.addSmelting(ModItems.terracottaUnfired, new ItemStack(ModItems.terracotta), 0.25F);
		
		GameRegistry.addSmelting(new ItemStack(ModItems.mouldUnfired, 0), new ItemStack(ModItems.mouldTerracotta, 0), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ModItems.mouldUnfired, 1), new ItemStack(ModItems.mouldTerracotta, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ModItems.mouldUnfired, 2), new ItemStack(ModItems.mouldTerracotta, 2), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ModItems.mouldUnfired, 3), new ItemStack(ModItems.mouldTerracotta, 3), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ModItems.mouldUnfired, 4), new ItemStack(ModItems.mouldTerracotta, 4), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ModItems.mouldUnfired, 5), new ItemStack(ModItems.mouldTerracotta, 5), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ModItems.mouldUnfired, 6), new ItemStack(ModItems.mouldTerracotta, 6), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ModItems.mouldUnfired, 7), new ItemStack(ModItems.mouldTerracotta, 7), 0.35F);
		
		GameRegistry.addShapelessRecipie(new ItemStack(ModItems.terracottaUnfired, 3), new Object[] {New ItemStack(Items.dye, 2, 15), Items.clay});
	}
	
}
