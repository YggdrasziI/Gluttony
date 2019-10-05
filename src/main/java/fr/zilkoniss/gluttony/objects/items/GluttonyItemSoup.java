package fr.zilkoniss.gluttony.objects.items;

import java.util.List;

import fr.zilkoniss.gluttony.GluttonyMod;
import fr.zilkoniss.gluttony.init.ItemsMod;
import fr.zilkoniss.gluttony.util.interfaces.IHasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GluttonyItemSoup extends ItemFood implements IHasModel
{

    public GluttonyItemSoup(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(1);
        setCreativeTab(GluttonyMod.GLUTTONY);
        
        ItemsMod.ITEMS.add(this);
    }
    
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(Items.BOWL);
    }
    
    @Override
    public void registerModels() 
    {
        GluttonyMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
