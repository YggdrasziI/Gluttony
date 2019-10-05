package fr.zilkoniss.gluttony.objects.items;

import fr.zilkoniss.gluttony.GluttonyMod;
import fr.zilkoniss.gluttony.init.ItemsMod;
import fr.zilkoniss.gluttony.util.interfaces.IHasModel;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class GluttonyItemFood extends ItemFood implements IHasModel
{

    public GluttonyItemFood(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(GluttonyMod.GLUTTONY);
        
        ItemsMod.ITEMS.add(this);
    }
    
    @Override
    public void registerModels() 
    {
        GluttonyMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}

