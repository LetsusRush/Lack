package lettuce.lack.item;

import lettuce.lack.Lack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by tyler ellis on 10/6/2017.
 */

public class ZipItem extends Item {

    public ZipItem(String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(Lack.MODID + ":" + name);
        setCreativeTab(CreativeTabs.MATERIALS);
        setMaxStackSize(1);

    }

    public ActionResult<ItemStack> onItemRightClick (World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.motionY = 1.0000D;
        playerIn.fallDistance = 0F;
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
