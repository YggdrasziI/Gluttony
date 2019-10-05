package fr.zilkoniss.gluttony.objects.blocks;

import fr.zilkoniss.gluttony.init.BlocksMod;
import fr.zilkoniss.gluttony.init.ItemsMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockNaturePlant extends BlockCrops
{
    private static final AxisAlignedBB[] nature = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
    
    public BlockNaturePlant(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        
        BlocksMod.BLOCKS.add(this);
        ItemsMod.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(!worldIn.isRemote)
        {
            if(this.isMaxAge(state))
            {
                worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemsMod.NATURE_ESSENCE, 1)));
                worldIn.setBlockState(pos, this.withAge(0));
                return true;
            }
        }
        
        return false;
        
    }
    
    @Override
    protected Item getSeed()
    {
        return ItemsMod.NATURE_SEEDS;
    }
    
    @Override
    protected Item getCrop()
    {
        return ItemsMod.NATURE_ESSENCE;
    }
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return nature[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    }
}
