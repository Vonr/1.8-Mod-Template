package com.example.examplemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = ExampleMod.MODID,
        name = ExampleMod.MOD_NAME,
        version = ExampleMod.VERSION ,
        acceptableRemoteVersions = "*"
)
public class ExampleMod
{
    public static final String MOD_ID = "examplemod";
    public static final String MOD_NAME = "ExampleMod";
    public static final String VERSION = "1.0.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus().register(this);
        
        // Other init code here
    }
    
    // Event Hooks
}
