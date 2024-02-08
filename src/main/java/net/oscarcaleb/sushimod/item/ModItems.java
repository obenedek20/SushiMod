package net.oscarcaleb.sushimod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.oscarcaleb.sushimod.SushiMod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    //holds all items that we are going to register for our mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SushiMod.MOD_ID);

    //Adding the mod item "roe"
    public static final RegistryObject<Item> ROE = ITEMS.register("roe",
            () -> new Item(new Item.Properties()));

    //Adding the mod item "squid_meat"
    public static final RegistryObject<Item> SQUID_MEAT = ITEMS.register( "squid_meat",
            () -> new Item(new Item.Properties()));
    //deferred registers are long lists of items

    //adding an item
    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties())); //does not create texture, name, or add to creative mode tab
    public static final RegistryObject<Item> UNI = ITEMS.register("uni",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNA_PIECE = ITEMS.register("tuna_piece",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SALMON_PIECE = ITEMS.register("salmon_piece",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUSHI = ITEMS.register("sushi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
