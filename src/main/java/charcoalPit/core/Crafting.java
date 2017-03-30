package charcoalPit.core;

import charcoalPit.blocks.BlocksRegistry;
import charcoalPit.items.ItemsRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Crafting {
	
	public static void registerRecipes(){
		GameRegistry.addRecipe(new ShapedOreRecipe(BlocksRegistry.LogPile, new Object[]{
				"LLL",
				"LLL",
				"LLL",
				'L',"logWood"
		}));
		GameRegistry.addRecipe(new ShapedOreRecipe(BlocksRegistry.StoneCollector, new Object[]{
				"M M",
				"MBM",
				"MMM",
				'M',Blocks.STONEBRICK,
				'B',Items.BUCKET
		}));
		GameRegistry.addRecipe(new ShapedOreRecipe(BlocksRegistry.BrickCollector, new Object[]{
				"M M",
				"MBM",
				"MMM",
				'M',"ingotBrick",
				'B',Items.BUCKET
		}));
		GameRegistry.addRecipe(new ShapedOreRecipe(BlocksRegistry.NetherCollector, new Object[]{
				"M M",
				"MBM",
				"MMM",
				'M',"ingotBrickNether",
				'B',Items.BUCKET
		}));
		GameRegistry.addRecipe(new ShapedOreRecipe(BlocksRegistry.CokeBlock, new Object[]{
				"CCC",
				"CCC",
				"CCC",
				'C',"fuelCoke"
		}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemsRegistry.coke.getItem(), 9, ItemsRegistry.coke.getItemDamage()), new Object[]{
				"B",
				'B',BlocksRegistry.CokeBlock
		}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemsRegistry.Fertilizer, 2), new Object[]{
				Items.ROTTEN_FLESH,"dustAsh","dustAsh","dustAsh","dustAsh"
		}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemsRegistry.Fertilizer, 2), new Object[]{
				"dirt","dustAsh","dustAsh","dustAsh","dustAsh"
		}));
	}
}
