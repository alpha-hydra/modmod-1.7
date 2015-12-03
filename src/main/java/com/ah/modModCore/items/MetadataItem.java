package com.ah.modModCore.item;

/* TODO
 * Add Imports
 */
 
public class MetadataItem extends Item
{

	public MetadataItem(String unlocalizedName)
	{
  
    	super();
    	this.setHasSubtypes(true);
    	this.setUnlocalizedName(unlocalizedName);
    	this.setCreativeTab(creativeTabs.tabMaterials);
  
  	}
  	
  	public IIcon[] = new IIcon[6];
  	
  	@Override
  	public void registerIcons(IIconRegister reg)
  	{
  	
  		for(int i = 0, i < 10, i++)
  		{
  		
  			this.icons[i] = reg.registerIcon(Main.ID + ":multitexture_" + i);
  		
  		}
  	
  	}
  	
  	@Override
	public IIcon getIconFromDamage(int meta) 
	{
    	if (meta > 5)
    	    meta = 0;

    	return this.icons[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) 
	{
    	for (int i = 0; i < 6; i ++) 
    	{
        	list.add(new ItemStack(item, 1, i));
    	}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) 
	{
    	return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}


}
