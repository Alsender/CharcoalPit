package charcoalPit.blocks;

import charcoalPit.tile.TileCreosoteCollector;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCreosoteCollector extends BlockBase implements ITileEntityProvider{

	public final Boolean refractory;
	public BlockCreosoteCollector(String name,boolean fire) {
		super(Material.ROCK, name);
		refractory=fire;
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(CreativeTabs.MISC);
		setHardness(2);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileCreosoteCollector();
	}

}
