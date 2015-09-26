package net.nucleria.GeologyMod.common.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.nucleria.GeologyMod.GeologyMod;

public class ItemRockRaw extends Item {

	public ItemRockRaw(){
		super();
		
		this.setHasSubtypes(true);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("raw_rock");
	}
	
	public IIcon[] icons = new IIcon[6];
	
	@Override
	public void registerIcons(IIconRegister reg){
		for (int i = 0; i < 6; i++) {
			this.icons[i] = reg.registerIcon(GeologyMod.MODID + ":raw_rock_" + i);
		}
	}
	
	@Override
	public IIcon getIconFromDamage(int meta){
		if (meta > 4)
			meta = 0;
		
		return this.icons[meta];
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list){
		for (int i = 0; i < 4; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
	
}
