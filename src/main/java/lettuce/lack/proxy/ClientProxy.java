package lettuce.lack.proxy;

import lettuce.lack.block.ModBlocks;
import lettuce.lack.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by LetsUsRush on 10/2/2017.
 */
public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLPreInitializationEvent e){
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        ModItems.registerItemRenders();
        ModBlocks.registerBlockRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e){
        super.postInit(e);
    }
}
