package net.nucleria.GeologyMod.common.item;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public final class GeologyModItems {
	
	public static Item ItemAutoSifter;
	
	public static Item ItemRockRaw;
	
	public static Item ItemRockPure;
	
	public static void createItems(){
		
		ItemAutoSifter = new ItemAutoSifter();
		
		ItemRockRaw = new ItemRockRaw();
		
		ItemRockPure = new ItemRockPure();

		GameRegistry.registerItem(ItemAutoSifter, "auto_sifter");

		GameRegistry.registerItem(ItemRockRaw, "raw_rock");
		
		GameRegistry.registerItem(ItemRockPure, "pure_rock");

	}
	
}
