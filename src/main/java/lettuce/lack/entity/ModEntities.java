package lettuce.lack.entity;

import lettuce.lack.Lack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * Created by tyler ellis on 10/7/2017.
 */
public class ModEntities {

    public static void init() {
        String prefix = Lack.MODID + ":";
        int id = 0;
        EntityRegistry.registerModEntity(new ResourceLocation(Lack.MODID, "bang"), EntityBang.class, "bangentity", id++, Lack.instance, 16, 3, true);

    }
}
