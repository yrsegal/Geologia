package net.nucleria.GeologyMod;


import net.minecraftforge.common.MinecraftForge;
import net.nucleria.GeologyMod.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = GeologyMod.NAME, modid = GeologyMod.MODID, version = GeologyMod.VERSION, dependencies = GeologyMod.DEPENDENCIES)
public class GeologyMod
{
	public static final String NAME = "Geologia";
    public static final String MODID = "geology";
    public static final String VERSION = "1.7.10-0.0.3.0";
    public static final String DEPENDENCIES = "required-after:Botania;after:Baubles;";
    
    @SidedProxy(clientSide = "net.nucleria.GeologyMod.client.ClientProxy",
    		serverSide = "net.nucleria.GeologyMod.common.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
    	MinecraftForge.EVENT_BUS.register(new GeologyEventHandler());
    	
		this.proxy.preInit(e);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
		this.proxy.init(e);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
		this.proxy.postInit(e);
    }   
}
