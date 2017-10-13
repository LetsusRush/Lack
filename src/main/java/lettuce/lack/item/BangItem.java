package lettuce.lack.item;

import lettuce.lack.Lack;
import lettuce.lack.entity.EntityBang;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

/**
 * Created by tyler ellis on 10/6/2017.
 */
public class BangItem extends Item {

    public static final int TRAVEL_TIME = 100;

    public BangItem (String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(Lack.MODID + ":" + name);
        setCreativeTab(CreativeTabs.MATERIALS);
        setMaxStackSize(1);

    }

    public ActionResult<ItemStack> onItemRightClick (World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        BlockPos pos = playerIn.getPosition();
        EntityBang entitybang = new EntityBang(worldIn, playerIn);
        entitybang.setPosition(pos.getX(), pos.getY(), pos.getZ());
        worldIn.spawnEntity(entitybang);

        System.out.println(playerIn.getLookVec());

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

}
