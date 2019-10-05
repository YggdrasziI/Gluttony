package fr.zilkoniss.gluttony.creativetabs;

import fr.zilkoniss.gluttony.init.BlocksMod;
import fr.zilkoniss.gluttony.init.ItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Gluttony extends CreativeTabs
{
    public Gluttony(String label)
    { 
        super("gluttony"); 
    }
    
    public ItemStack getTabIconItem() 
    { 
        return new ItemStack(ItemsMod.CHOCOLATE_CAKE);
    }
}