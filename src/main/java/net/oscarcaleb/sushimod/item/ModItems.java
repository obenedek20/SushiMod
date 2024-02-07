package net.oscarcaleb.sushimod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.oscarcaleb.sushimod.SushiMod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    //holds all items that we are going to register for our mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SushiMod.MOD_ID);
    //deferred registers are long lists of items
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
