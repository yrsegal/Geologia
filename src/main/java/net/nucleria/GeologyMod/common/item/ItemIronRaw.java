package net.nucleria.GeologyMod.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.nucleria.GeologyMod.GeologyMod;

public class ItemIronRaw extends Item {
	
	public ItemIronRaw(){
		super();
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("raw_iron");
		this.setTextureName(GeologyMod.MODID + ":" + "raw_iron");
	}

}
