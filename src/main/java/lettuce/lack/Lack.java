package lettuce.lack;

import lettuce.lack.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by LetsUsRush on 9/29/2017.
 */

@Mod(modid = Lack.MODID, name = Lack.NAME, version = Lack.VERSION)
public class Lack {

    public static final String MODID = "lack";
    public static final String NAME = "Lack";
    public static final String VERSION = "0.01";

    @SidedProxy(clientSide = "lettuce.lack.proxy.ClientProxy", serverSide = "lettuce.lack.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Lack instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) { proxy.postInit(e); }

}
