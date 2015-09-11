package net.nucleria.GeologyMod.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.nucleria.GeologyMod.GeologyMod;

public class ItemCopperRaw extends Item {
	
	public ItemCopperRaw(){
		super();
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("raw_copper");
		this.setTextureName(GeologyMod.MODID + ":" + "raw_copper");
	}

}
