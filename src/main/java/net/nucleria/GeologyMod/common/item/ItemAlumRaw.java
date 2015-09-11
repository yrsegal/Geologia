package net.nucleria.GeologyMod.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.nucleria.GeologyMod.GeologyMod;

public class ItemAlumRaw extends Item {

	public ItemAlumRaw(){
		super();
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("raw_alum");
		this.setTextureName(GeologyMod.MODID + ":" + "raw_alum");
	}
	
}
