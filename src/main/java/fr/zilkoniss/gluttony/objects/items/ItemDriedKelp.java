package fr.zilkoniss.gluttony.objects.items;

import fr.zilkoniss.gluttony.GluttonyMod;
import fr.zilkoniss.gluttony.init.ItemsMod;
import fr.zilkoniss.gluttony.util.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemDriedKelp extends Item implements IHasModel
{
    public ItemDriedKelp(String name) 
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        
        ItemsMod.ITEMS.add(this);
    }

    @Override
    public void registerModels() 
    {
        GluttonyMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}