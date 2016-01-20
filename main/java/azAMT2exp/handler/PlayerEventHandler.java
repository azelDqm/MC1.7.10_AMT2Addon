package azAMT2exp.handler;

import mods.defeatedcrow.common.DCsAppleMilk;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDragonEgg;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import azAMT2exp.entity.EntityACrowDoll;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PlayerEventHandler {

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent event)
    {

    	if(event.entityPlayer.isSneaking() && event.face == 1)
    	{
    		Block targetBlock = event.world.getBlock(event.x, event.y, event.z);

    		//System.out.println("1");
    		if(targetBlock != null && targetBlock instanceof BlockDragonEgg)
    		{
    			//System.out.println("2;" + event.entityPlayer.inventory.getCurrentItem().getItem().getUnlocalizedName() + "//" + (Item.getItemFromBlock(DCsAppleMilk.crowDoll)).getUnlocalizedName());
    			if(event.entityPlayer.inventory.getCurrentItem().getItem().getUnlocalizedName().equalsIgnoreCase((Item.getItemFromBlock(DCsAppleMilk.crowDoll)).getUnlocalizedName()))
    			{
    				//System.out.println("3");
    				if(!event.entityPlayer.worldObj.isRemote)
    				{
    					event.world.createExplosion(null, event.x, event.y + 1, event.z, 3.0F, false);
    			        if (!event.entityPlayer.capabilities.isCreativeMode)
    			        {
    			        	event.entityPlayer.inventory.getCurrentItem().stackSize = event.entityPlayer.inventory.getCurrentItem().stackSize - 1;
    			        }
    					//event.entityPlayer.inventory.getCurrentItem().stackSize
    					EntityACrowDoll entityPet = new EntityACrowDoll(event.world);
    					entityPet.setLocationAndAngles((double)event.x + 0.5D, (double)event.y + 1.0D, (double)event.z + 0.5D, 0.0F, 0.0F);
    					event.world.spawnEntityInWorld(entityPet);
        				event.setCanceled(true);
    				}
    			}
    		}
    		//System.out.println(targetBlock.getUnlocalizedName() + "/" + event.face);
    	}
    }
}
