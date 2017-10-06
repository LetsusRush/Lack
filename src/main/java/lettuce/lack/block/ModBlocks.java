package lettuce.lack.block;

import lettuce.lack.Lack;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by tyler ellis on 10/5/2017.
 */

@Mod.EventBusSubscriber
public class ModBlocks {

    public static Block BlockWhimsy = new BaseBlock("whimsy", Material.ROCK, 1.0F, 1.0F);

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(BlockWhimsy);
    }
    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> e) {
        e.getRegistry().register(new ItemBlock(BlockWhimsy).setRegistryName(BlockWhimsy.getRegistryName()));
    }

    public static void registerBlockRenders() {
        reg(BlockWhimsy);
    }

    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Lack.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory")); }

}
