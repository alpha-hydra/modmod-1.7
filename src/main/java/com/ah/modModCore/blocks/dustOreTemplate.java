package com.ah.modModCore.blocks;

import java.util.Random;

import com.ah.modModCore.core.modModCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class dustOreTemplate extends Block 
{
	private Item drop;
	private int meta;
	private int maxDrop;
	private int minDrop;

	protected dustOreTemplate(String unlocalizedName, Material material, float hardness, float resistance, float lightLevel, int harvestLevel, Item drop, int meta, int maxDrop, int minDrop)
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
		this.drop = drop;
		this.meta = meta;
		this.maxDrop = maxDrop;
		this.minDrop = minDrop;
		
	}
	
	protected dustOreTemplate(String unlocalizedName, Material material, float hardness, float resistance, float lightLevel, int harvestLevel, Item drop, int maxDrop, int minDrop)
	{
		this(unlocalizedName, material, hardness, resistance, lightLevel, harvestLevel, drop, 0, maxDrop, minDrop);
	}
	
	protected dustOreTemplate(String unlocalizedName, Material material, float hardness, float resistance, float lightLevel, int harvestLevel, Item drop)
	{
		this(unlocalizedName, material, hardness, resistance, lightLevel, harvestLevel, drop, 0, 1, 1);
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune)
	{
		return this.drop;
	}
	
	@Override
	public int damageDropped(int metadata)
	{
		return this.meta;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random)
	{
		if (this.minDrop >= this.maxDrop)
		{
			return this.minDrop;
		}
		return this.minDrop + random.nextInt(this.maxDrop - this.minDrop + fortune + 1);
	}

}
