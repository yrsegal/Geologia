package net.nucleria.GeologyMod.common.crafting;

import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.recipe.RecipeRuneAltar;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.nucleria.GeologyMod.common.item.GeologyModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class GeologyModCrafting {
	
	public static RecipeRuneAltar RecipeAutoSifter;
	
	public static void initCrafting() {
		RecipeAutoSifter = BotaniaAPI.registerRuneAltarRecipe(new ItemStack(GeologyModItems.ItemAutoSifter, 1), 4000, new ItemStack(Blocks.dirt, 1), new ItemStack(Items.iron_ingot, 1), new ItemStack(Items.redstone, 1));
	}

}
