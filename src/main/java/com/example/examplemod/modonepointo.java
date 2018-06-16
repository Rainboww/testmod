package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = modonepointo.MODID, name = modonepointo.NAME, version = modonepointo.VERSION, dependencies = "required-after:Forge@[14.23.4.2705,)")
public class modonepointo
{
    public static final String MODID = "modonepointo";
    public static final String NAME = "Mod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "modonepointo.proxy.ClientProxy", serverSide = "modonepointo.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {


    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
