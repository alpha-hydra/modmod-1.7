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

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkProvider)
	{
		
		switch(world.provider.dimensionID)
		{
			
			case 0:
				
				this.runGenerator(this.genCopperOre, world, random, chunkX, chunkZ, 18, 20, 70);
				this.runGenerator(this.genTinOre, world, random, chunkX, chunkZ, 20, 15, 65);
				this.runGenerator(this.genTitaniumOre, world, random, chunkX, chunkZ, 10, 0, 35);
				this.runGenerator(this.genPlatinumOre, world, random, chunkX, chunkZ, 7, 0, 20);
				this.runGenerator(this.genNickelOre, world, random, chunkX, chunkZ, 17, 5, 50);
				this.runGenerator(this.genAluminiumOre, world, random, chunkX, chunkZ, 22, 0, 70);
				
				this.runGenerator(this.genNeodymiumOre, world, random, chunkX, chunkZ, 13, 7, 33);
				this.runGenerator(this.genSulphurOre, world, random, chunkX, chunkZ, 16, 40, 60);
				
				break
				
			case -1:
				
				break
				
			case 1:
				
				break
			
		}
		
	}
	
	private WorldGenerator genCopperOre;
	private WorldGenerator genTinOre;
	private WorldGenerator genTitaniumOre;
	private WorldGenerator genPlatinumOre;
	private WorldGenerator genNickelOre;
	private WorldGenerator genAluminiumOre;
	
	private WorldGenerator genNeodymiumOre;
	private WorldGenerator genSulphurOre;
	
	public ModWorldGen()
	{
		
		this.genCopperOre = new WorldGenMinable(ModBlocks.oreCopper, 12);
		this.genTinOre = new WorldGenMinable(ModBlocks.oreTin, 12);
		this.genTitaniumOre = new WorldGenMinable(ModBlocks.oreTitanium, 4);
		this.genPlatinumOre = new WorldGenMinable(ModBlocks.orePlatinum, 3);
		this.genNickelOre = new WorldGenMinable(ModBlocks.oreNickel, 9);
		this.genAluminiumOre = new WorldGenMinable(ModBlocks.oreAluminium, 15);
		
		this.genNeodymiumOre = new WorldGenMinable(ModBlocks.oreNeodymium, 5);
		this.genSulphurOre = new WorldGenMinable(ModBlocks.oreSulphur, 7);
		
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight)
	{
    		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

    		int heightDiff = maxHeight - minHeight + 1;
    		for (int i = 0; i < chancesToSpawn; i ++) {
        		int x = chunk_X * 16 + rand.nextInt(16);
        		int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
        		generator.generate(world, rand, x, y, z);
    		}
	}

}
