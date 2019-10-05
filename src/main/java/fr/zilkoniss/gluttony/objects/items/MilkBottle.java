package fr.zilkoniss.gluttony.objects.items;

import fr.zilkoniss.gluttony.GluttonyMod;
import fr.zilkoniss.gluttony.init.ItemsMod;
import fr.zilkoniss.gluttony.util.interfaces.IHasModel;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class MilkBottle extends ItemFood implements IHasModel
{

    public MilkBottle(String name, int amount, float saturation, boolean isWolfFood)
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
        //if (!worldIn.isRemote) entityLiving.curePotionEffects(stack); // FORGE - move up so stack.shrink does not turn stack into air
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(Items.GLASS_BOTTLE);
    }
    
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
    
    @Override
    public void registerModels() 
    {
        GluttonyMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
