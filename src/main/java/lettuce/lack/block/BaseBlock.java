package lettuce.lack.block;

import lettuce.lack.Lack;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by LetsUsRush on 10/3/2017.
 */
public class BaseBlock extends Block {
    BaseBlock(String name, Material material, float hardness, float resistance){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(Lack.MODID + ":" + name);
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(CreativeTabs.MATERIALS);

    }
}
