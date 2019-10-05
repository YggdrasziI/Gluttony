package fr.zilkoniss.gluttony.init;

import java.util.ArrayList;
import java.util.List;

import fr.zilkoniss.gluttony.GluttonyMod;
import fr.zilkoniss.gluttony.objects.items.ItemBase;
import fr.zilkoniss.gluttony.objects.items.ItemNatureSeeds;
import fr.zilkoniss.gluttony.objects.items.ItemRiceSeeds;
import fr.zilkoniss.gluttony.objects.items.ItemRyeSeeds;
import fr.zilkoniss.gluttony.objects.items.MilkBottle;
import fr.zilkoniss.gluttony.objects.items.GluttonyApple;
import fr.zilkoniss.gluttony.objects.items.GluttonyEssence;
import fr.zilkoniss.gluttony.objects.items.GluttonyItemFood;
import fr.zilkoniss.gluttony.objects.items.ItemSoySeeds;
import fr.zilkoniss.gluttony.objects.items.GluttonyItemSoup;
import fr.zilkoniss.gluttony.objects.items.GluttonyPotato1;
import fr.zilkoniss.gluttony.objects.items.GluttonyPotato10;
import fr.zilkoniss.gluttony.objects.items.GluttonyPotato2;
import fr.zilkoniss.gluttony.objects.items.GluttonyPotato3;
import fr.zilkoniss.gluttony.objects.items.GluttonyPotato4;
import fr.zilkoniss.gluttony.objects.items.GluttonyPotato5;
import fr.zilkoniss.gluttony.objects.items.GluttonyPotato6;
import fr.zilkoniss.gluttony.objects.items.GluttonyPotato7;
import fr.zilkoniss.gluttony.objects.items.GluttonyPotato8;
import fr.zilkoniss.gluttony.objects.items.GluttonyPotato9;
import fr.zilkoniss.gluttony.objects.items.ItemBarleySeeds;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemsMod
{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    
    //Seeds
    public static final Item SOY_SEEDS = new ItemSoySeeds("soy_seeds").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item RYE_SEEDS = new ItemRyeSeeds("rye_seeds").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item BARLEY_SEEDS = new ItemBarleySeeds("barley_seeds").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item RICE_SEEDS = new ItemRiceSeeds("rice_seeds").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item NATURE_SEEDS = new ItemNatureSeeds("nature_seeds").setCreativeTab(GluttonyMod.GLUTTONY);
    
    //Vegetables
    public static final Item SOYBEAN = new GluttonyItemFood("soybean", 2, 1.0F, true);
    public static final Item BARLEY = new ItemBase("barley").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item RYE = new ItemBase("rye").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item GARLIC = new ItemBase("garlic").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item ONION = new ItemBase("onion").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item RICE = new ItemBase("rice").setCreativeTab(GluttonyMod.GLUTTONY);
    
    //Ingredients
    public static final Item FLOUR = new ItemBase("flour").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item BUTTER = new ItemBase("butter").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item RYE_FLOUR = new ItemBase("rye_flour").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item SALT = new ItemBase("salt").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item COCOA_POWDER = new ItemBase("cocoa_powder").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item RICE_FLOUR = new ItemBase("rice_flour").setCreativeTab(GluttonyMod.GLUTTONY);
    
    //Food
    public static final Item COOKED_SOYBEAN = new GluttonyItemFood("cooked_soybean", 4, 5.0F, false);
    public static final Item COOKED_CARROT = new GluttonyItemFood("cooked_carrot", 3, 4.5F, false);
    public static final Item COOKED_APPLE = new GluttonyItemFood("cooked_apple", 3, 3.0F, false);
    public static final Item COOKED_CLOWNFISH = new GluttonyItemFood("cooked_clownfish", 5, 3.0F, false);
    public static final Item RYE_BREAD = new GluttonyItemFood("rye_bread", 7, 7.6F, false);
    public static final Item COOKED_BEETROOT = new GluttonyItemFood("cooked_beetroot", 3, 3.5F, false);
    public static final Item BUTTERED_BEEF = new GluttonyItemFood("buttered_beef", 4, 2.0F, false);
    public static final Item BUTTERED_PORKCHOP = new GluttonyItemFood("buttered_porkchop", 4, 2.0F, false);
    public static final Item BUTTERED_MUTTON = new GluttonyItemFood("buttered_mutton", 3, 1.5F, false);
    public static final Item GRILLED_BEEF = new GluttonyItemFood("grilled_beef", 10, 13.0F, false);
    public static final Item GRILLED_PORKCHOP = new GluttonyItemFood("grilled_porkchop", 10, 13.0F, false);
    public static final Item GRILLED_MUTTON = new GluttonyItemFood("grilled_mutton", 8, 10.0F, false);
    public static final Item PUMPKIN_SOUP = new GluttonyItemSoup("pumpkin_soup", 6, 7.2F, false);
    public static final Item CHICKEN_SOUP = new GluttonyItemSoup("chicken_soup", 8, 8.9F, false);
    public static final Item CHEESE = new GluttonyItemFood("cheese", 4, 4.5F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item JAMBON_FROMAGE = new GluttonyItemFood("jambonfromagesandwich", 9, 9.2F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item JAMBON_FROMAGE_SEIGLE = new GluttonyItemFood("jambonfromageseiglesandwich", 10, 8.7F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item CHOCOLATE_CAKE = new ItemBase("chocolate_cake").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item CHOCOLATE_CAKE_SLICE = new GluttonyItemFood("chocolate_cake_slice", 6, 11.7F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item CAKE_SLICE = new GluttonyItemFood("cake_slice", 6, 9.5F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item MILK_CHOCOLATE = new GluttonyItemFood("milk_chocolate", 8, 5.7F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item CHOCOLATE = new GluttonyItemFood("chocolate", 8, 3.1F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item APPLE_PIE = new GluttonyItemFood("apple_pie", 9, 10F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item APPLESAUCE = new GluttonyItemSoup("applesauce", 7, 3.3F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item CHOCOLATE_BREAD = new GluttonyItemFood("chocolate_bread", 8, 7.3F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item RICE_BREAD = new GluttonyItemFood("rice_bread", 6, 7.1F, false);
    public static final Item PURIFIED_FLESH = new GluttonyItemFood("purified_flesh", 3, 1.8F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item COOKED_FLESH = new GluttonyItemFood("cooked_flesh", 8,20F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item COOKED_RICE = new GluttonyItemFood("cooked_rice", 5,6.7F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    
    public static final Item NATURE_APPLE = new GluttonyApple("nature_apple", 8,10F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item LIFE_APPLE = new GluttonyApple("life_apple", 10,12F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item WORLD_APPLE = new GluttonyApple("world_apple", 12,14F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item UNIVERSE_APPLE = new GluttonyApple("universe_apple", 14,16F, false).setCreativeTab(GluttonyMod.GLUTTONY);
    
    //Drink
    public static final Item MILK_BOTTLE = new ItemBase("milk_bottle").setCreativeTab(GluttonyMod.GLUTTONY);
    public static final Item HOT_MILK_BOTTLE = new MilkBottle("hot_milk_bottle", 4, 1.9F, false);
    public static final Item CHOCOLATE_MILK_BOTTLE = new MilkBottle("chocolate_milk_bottle", 7, 2.7F, false);
    
    //Other
    public static final Item NATURE_ESSENCE = new GluttonyEssence("nature_essence", 1, 0F, false);
    public static final Item LIFE_ESSENCE = new GluttonyEssence("life_essence", 3, 1F, false);
    public static final Item WORLD_ESSENCE = new GluttonyEssence("world_essence", 5, 2F, false);
    public static final Item UNIVERSE_ESSENCE = new GluttonyEssence("universe_essence", 7, 3F, false);
    
    //Potato
    public static final Item BIG_POTATO = new GluttonyPotato1("big_potato", 2, 0.3F, false);
    public static final Item MASTER_POTATO = new GluttonyPotato2("master_potato", 3, 0.4F, false);
    public static final Item GRANDMASTER_POTATO = new GluttonyPotato3("grandmaster_potato", 4, 0.5F, false);
    public static final Item CHALLENGER_POTATO = new GluttonyPotato4("challenger_potato", 5, 0.6F, false);
    public static final Item GARGANTUA_POTATO = new GluttonyPotato5("gargantua_potato", 6, 0.7F, false);
    public static final Item TITAN_POTATO = new GluttonyPotato6("titan_potato", 7, 0.8F, false);
    public static final Item HALF_GOD_POTATO = new GluttonyPotato7("half_god_potato", 8, 0.9F, false);
    public static final Item GOD_POTATO = new GluttonyPotato8("god_potato", 9, 1.0F, false);
    public static final Item SECRET_POTATO = new GluttonyPotato9("secret_potato", 10, 1.1F, false);
    public static final Item STOP_IT_POTATO = new GluttonyPotato10("stop_it_potato", 100, 100F, false);
            
    //cp 5 6 - 1 0.2
}