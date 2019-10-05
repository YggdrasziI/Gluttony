package fr.zilkoniss.gluttony.objects.items;

import java.util.List;

import fr.zilkoniss.gluttony.GluttonyMod;
import fr.zilkoniss.gluttony.init.ItemsMod;
import fr.zilkoniss.gluttony.util.interfaces.IHasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GluttonyPotato3 extends ItemFood implements IHasModel
{

    public GluttonyPotato3(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(GluttonyMod.GLUTTONY);
        
        ItemsMod.ITEMS.add(this);
    }
    
    @Override
    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) 
    {
        tooltip.add("729 Potatoes");
        super.addInformation(stack, player, tooltip, advanced);
    }
    
    @Override
    public void registerModels() 
    {
        GluttonyMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}