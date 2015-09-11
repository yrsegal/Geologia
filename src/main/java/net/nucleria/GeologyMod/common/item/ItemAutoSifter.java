package net.nucleria.GeologyMod.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.nucleria.GeologyMod.GeologyMod;

public class ItemAutoSifter extends Item {

	public ItemAutoSifter(){
		super();
		
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("auto_sifter");
		this.setTextureName(GeologyMod.MODID + ":" + "auto_sifter");
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, int x, int y, int z, int side, float px, float py, float pz){
		
		if (worldIn.getBlock(x, y, z) == Blocks.dirt){
			ItemStack copperStack = new ItemStack(GeologyModItems.ItemCopperRaw);
			
			worldIn.setBlockToAir(x, y, z);
			playerIn.inventory.addItemStackToInventory(copperStack);
			
			return true;
		}
		
		if (worldIn.getBlock(x, y, z) == Blocks.grass){
			ItemStack alumStack = new ItemStack(GeologyModItems.ItemAlumRaw);
			
			worldIn.setBlockToAir(x, y, z);
			playerIn.inventory.addItemStackToInventory(alumStack);
			
			return true;
		}
		
		if (worldIn.getBlock(x, y, z) == Blocks.gravel){
			ItemStack ironStack = new ItemStack(GeologyModItems.ItemIronRaw);
			
			worldIn.setBlockToAir(x, y, z);
			playerIn.inventory.addItemStackToInventory(ironStack);
			
			return true;
		}
		
		if (worldIn.getBlock(x, y, z) == Blocks.sand){
			ItemStack gypsumStack = new ItemStack(GeologyModItems.ItemGypsumRaw);
			
			worldIn.setBlockToAir(x, y, z);
			playerIn.inventory.addItemStackToInventory(gypsumStack);
			
			return true;
		}
		
		return false;
	}
	
}
