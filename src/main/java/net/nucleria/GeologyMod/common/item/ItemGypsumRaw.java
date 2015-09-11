package net.nucleria.GeologyMod.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.nucleria.GeologyMod.GeologyMod;

public class ItemGypsumRaw extends Item {
	
	public ItemGypsumRaw(){
		super();
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("raw_gypsum");
		this.setTextureName(GeologyMod.MODID + ":" + "raw_gypsum");
	}

}
