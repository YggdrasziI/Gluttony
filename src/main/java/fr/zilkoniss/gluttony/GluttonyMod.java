package fr.zilkoniss.gluttony;

import java.util.Random;

import fr.zilkoniss.gluttony.creativetabs.Gluttony;
import fr.zilkoniss.gluttony.init.ItemsMod;
import fr.zilkoniss.gluttony.proxy.CommonProxy;
import fr.zilkoniss.gluttony.util.Reference;
import fr.zilkoniss.gluttony.util.handlers.RecipeHandler;
import fr.zilkoniss.gluttony.util.handlers.RegistryHandler;
import fr.zilkoniss.gluttony.util.handlers.SeedHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class GluttonyMod 
{
    @Instance
    public static GluttonyMod instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    public static final CreativeTabs GLUTTONY = new Gluttony("gluttony");

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) 
    {
        RegistryHandler.preInitRegistries();
    }
    
    @EventHandler
    public static void init(FMLInitializationEvent event) 
    {
        RecipeHandler.init();
        SeedHandler.init();
    }
    
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) 
    {
        
    }
}