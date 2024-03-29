package fr.zilkoniss.gluttony.util.handlers;

import fr.zilkoniss.gluttony.init.BlocksMod;
import fr.zilkoniss.gluttony.init.ItemsMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler
{
    public static void registerOreDictionary()
    {
        OreDictionary.registerOre("planks", Blocks.PLANKS);
        OreDictionary.registerOre("coal", Items.COAL);
        OreDictionary.registerOre("dustRedstone", Items.REDSTONE);
        OreDictionary.registerOre("ingotIron", Items.IRON_INGOT);
        OreDictionary.registerOre("ingotGold", Items.GOLD_INGOT);
        OreDictionary.registerOre("gemDiamond", Items.DIAMOND);
        OreDictionary.registerOre("gemEmerald", Items.EMERALD);
        
        OreDictionary.registerOre("oreCoal", Blocks.COAL_ORE);
        OreDictionary.registerOre("oreIron", Blocks.IRON_ORE);
        OreDictionary.registerOre("oreGold", Blocks.GOLD_ORE);
        OreDictionary.registerOre("oreRedstone", Blocks.REDSTONE_ORE);
        OreDictionary.registerOre("oreDiamond", Blocks.DIAMOND_ORE);
        OreDictionary.registerOre("oreLapis", Blocks.LAPIS_ORE);
        OreDictionary.registerOre("oreEmerald", Blocks.EMERALD_ORE);
        
        OreDictionary.registerOre("foodFlour", ItemsMod.FLOUR);
        OreDictionary.registerOre("foodFlour", ItemsMod.RYE_FLOUR);
        OreDictionary.registerOre("foodRyeFlour", ItemsMod.RYE_FLOUR);
        OreDictionary.registerOre("foodFlour", ItemsMod.RICE_FLOUR);
        OreDictionary.registerOre("foodRiceFlour", ItemsMod.RICE_FLOUR);
        
        OreDictionary.registerOre("seedAbovewaterkelp", ItemsMod.ABOVEWATER_KELP_SEEDS);
        OreDictionary.registerOre("listAllseed", ItemsMod.ABOVEWATER_KELP_SEEDS);
        OreDictionary.registerOre("foodApplepie", ItemsMod.APPLE_PIE);
        OreDictionary.registerOre("foodApplesauce", ItemsMod.APPLESAUCE);
        OreDictionary.registerOre("cropBarley", ItemsMod.BARLEY);
        OreDictionary.registerOre("listAllgrain", ItemsMod.BARLEY);
        OreDictionary.registerOre("seedBarley", ItemsMod.BARLEY_SEEDS);
        OreDictionary.registerOre("listAllseed", ItemsMod.BARLEY_SEEDS);
        OreDictionary.registerOre("foodButter", ItemsMod.BUTTER);
        OreDictionary.registerOre("foodButteredbeef", ItemsMod.BUTTERED_BEEF);
        OreDictionary.registerOre("foodButteredmutton", ItemsMod.BUTTERED_MUTTON);
        OreDictionary.registerOre("foodButteredporkchop", ItemsMod.BUTTERED_PORKCHOP);
        OreDictionary.registerOre("foodCakeSlice", ItemsMod.CAKE_SLICE);
        OreDictionary.registerOre("foodCheese", ItemsMod.CHEESE);
        OreDictionary.registerOre("foodChickensoup", ItemsMod.CHICKEN_SOUP);
        OreDictionary.registerOre("foodChocolate", ItemsMod.CHOCOLATE);
        OreDictionary.registerOre("foodChocolatebread", ItemsMod.CHOCOLATE_BREAD);
        OreDictionary.registerOre("foodChocolatecake", ItemsMod.CHOCOLATE_CAKE);
        OreDictionary.registerOre("foodChocolatecakeslice", ItemsMod.CHOCOLATE_CAKE_SLICE);
        OreDictionary.registerOre("foodChocolatemilkbottle", ItemsMod.CHOCOLATE_MILK_BOTTLE);
        OreDictionary.registerOre("dustCocoa", ItemsMod.COCOA_POWDER);
        OreDictionary.registerOre("dyeBrown", ItemsMod.COCOA_POWDER);
        OreDictionary.registerOre("foodCookedapple", ItemsMod.COOKED_APPLE);
        OreDictionary.registerOre("foodApplecooked", ItemsMod.COOKED_APPLE);
        OreDictionary.registerOre("foodCookedbeetroot", ItemsMod.COOKED_BEETROOT);
        OreDictionary.registerOre("foodBeetrootcooked", ItemsMod.COOKED_BEETROOT);
        OreDictionary.registerOre("foodCookedcarrot", ItemsMod.COOKED_CARROT);
        OreDictionary.registerOre("foodCarrotcooked", ItemsMod.COOKED_CARROT);
        OreDictionary.registerOre("foodCookedclownfish", ItemsMod.COOKED_CLOWNFISH);
        OreDictionary.registerOre("foodClownfishcooked", ItemsMod.COOKED_CLOWNFISH);
        OreDictionary.registerOre("foodCookedfish", ItemsMod.COOKED_CLOWNFISH);
        OreDictionary.registerOre("foodFishcooked", ItemsMod.COOKED_CLOWNFISH);
        OreDictionary.registerOre("foodCookedflesh", ItemsMod.COOKED_FLESH);
        OreDictionary.registerOre("foodFleshCooked", ItemsMod.COOKED_FLESH);
        OreDictionary.registerOre("foodCookedrice", ItemsMod.COOKED_RICE);
        OreDictionary.registerOre("foodRicecooked", ItemsMod.COOKED_RICE);
        OreDictionary.registerOre("foodCookedsoybean", ItemsMod.COOKED_SOYBEAN);
        OreDictionary.registerOre("foodSoybeancooked", ItemsMod.COOKED_SOYBEAN);
        OreDictionary.registerOre("itemDriedkelp", ItemsMod.DRIED_KELP);
        OreDictionary.registerOre("blockDriedkelp", BlocksMod.DRIED_KELP);
        OreDictionary.registerOre("cropGarlic", ItemsMod.GARLIC);
        OreDictionary.registerOre("foodGrilledbeef", ItemsMod.GRILLED_BEEF);
        OreDictionary.registerOre("foodBeefgrilled", ItemsMod.GRILLED_BEEF);
        OreDictionary.registerOre("foodGrilledmutton", ItemsMod.GRILLED_MUTTON);
        OreDictionary.registerOre("foodMuttongrilled", ItemsMod.GRILLED_MUTTON);
        OreDictionary.registerOre("foodGrilledporkchop", ItemsMod.GRILLED_PORKCHOP);
        OreDictionary.registerOre("foodPorkchopgrilled", ItemsMod.GRILLED_PORKCHOP);
        OreDictionary.registerOre("foodHotmilkbottle", ItemsMod.HOT_MILK_BOTTLE);
        OreDictionary.registerOre("foodJambonfromagesandwich", ItemsMod.JAMBON_FROMAGE);
        OreDictionary.registerOre("foodJambonfromageseiglesandwich", ItemsMod.JAMBON_FROMAGE_SEIGLE);
        OreDictionary.registerOre("cropKelp", ItemsMod.KELP);
        OreDictionary.registerOre("listAllveggie", ItemsMod.KELP);
        OreDictionary.registerOre("itemKelpbottle", ItemsMod.KELP_BOTTLE);
        OreDictionary.registerOre("listAllmilk", ItemsMod.MILK_BOTTLE);
        OreDictionary.registerOre("foodChocolatemilk", ItemsMod.MILK_CHOCOLATE);
        OreDictionary.registerOre("foodMilkchocolate", ItemsMod.MILK_CHOCOLATE);
        OreDictionary.registerOre("cropOnion", ItemsMod.ONION);
        OreDictionary.registerOre("listAllveggie", ItemsMod.ONION);
        OreDictionary.registerOre("foodPumpkinsoup", ItemsMod.PUMPKIN_SOUP);
        OreDictionary.registerOre("foodPurifiedflesh", ItemsMod.PURIFIED_FLESH);
        OreDictionary.registerOre("cropRice", ItemsMod.RICE);
        OreDictionary.registerOre("foodRiceBread", ItemsMod.RICE_BREAD);
        OreDictionary.registerOre("seedRice", ItemsMod.RICE_SEEDS);
        OreDictionary.registerOre("listAllseed", ItemsMod.RICE_SEEDS);
        OreDictionary.registerOre("cropRye", ItemsMod.RYE);
        OreDictionary.registerOre("listAllgrain", ItemsMod.RYE);
        OreDictionary.registerOre("foodRyebread", ItemsMod.RYE_BREAD);
        OreDictionary.registerOre("seedRye", ItemsMod.RYE_SEEDS);
        OreDictionary.registerOre("listAllseed", ItemsMod.RYE_SEEDS);
        OreDictionary.registerOre("dustSalt", ItemsMod.SALT);
        OreDictionary.registerOre("foodSalt", ItemsMod.SALT);
        OreDictionary.registerOre("itemSalt", ItemsMod.SALT);
        OreDictionary.registerOre("blockSalt", BlocksMod.SALT_BLOCK);
        OreDictionary.registerOre("seedSoy", ItemsMod.SOY_SEEDS);
        OreDictionary.registerOre("listAllseed", ItemsMod.SOY_SEEDS);
        OreDictionary.registerOre("cropSoy", ItemsMod.SOYBEAN);
        OreDictionary.registerOre("cropSoybean", ItemsMod.SOYBEAN);
        OreDictionary.registerOre("itemVegetablegelatin", ItemsMod.VEGETABLE_GELATIN);
    }
}
