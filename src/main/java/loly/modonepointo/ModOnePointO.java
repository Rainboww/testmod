package loly.modonepointo;

import loly.modonepointo.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModOnePointO.MODID, name = ModOnePointO.NAME, version = ModOnePointO.VERSION) //, dependencies = "required-after:Forge@[14.23.4.2705,)"
public class ModOnePointO
{
    public static final String MODID = "modonepointo";
    public static final String NAME = "modonepointo";
    public static final String VERSION = "0.1";

    public static CreativeTabs tabOnePointO = new ModTab(CreativeTabs.getNextID(), "1.0 Blocks");

    @SidedProxy(clientSide = "loly.modonepointo.proxy.ClientProxy", serverSide = "loly.modonepointo.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ModOnePointO instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        logger.fatal("hi im main class can u hear me");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
