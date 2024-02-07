package net.oscarcaleb.sushimod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.oscarcaleb.sushimod.SushiMod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    //holds all items that we are going to register for our mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SushiMod.MOD_ID);
    //deferred registers are long lists of items

    //adding an item
    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties())); //does not create texture, name, or add to creative mode tab

    public static final RegistryObject<Item> DRIED_SEAWEED = ITEMS.register("dried_seaweed",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
