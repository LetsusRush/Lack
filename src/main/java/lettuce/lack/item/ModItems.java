package lettuce.lack.item;

import lettuce.lack.Lack;
import lettuce.lack.item.BaseItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * Created by LetsUsRush on 10/2/2017.
 */

@Mod.EventBusSubscriber
public class ModItems {
    // Basic Items
    public static Item ItemLack = new BaseItem("lack");
    public static Item ItemGlint = new BaseItem("glint");

    public static Item ItemSalt = new BaseItem("seasalt");

    public static Item ItemBathSaltNormal = new BathSaltItem("bathsalt");
    public static Item ItemBathSaltHaste = new BathSaltItem("bathsalthaste");
    public static Item ItemBathSaltSpeed = new BathSaltItem("bathsaltspeed");
    public static Item ItemBathSaltStrength = new BathSaltItem("bathsaltstrength");
    public static Item ItemBathSaltResistance = new BathSaltItem("bathsaltresistance");

    public static Item ItemZip = new ZipItem("zip");
    public static Item ItemBang = new BangItem("bang");

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        e.getRegistry().registerAll(ItemLack, ItemSalt, ItemGlint, ItemZip, ItemBang);
    }

    public static void registerItemRenders() {
        reg(ItemLack);
        reg(ItemGlint);
        reg(ItemZip);
        reg(ItemBang);
    }


    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Lack.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory")); }

}