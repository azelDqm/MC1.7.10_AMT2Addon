package azAMT2exp.entity;

import azAMT2exp.entity.render.RenderCrowEntity;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderingRegister {


	public RenderingRegister()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityACrowDoll.class, new RenderCrowEntity());
	}
}
