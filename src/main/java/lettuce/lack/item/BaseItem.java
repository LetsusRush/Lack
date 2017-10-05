package lettuce.lack.item;

import lettuce.lack.Lack;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by LetsUsRush on 10/2/2017.
 */

public class BaseItem extends Item {

    public BaseItem(String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(Lack.MODID + ":" + name);
        setCreativeTab(CreativeTabs.MATERIALS);


    }
}
