package fr.zilkoniss.gluttony.objects.blocks;

import fr.zilkoniss.gluttony.GluttonyMod;
import fr.zilkoniss.gluttony.init.BlocksMod;
import fr.zilkoniss.gluttony.init.ItemsMod;
import fr.zilkoniss.gluttony.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockKelp extends Block implements IHasModel
{
    public BlockKelp(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        this.setSoundType(SoundType.PLANT);
        
        BlocksMod.BLOCKS.add(this);
        ItemsMod.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
    }
    
    @Override
    public void registerModels() 
    {
        GluttonyMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}

