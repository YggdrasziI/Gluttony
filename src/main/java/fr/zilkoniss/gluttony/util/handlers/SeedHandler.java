package fr.zilkoniss.gluttony.util.handlers;

import fr.zilkoniss.gluttony.init.ItemsMod;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SeedHandler
{
    public static void init()
    {
        MinecraftForge.addGrassSeed(new ItemStack(ItemsMod.BARLEY_SEEDS, 1), 8);
        MinecraftForge.addGrassSeed(new ItemStack(ItemsMod.RICE_SEEDS, 1), 8);
        MinecraftForge.addGrassSeed(new ItemStack(ItemsMod.RYE_SEEDS, 1), 8);
        MinecraftForge.addGrassSeed(new ItemStack(ItemsMod.SOY_SEEDS, 1), 8);
        MinecraftForge.addGrassSeed(new ItemStack(ItemsMod.RICE_SEEDS, 1), 8);
        MinecraftForge.addGrassSeed(new ItemStack(ItemsMod.NATURE_ESSENCE, 1), 1);
    }
}
