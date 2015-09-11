package net.nucleria.GeologyMod.common;

import net.nucleria.GeologyMod.common.block.GeologyModBlocks;
import net.nucleria.GeologyMod.common.crafting.GeologyModCrafting;
import net.nucleria.GeologyMod.common.item.GeologyModItems;
import net.nucleria.GeologyMod.common.tile.GeologyModTiles;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e)
    {
		GeologyModItems.createItems();
		GeologyModBlocks.createBlocks();
		GeologyModTiles.createTiles();
    }

    public void init(FMLInitializationEvent e)
    {
		GeologyModCrafting.initCrafting();
    }
    
    public void postInit(FMLPostInitializationEvent e)
    {
		
    }
}
