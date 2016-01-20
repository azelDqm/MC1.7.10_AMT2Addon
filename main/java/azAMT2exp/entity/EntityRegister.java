package azAMT2exp.entity;

import azAMT2exp.AMT2expCore;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityRegister {

	private int idxID = 1;

	public EntityRegister()
	{
		EntityRegistry.registerModEntity(EntityACrowDoll.class, "EntityACrowDoll", idxID + 1, AMT2expCore.instance, 250, 1, false);
	}
}
