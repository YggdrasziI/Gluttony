package fr.zilkoniss.gluttony.util.handlers;

import fr.zilkoniss.gluttony.init.ItemsMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler
{
    public static void init()
    {
        GameRegistry.addSmelting(ItemsMod.FLOUR, new ItemStack(Items.BREAD, 1), 0.2F);
        GameRegistry.addSmelting(ItemsMod.RYE_FLOUR, new ItemStack(ItemsMod.RYE_BREAD, 1), 0.2F);
        GameRegistry.addSmelting(ItemsMod.RICE_FLOUR, new ItemStack(ItemsMod.RICE_BREAD, 1), 0.2F);
        GameRegistry.addSmelting(Items.BEETROOT, new ItemStack(ItemsMod.COOKED_BEETROOT, 1), 0.2F);
        GameRegistry.addSmelting(ItemsMod.COOKED_BEETROOT, new ItemStack(Items.SUGAR, 8), 0.3F);
        GameRegistry.addSmelting(ItemsMod.BUTTERED_BEEF, new ItemStack(ItemsMod.GRILLED_BEEF, 1), 1.0F);
        GameRegistry.addSmelting(ItemsMod.BUTTERED_PORKCHOP, new ItemStack(ItemsMod.GRILLED_PORKCHOP, 1), 1.0F);
        GameRegistry.addSmelting(ItemsMod.BUTTERED_MUTTON, new ItemStack(ItemsMod.GRILLED_MUTTON, 1), 0.8F);
        GameRegistry.addSmelting(ItemsMod.MILK_BOTTLE, new ItemStack(ItemsMod.HOT_MILK_BOTTLE, 1), 1.5F);
        GameRegistry.addSmelting(ItemsMod.PURIFIED_FLESH, new ItemStack(ItemsMod.COOKED_FLESH, 1), 0.7F);
        GameRegistry.addSmelting(ItemsMod.RICE, new ItemStack(ItemsMod.COOKED_RICE, 1), 0.3F);
        GameRegistry.addSmelting(ItemsMod.COOKED_RICE, new ItemStack(Items.SLIME_BALL, 1), 0.4F);
        GameRegistry.addSmelting(ItemsMod.SOYBEAN, new ItemStack(ItemsMod.COOKED_SOYBEAN, 1), 0.4F);
        GameRegistry.addSmelting(Items.CARROT, new ItemStack(ItemsMod.COOKED_CARROT, 1), 0.4F);
        GameRegistry.addSmelting(Items.APPLE, new ItemStack(ItemsMod.COOKED_APPLE, 1), 0.4F);
        GameRegistry.addSmelting(ItemsMod.KELP, new ItemStack(ItemsMod.DRIED_KELP, 1), 0.1F);
        GameRegistry.addSmelting(ItemsMod.KELP_BOTTLE, new ItemStack(ItemsMod.VEGETABLE_GELATIN, 1), 0.5F);
    }
}
