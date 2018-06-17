package loly.modonepointo.proxy;

import loly.modonepointo.ModBlocks;
import loly.modonepointo.ModOnePointO;
import loly.modonepointo.blocks.FirstBlock;
import loly.modonepointo.blocks.HeavySand;
import loly.modonepointo.config.Config;
import loly.modonepointo.items.FirstItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy {

    public static Configuration config; //config instance


    public void preInit(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "modonepointo.cfg"));
        Config.readConfig();
        ModOnePointO.logger.fatal("hi im config maker can u hear me");
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) config.save();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new FirstBlock());
        for (int i = 0; i < 4; i++) {
            event.getRegistry().register(new HeavySand(i+3));
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new FirstItem());

        event.getRegistry().register(new ItemBlock(ModBlocks.firstBlock).setRegistryName(ModBlocks.firstBlock.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.heavySand).setRegistryName(ModBlocks.heavySand.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.denseSand).setRegistryName(ModBlocks.denseSand.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.compressedSand).setRegistryName(ModBlocks.compressedSand.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.gravitySand).setRegistryName(ModBlocks.gravitySand.getRegistryName()));
    }
}