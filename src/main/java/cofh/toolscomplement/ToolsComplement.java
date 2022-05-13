package cofh.toolscomplement;

import cofh.lib.util.DeferredRegisterCoFH;
import cofh.toolscomplement.init.TComConfig;
import cofh.toolscomplement.init.TComItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static cofh.lib.util.constants.Constants.ID_TOOLS_COMPLEMENT;

@Mod (ID_TOOLS_COMPLEMENT)
public class ToolsComplement {

    public static final Logger LOG = LogManager.getLogger(ID_TOOLS_COMPLEMENT);
    // public static final ConfigManager CONFIG_MANAGER = new ConfigManager();

    public static final DeferredRegisterCoFH<Item> ITEMS = DeferredRegisterCoFH.create(ForgeRegistries.ITEMS, ID_TOOLS_COMPLEMENT);

    public static CreativeModeTab itemGroup;

    public ToolsComplement() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        //        CONFIG_MANAGER.register(modEventBus)
        //                .addServerConfig(new ArmorConfigGroup())
        //                .addServerConfig(new ToolConfigGroup());

        ITEMS.register(modEventBus);

        TComConfig.register();

        TComItems.register();
    }

    // region INITIALIZATION
    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void clientSetup(final FMLClientSetupEvent event) {

        event.enqueueWork(() -> {
            if (TComConfig.enableCreativeTab.get()) {
                itemGroup = new CreativeModeTab(-1, ID_TOOLS_COMPLEMENT) {

                    @Override
                    @OnlyIn (Dist.CLIENT)
                    public ItemStack makeIcon() {

                        return new ItemStack(ITEMS.get("diamond_sickle"));
                    }
                };
            }
        });
    }
    // endregion
}
