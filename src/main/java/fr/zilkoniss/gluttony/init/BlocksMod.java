package fr.zilkoniss.gluttony.init;

import java.util.ArrayList;
import java.util.List;

import fr.zilkoniss.gluttony.objects.blocks.BlockAboveWaterKelpPlant;
import fr.zilkoniss.gluttony.objects.blocks.BlockBarleyPlant;
import fr.zilkoniss.gluttony.objects.blocks.BlockBase;
import fr.zilkoniss.gluttony.objects.blocks.BlockKelp;
import fr.zilkoniss.gluttony.objects.blocks.BlockRicePlant;
import fr.zilkoniss.gluttony.objects.blocks.BlockRyePlant;
import fr.zilkoniss.gluttony.objects.blocks.BlockSalt;
import fr.zilkoniss.gluttony.objects.blocks.BlockSoyPlant;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlocksMod
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    
    //Plant
    public static final Block RYE_PLANT = new BlockRyePlant("rye_plant");
    public static final Block SOY_PLANT = new BlockSoyPlant("soy_plant");
    public static final Block BARLEY_PLANT = new BlockBarleyPlant("barley_plant");
    public static final Block RICE_PLANT = new BlockRicePlant("rice_plant");
    public static final Block ABOVEWATER_KELP_PLANT = new BlockAboveWaterKelpPlant("abovewater_kelp_plant");
    
    public static final Block SALT_BLOCK = new BlockSalt("salt_block", Material.SAND).setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setHardness(0.3F).setResistance(0.5F);
    public static final Block DRIED_KELP = new BlockKelp("dried_kelp_block", Material.PLANTS).setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setHardness(1.0F).setResistance(5.0F);
}
