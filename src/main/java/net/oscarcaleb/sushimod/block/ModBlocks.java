package net.oscarcaleb.sushimod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oscarcaleb.sushimod.SushiMod;
import net.minecraft.world.item.Item;
import net.oscarcaleb.sushimod.item.ModItems;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SushiMod.MOD_ID);

    //add second block by just making new RegistryObject and add to creativemode tab, and add new json files
    public static final RegistryObject<Block> SUSHI_TABLE = registerBlock("sushi_table",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE))); //instead of .copy, can do .of() to make own block

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block); //registers block
        registerBlockItem(name, toReturn); //registers block item
        return toReturn;
    }

    //associates Item with block through helper method
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
