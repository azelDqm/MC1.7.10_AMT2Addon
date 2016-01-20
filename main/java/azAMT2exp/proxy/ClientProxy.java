package azAMT2exp.proxy;

import java.io.File;

import net.minecraft.client.Minecraft;
import azAMT2exp.entity.EntityRegister;
import azAMT2exp.entity.RenderingRegister;
import cpw.mods.fml.common.network.IGuiHandler;

public class ClientProxy extends CommonProxy implements IGuiHandler {

	@Override
	public File getDir()
	{
		return Minecraft.getMinecraft().mcDataDir;
	}

    public void registers()
    {
    	new EntityRegister();
    	new RenderingRegister();

    }
}
