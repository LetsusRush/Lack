package lettuce.lack.entity;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by tyler ellis on 10/6/2017.
 */
public class EntityBang extends EntityItem {

    private int TRAVEL_TIME;
    private static float pitch;
    private static float yaw;
    private double TRAVEL_POWER;
    private EntityPlayer player;

    public EntityBang (World worldIn, EntityPlayer playerIn) {
        super(worldIn);
        this.TRAVEL_TIME = 100;
        this.TRAVEL_POWER = .5D;
        this.player = playerIn;
    }

    public void onUpdate() {
        --this.TRAVEL_TIME;
        if (TRAVEL_TIME % 20 == 0) {
            if (!this.world.isRemote) {
                this.world.createExplosion(this, this.posX, this.posY, this.posZ, 1.0F, true);
            }
        }
        this.motionX = 0F;
        this.motionY = TRAVEL_POWER;
        this.motionZ = 0F;

        if (TRAVEL_TIME == 0) { this.setDead(); }
    }

}
