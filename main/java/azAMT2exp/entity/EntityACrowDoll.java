package azAMT2exp.entity;

import mods.defeatedcrow.common.DCsAppleMilk;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityACrowDoll extends EntityChicken
{
	private int jumpTicks2;

	public EntityACrowDoll(World p_i1604_1_)
	{
		super(p_i1604_1_);
        this.setSize(0.3F, 0.7F);
        this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.4D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.0D, DCsAppleMilk.itemMintSeed, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
	}

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    }

	@Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.jumpTicks2 > 0)
        {
            --this.jumpTicks2;
        }

        this.field_70888_h = this.field_70886_e;
        this.field_70884_g = this.destPos;
        this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3D);

        if (this.destPos < 0.0F)
        {
            this.destPos = 0.0F;
        }

        if (this.destPos > 1.0F)
        {
            this.destPos = 1.0F;
        }

        /*
        if (!this.onGround && this.field_70889_i < 1.0F)
        {
            this.field_70889_i = 1.0F;
        }
        */

        this.field_70889_i = (float)((double)this.field_70889_i * 0.9D);

        /*
        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }
        */

        if (this.onGround)
        {
        	//this.setJumping(true);
        	//this.motionY *= 0.3D;
        	//this.field_70889_i = 0.5F;
        }

        this.field_70886_e += this.field_70889_i * 2.0F;

        if (this.onGround && !this.isJumping)
        {
            this.jump2();
            this.jumpTicks2 = 5;
        	//this.setJumping(true);
        	//this.motionY *= 0.3D;
        	//this.field_70889_i = 0.5F;
        }else
        {
        	this.jumpTicks2 = 0;
        }

        /*
        if (!this.worldObj.isRemote && !this.isChild() && !this.func_152116_bZ() && --this.timeUntilNextEgg <= 0)
        {
            this.playSound("mob.chicken.plop", 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            this.dropItem(Items.egg, 1);
            this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
        }
        */

    }

    protected String getLivingSound()
    {
        return "mob.ghast.moan";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.ghast.scream";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.ghast.death";
    }

    protected Item getDropItem()
    {
        //return Items.feather;
    	return null;
    }

    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
    	this.dropItem(Item.getItemFromBlock(DCsAppleMilk.crowDoll), 1);
    }

    public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        return false;
    }


    protected void jump2()
    {
        this.motionY = 0.21999998688697815D;

        if (this.isPotionActive(Potion.jump))
        {
            this.motionY += (double)((float)(this.getActivePotionEffect(Potion.jump).getAmplifier() + 1) * 0.1F);
        }

        if (this.isSprinting())
        {
            float f = this.rotationYaw * 0.017453292F;
            this.motionX -= (double)(MathHelper.sin(f) * 0.2F);
            this.motionZ += (double)(MathHelper.cos(f) * 0.2F);
        }

        this.isAirBorne = true;
    }
}
