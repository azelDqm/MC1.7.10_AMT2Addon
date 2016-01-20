package azAMT2exp;

import net.minecraftforge.common.MinecraftForge;
import azAMT2exp.handler.PlayerEventHandler;
import azAMT2exp.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "AppleMilkExp", name = "AppleMilkExpansion", version = "1.0.0", useMetadata = true, dependencies = "after:DCsAppleMilk")
public class AMT2expCore {

	@SidedProxy(clientSide = "azAMT2exp.proxy.ClientProxy", serverSide = "azAMT2exp.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Instance("AppleMilkExp")
	public static AMT2expCore instance;

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registers();

		MinecraftForge.EVENT_BUS.register(new PlayerEventHandler());
	}
}
