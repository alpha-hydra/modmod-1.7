package com.ah.modModCore.world;

import java.util.Random;

import com.ah.modModCore.blocks.ModBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModWorldGen implements IWorldGenerator
{

	private WorldGenerator genCopperOre;
	private WorldGenerator genTinOre;
	
	public ModWorldGen()
	{
		this.genCopperOre = new WorldGenMinable(ModBlocks.oreCopper, 7);
		this.genTinOre = new WorldGenMinable(ModBlocks.oreTin, 9);
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ, int chanceToSpawn, int minHeight, int maxHeight)
	{
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments on Block");
			
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chanceToSpawn; i++)
		{
			int x = rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = rand.nextInt(16);
			generator.generate(world, rand, x, y, z);
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
			case 0:
				this.runGenerator(genCopperOre, world, random, chunkX, chunkZ, 18, 10, 60);
				this.runGenerator(genTinOre, world, random, chunkX, chunkZ, 22, 0, 60);
			break;
		
			case 1:
			break;
		
			case 2:
			break;
		}
	}
	
}
