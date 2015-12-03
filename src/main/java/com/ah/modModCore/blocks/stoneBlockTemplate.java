package com.ah.modModCore.blocks;

import com.ah.modModCore.core.modModCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class stoneBlockTemplate extends Block 
{

	protected stoneBlockTemplate(String unlocalizedName, Material material, float hardness, float resistance, float lightLevel, int harvestLevel)
	{
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(modModCore.modID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setCreativeTab(CreativeTabs.tabModModMat);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightLevel);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setStepSound(soundTypeStone);
		
	}

}
