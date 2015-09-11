package net.nucleria.GeologyMod.common.item;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public final class GeologyModItems {
	
	public static Item ItemAutoSifter;
	
	public static Item ItemCopperRaw;
	public static Item ItemIronRaw;
	public static Item ItemGypsumRaw;
	public static Item ItemAlumRaw;
	
	public static void createItems(){
		
		ItemAutoSifter = new ItemAutoSifter();
		
		ItemCopperRaw = new ItemCopperRaw();
		ItemIronRaw = new ItemIronRaw();
		ItemGypsumRaw = new ItemGypsumRaw();
		ItemAlumRaw = new ItemAlumRaw();
		
		GameRegistry.registerItem(ItemAutoSifter, "auto_sifter");
		
		GameRegistry.registerItem(ItemCopperRaw, "raw_copper");
		GameRegistry.registerItem(ItemIronRaw, "raw_iron");
		GameRegistry.registerItem(ItemGypsumRaw, "raw_gypsum");
		GameRegistry.registerItem(ItemAlumRaw, "raw_alum");
	}
	
}
