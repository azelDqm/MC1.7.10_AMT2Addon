package azAMT2exp.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrowEntity extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer hip;
    ModelRenderer tail;
    ModelRenderer top;
    ModelRenderer wingL;
    ModelRenderer wingR;
    ModelRenderer mouth;
    ModelRenderer legR;
    ModelRenderer legL;
    ModelRenderer clawL;
    ModelRenderer clawL1;
    ModelRenderer clawL2;
    ModelRenderer clawR;
    ModelRenderer clawR1;
    ModelRenderer clawR2;

  public ModelCrowEntity()
  {
    textureWidth = 64;
    textureHeight = 32;

      body = new ModelRenderer(this, 0, 10);
      body.addBox(-3.5F, 3F, -2.8F, 7, 3, 6);
      body.setRotationPoint(0F, 16F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      neck = new ModelRenderer(this, 0, 10);
      neck.addBox(-3F, 2F, -2.7F, 6, 1, 5);
      neck.setRotationPoint(0F, 16F, 0F);
      neck.setTextureSize(64, 32);
      neck.mirror = true;
      setRotation(neck, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 20);
      head.addBox(-2.5F, -1F, -2.5F, 5, 3, 4);
      head.setRotationPoint(0F, 16F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      hip = new ModelRenderer(this, 0, 10);
      hip.addBox(-3F, 3F, 3F, 6, 2, 1);
      hip.setRotationPoint(0F, 16F, 0F);
      hip.setTextureSize(64, 32);
      hip.mirror = true;
      setRotation(hip, 0F, 0F, 0F);
      tail = new ModelRenderer(this, 20, 20);
      tail.addBox(-2F, 4F, 2F, 4, 1, 4);
      tail.setRotationPoint(0F, 16F, 0F);
      tail.setTextureSize(64, 32);
      tail.mirror = true;
      setRotation(tail, 0.2268928F, 0F, 0F);
      top = new ModelRenderer(this, 0, 10);
      top.addBox(-2F, 2.5F, -2F, 4, 1, 4);
      top.setRotationPoint(0F, 12F, 0F);
      top.setTextureSize(64, 32);
      top.mirror = true;
      setRotation(top, 0F, 0F, 0F);
      wingL = new ModelRenderer(this, 0, 10);
      wingL.addBox(-2F, 0F, 0F, 4, 1, 3);
      wingL.setRotationPoint(3.5F, 18F, -0.5F);
      wingL.setTextureSize(64, 32);
      wingL.mirror = true;
      setRotation(wingL, -1.396263F, 1.570796F, 0F);
      wingR = new ModelRenderer(this, 0, 10);
      wingR.addBox(-2F, 0F, 0F, 4, 1, 3);
      wingR.setRotationPoint(-3.5F, 18F, 0F);
      wingR.setTextureSize(64, 32);
      wingR.mirror = true;
      setRotation(wingR, -1.396263F, -1.570796F, 0F);
      mouth = new ModelRenderer(this, 34, 0);
      mouth.addBox(-1F, 1F, -3.5F, 2, 1, 1);
      mouth.setRotationPoint(0F, 16F, 0F);
      mouth.setTextureSize(64, 32);
      mouth.mirror = true;
      setRotation(mouth, 0F, 0F, 0F);
      legR = new ModelRenderer(this, 34, 3);
      legR.addBox(-1.5F, 6F, -1F, 1, 1, 1);
      legR.setRotationPoint(0F, 16F, 0F);
      legR.setTextureSize(64, 32);
      legR.mirror = true;
      setRotation(legR, 0F, 0F, 0F);
      legL = new ModelRenderer(this, 34, 3);
      legL.addBox(0.5F, 6F, -1F, 1, 1, 1);
      legL.setRotationPoint(0F, 16F, 0F);
      legL.setTextureSize(64, 32);
      legL.mirror = true;
      setRotation(legL, 0F, 0F, 0F);
      legL.mirror = false;
      clawL = new ModelRenderer(this, 10, 0);
      clawL.addBox(0.5F, 7F, -1F, 1, 1, 2);
      clawL.setRotationPoint(0F, 16F, 0F);
      clawL.setTextureSize(64, 32);
      clawL.mirror = true;
      setRotation(clawL, 0F, 0F, 0F);
      clawL1 = new ModelRenderer(this, 10, 0);
      clawL1.addBox(-0.6F, 0F, -0.5F, 1, 1, 2);
      clawL1.setRotationPoint(1F, 23F, -0.5F);
      clawL1.setTextureSize(64, 32);
      clawL1.mirror = true;
      setRotation(clawL1, 0F, 2.96706F, -0.0069813F);
      clawL2 = new ModelRenderer(this, 10, 0);
      clawL2.addBox(-0.4F, 0F, -0.5F, 1, 1, 2);
      clawL2.setRotationPoint(1F, 23F, -0.5F);
      clawL2.setTextureSize(64, 32);
      clawL2.mirror = true;
      setRotation(clawL2, 0F, -2.96706F, 0F);
      clawR = new ModelRenderer(this, 10, 0);
      clawR.addBox(-1.5F, 7F, -1F, 1, 1, 2);
      clawR.setRotationPoint(0F, 16F, 0F);
      clawR.setTextureSize(64, 32);
      clawR.mirror = true;
      setRotation(clawR, 0F, 0F, 0F);
      clawR1 = new ModelRenderer(this, 10, 0);
      clawR1.addBox(-0.6F, 0F, -0.5F, 1, 1, 2);
      clawR1.setRotationPoint(-1F, 23F, -0.5F);
      clawR1.setTextureSize(64, 32);
      clawR1.mirror = true;
      setRotation(clawR1, 0F, 2.96706F, 0F);
      clawR2 = new ModelRenderer(this, 10, 0);
      clawR2.addBox(-0.4F, 0F, -0.5F, 1, 1, 2);
      clawR2.setRotationPoint(-1F, 23F, -0.5F);
      clawR2.setTextureSize(64, 32);
      clawR2.mirror = true;
      setRotation(clawR2, 0F, -2.96706F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    body.render(f5);
    neck.render(f5);
    head.render(f5);
    hip.render(f5);
    tail.render(f5);
    top.render(f5);
    wingL.render(f5);
    wingR.render(f5);
    mouth.render(f5);
    legR.render(f5);
    legL.render(f5);
    clawL.render(f5);
    clawL1.render(f5);
    clawL2.render(f5);
    clawR.render(f5);
    clawR1.render(f5);
    clawR2.render(f5);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
