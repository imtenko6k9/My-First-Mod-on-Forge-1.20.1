package net.yandex.firstmod.item;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yandex.firstmod.FirstMod;
import net.yandex.firstmod.block.ModBlock;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FIRST_MOD_TABS = CREATIVE_MOD_TABS.register("first_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.first_mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItem.SAPPHIRE.get());
                        pOutput.accept(ModItem.SAPPHIRE_INGGOT.get());
                        pOutput.accept(ModBlock.SAPPHIRE_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
