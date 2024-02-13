package net.oscarcaleb.sushimod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.oscarcaleb.sushimod.SushiMod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.oscarcaleb.sushimod.block.ModBlocks;


public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SushiMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SUSHI_TAB = CREATIVE_MODE_TABS.register("sushi_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RICE.get()))
                    .title(Component.translatable("creativetab.sushi_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //ITEMS
                        pOutput.accept(ModItems.RICE.get());
                        pOutput.accept(ModItems.UNI.get()); //only need .get() for custom items
                        pOutput.accept(ModItems.SALMON_PIECE.get());
                        pOutput.accept(ModItems.TUNA_PIECE.get());
                        pOutput.accept(ModItems.SUSHI.get());
                        pOutput.accept(ModItems.AVOCADO.get());
                        pOutput.accept(ModItems.ROE.get());
                        pOutput.accept(ModItems.SQUID_MEAT.get());


                        //BLOCKS
                        pOutput.accept(ModBlocks.SUSHI_TABLE.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
