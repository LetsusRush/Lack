package lettuce.lack.network;

import lettuce.lack.Lack;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by tyler ellis on 10/7/2017.
 */

public class PacketHandler {
    public static SimpleNetworkWrapper HANDLER = NetworkRegistry.INSTANCE.newSimpleChannel(Lack.MODID);

    private static int id = 0;

    public static void registerMessages(){
        HANDLER.registerMessage(MessageMoonlightBurstFX.MessageHolder.class,MessageMoonlightBurstFX.class,id ++, Side.CLIENT);

    }
}
