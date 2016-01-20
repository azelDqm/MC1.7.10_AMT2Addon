package azAMT2exp.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import azAMT2exp.entity.model.ModelCrowEntity;

public class RenderCrowEntity extends RenderLiving
{
	private float scale = 1.0F;
	/*
	 * テクスチャへのResourceLocationを設定する.
	 */
	//private static final ResourceLocation MobTexture = new ResourceLocation("amt2exp:textures/entity/crowdoll.png");
	private static final ResourceLocation MobTexture = new ResourceLocation("defeatedcrow:textures/entity/crowdoll.png");

	public RenderCrowEntity()
	{
		/*
		 * スーパークラスのコンストラクタの引数は
		 * (このRenderと紐付けするModel, このRenderを使うEntityの足元の影の大きさ)
		 */
		super(new ModelCrowEntity(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1EntityLiving) {
		// TODO 自動生成されたメソッド・スタブ
		//return null;
		return this.MobTexture;
	}


    protected void preRenderScale(EntityLivingBase par1Entity, float par2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2)
    {
        this.preRenderScale(par1EntityLiving, par2);
    }
}
