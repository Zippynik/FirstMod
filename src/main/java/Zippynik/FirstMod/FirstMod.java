package Zippynik.FirstMod;


import Zippynik.FirstMod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = "FirstMod", name="FirstMod",version="1.7.10-0.1")
public class FirstMod {
	
	@SidedProxy(clientSide="Zippynik.FirstMod.proxy.ClientProxy",serverSide="Zippynik.FirstMod.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.Instance("FirstMod")
	public static FirstMod instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		
		
	}
	
	@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event){
	
	
}
	
}
